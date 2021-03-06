package com.iiddd.utils;

import com.iiddd.models.SensorDataResponse;

public class SensorDataUtils {

    public static SensorDataResponse getSensorData() {
        SensorDataResponse sensorDataResponse = new SensorDataResponse();
        sensorDataResponse
                .setHumiditySmall(WaterUtils.getSmallPlantsSoilMoisture())
                .setHumidityMedium(WaterUtils.getMediumPlantsSoilMoisture())
                .setHumidityLarge(WaterUtils.getLargePlantsSoilMoisture());
        return sensorDataResponse;
    }
}