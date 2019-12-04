package com.iiddd.controller;

import com.iiddd.enums.Configurations;
import com.iiddd.enums.Statuses;
import com.iiddd.models.SensorDataResponse;
import com.iiddd.models.StateData;
import com.iiddd.models.StateDataResponse;
import com.iiddd.service.WateringConfigurationService;
import com.iiddd.utils.SensorDataUtils;
import com.iiddd.utils.WaterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class WaterDataController {

    @Autowired
    WateringConfigurationService wateringConfigurationService;

    @RequestMapping(method = RequestMethod.POST, value = "/watering/update")
    @ResponseBody
    public StateDataResponse updateState(@RequestBody StateData stateData) {
        wateringConfigurationService.setConfigurationEntity(Configurations.AUTOMATION_STATUS, String.valueOf(stateData.isAutomationStatus()));
        if (stateData.isWaterSmallNow()) {
            WaterUtils.waterSmall();
        }
        if (stateData.isWaterMediumNow()) {
            WaterUtils.waterMedium();
        }
        if (stateData.isWaterLargeNow()) {
            WaterUtils.waterLarge();
        }
        StateDataResponse stateDataResponse = new StateDataResponse();
        stateDataResponse.setAutomation(wateringConfigurationService.getConfigurationEntity(Configurations.AUTOMATION_STATUS));
        stateDataResponse.setResult(Statuses.SUCCESS);
        Logger.getAnonymousLogger().info("update call is received");
        return stateDataResponse;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/watering/getSensorsData")
    @ResponseBody
    public SensorDataResponse getSensorData() {
        Logger.getAnonymousLogger().info("getSensorData call is received");
        return SensorDataUtils.getSensorData();
    }
}