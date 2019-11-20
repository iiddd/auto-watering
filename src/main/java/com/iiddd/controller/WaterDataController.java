package com.iiddd.controller;

import com.iiddd.model.*;
import com.iiddd.utils.SensorDataUtils;
import com.iiddd.utils.WaterUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WaterDataController {

    @RequestMapping(method = RequestMethod.POST, value = "/water/update")
    @ResponseBody
    public StateDataResponse updateState(@RequestBody StateData stateData) {
        WaterStatus.setIsAutomation(stateData.isAutomation());
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
        stateDataResponse.setAutomation(WaterStatus.isIsAutomation());
        stateDataResponse.setResult("SUCCESS");
        System.out.println("Automation status: " + WaterStatus.isIsAutomation());
        return stateDataResponse;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/water/getSensorsData")
    @ResponseBody
    public SensorDataResponse getSensorData(@RequestBody SensorData sensorData) {
        System.out.println("Rest call is received");
        return SensorDataUtils.getSensorData();
    }
}
