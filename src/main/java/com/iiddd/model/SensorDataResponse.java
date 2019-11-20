package com.iiddd.model;

import java.util.List;

public class SensorDataResponse {

    private int humiditySmall;
    private int humidityMedium;
    private int humidityLarge;
    private List<String> wateringHistorySmall;
    private List<String> wateringHistoryMedium;
    private List<String> wateringHistoryLarge;

    public int getHumiditySmall() {
        return humiditySmall;
    }

    public SensorDataResponse setHumiditySmall(int humiditySmall) {
        this.humiditySmall = humiditySmall;
        return this;
    }

    public int getHumidityMedium() {
        return humidityMedium;
    }

    public SensorDataResponse setHumidityMedium(int humidityMedium) {
        this.humidityMedium = humidityMedium;
        return this;
    }

    public int getHumidityLarge() {
        return humidityLarge;
    }

    public SensorDataResponse setHumidityLarge(int humidityLarge) {
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
