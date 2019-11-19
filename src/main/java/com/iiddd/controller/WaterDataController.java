package com.iiddd.controller;

import com.iiddd.model.SensorData;
import com.iiddd.model.SensorDataResponse;
import com.iiddd.model.StateData;
import com.iiddd.model.StateDataResponse;
import com.iiddd.utils.SensorDataUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WaterDataController {

    private SensorDataUtils sensorDataUtils = new SensorDataUtils();

    @RequestMapping(method = RequestMethod.POST, value = "/water/update")
    @ResponseBody
    public StateDataResponse updateState(@RequestBody StateData stateData) {
        System.out.println("Rest call is received");
        StateDataResponse stateDataResponse = new StateDataResponse();
        stateDataResponse.setAutomation(stateData.isAutomation());
        stateDataResponse.setResult("SUCCESS");
        return stateDataResponse;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/water/getSensorsData")
    @ResponseBody
    public SensorDataResponse getSensorData(@RequestBody SensorData sensorData) {
        System.out.println("Rest call is received");
        return sensorDataUtils.getSensorData();
    }

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "index";
    }
}
