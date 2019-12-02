package com.iiddd.controller;

import com.iiddd.model.SensorDataResponse;
import com.iiddd.model.StateData;
import com.iiddd.model.StateDataResponse;
import com.iiddd.model.WaterStatus;
import com.iiddd.service.WateringConfigurationService;
import com.iiddd.utils.SensorDataUtils;
import com.iiddd.utils.WaterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WaterDataController {

    @Autowired
    WateringConfigurationService wateringConfigurationService;

    @RequestMapping(method = RequestMethod.POST, value = "/watering/update")
    @ResponseBody
    public StateDataResponse updateState(@RequestBody StateData stateData) {
        WaterStatus.setAutomationStatus(stateData.isAutomationStatus());
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
        stateDataResponse.setAutomation(WaterStatus.isAutomationStatus());
        stateDataResponse.setResult("SUCCESS");
        System.out.println("Automation status: " + WaterStatus.isAutomationStatus());
        return stateDataResponse;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/watering/getSensorsData")
    @ResponseBody
    public SensorDataResponse getSensorData() {
        System.out.println("Rest call is received");
        wateringConfigurationService.getConfigurationEntity("automation_status");
        return SensorDataUtils.getSensorData();
    }
}