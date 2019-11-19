package com.iiddd.utils;

import com.iiddd.model.SensorDataResponse;

public class SensorDataUtils {

    public SensorDataResponse getSensorData() {
        SensorDataResponse sensorDataResponse = new SensorDataResponse();
        sensorDataResponse
                .setHumiditySmall(123)
                .setHumidityMedium(123)
                .setHumidityLarge(123);
        return sensorDataResponse;
    }
}
