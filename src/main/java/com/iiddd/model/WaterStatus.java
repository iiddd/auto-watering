package com.iiddd.model;

import java.util.List;

public class WaterStatus {

    private static boolean automationStatus = true;
    private static int humiditySmall;
    private static int humidityMedium;
    private static int humidityLarge;
    private static List<String> wateringHistorySmall;
    private static List<String> wateringHistoryMedium;
    private static List<String> wateringHistoryLarge;

    public static boolean isIsAutomation() {
        return automationStatus;
    }

    public static void setIsAutomation(boolean isAutomation) {
        WaterStatus.automationStatus = isAutomation;
    }

    public static int getHumiditySmall() {
        return humiditySmall;
    }

    public static void setHumiditySmall(int humiditySmall) {
        WaterStatus.humiditySmall = humiditySmall;
    }

    public static int getHumidityMedium() {
        return humidityMedium;
    }

    public static void setHumidityMedium(int humidityMedium) {
        WaterStatus.humidityMedium = humidityMedium;
    }

    public static int getHumidityLarge() {
        return humidityLarge;
    }

    public static void setHumidityLarge(int humidityLarge) {
        WaterStatus.humidityLarge = humidityLarge;
    }

    public static List<String> getWateringHistorySmall() {
        return wateringHistorySmall;
    }

    public static void setWateringHistorySmall(List<String> wateringHistorySmall) {
        WaterStatus.wateringHistorySmall = wateringHistorySmall;
    }

    public static List<String> getWateringHistoryMedium() {
        return wateringHistoryMedium;
    }

    public static void setWateringHistoryMedium(List<String> wateringHistoryMedium) {
        WaterStatus.wateringHistoryMedium = wateringHistoryMedium;
    }

    public static List<String> getWateringHistoryLarge() {
        return wateringHistoryLarge;
    }

    public static void setWateringHistoryLarge(List<String> wateringHistoryLarge) {
        WaterStatus.wateringHistoryLarge = wateringHistoryLarge;
    }
}