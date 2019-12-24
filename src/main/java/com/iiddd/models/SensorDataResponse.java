package com.iiddd.models;

import java.util.List;

public class SensorDataResponse {

    private String humiditySmall;
    private String humidityMedium;
    private String humidityLarge;
    private List<String> wateringHistorySmall;
    private List<String> wateringHistoryMedium;
    private List<String> wateringHistoryLarge;

    public String getHumiditySmall() {
        return humiditySmall;
    }

    public SensorDataResponse setHumiditySmall(String humiditySmall) {
        this.humiditySmall = humiditySmall;
        return this;
    }

    public String getHumidityMedium() {
        return humidityMedium;
    }

    public SensorDataResponse setHumidityMedium(String humidityMedium) {
        this.humidityMedium = humidityMedium;
        return this;
    }

    public String getHumidityLarge() {
        return humidityLarge;
    }

    public SensorDataResponse setHumidityLarge(String humidityLarge) {
        this.humidityLarge = humidityLarge;
        return this;
    }

    public List<String> getWateringHistorySmall() {
        return wateringHistorySmall;
    }

    public SensorDataResponse setWateringHistorySmall(List<String> wateringHistorySmall) {
        this.wateringHistorySmall = wateringHistorySmall;
        return this;
    }

    public List<String> getWateringHistoryMedium() {
        return wateringHistoryMedium;
    }

    public SensorDataResponse setWateringHistoryMedium(List<String> wateringHistoryMedium) {
        this.wateringHistoryMedium = wateringHistoryMedium;
        return this;
    }

    public List<String> getWateringHistoryLarge() {
        return wateringHistoryLarge;
    }

    public SensorDataResponse setWateringHistoryLarge(List<String> wateringHistoryLarge) {
        this.wateringHistoryLarge = wateringHistoryLarge;
        return this;
    }
}
