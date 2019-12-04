package com.iiddd.models;

public class StateData {

    private boolean automationStatus;
    private boolean waterSmallNow;
    private boolean waterMediumNow;
    private boolean waterLargeNow;

    public boolean isAutomationStatus() {
        return automationStatus;
    }

    public void setAutomationStatus(boolean automationStatus) {
        this.automationStatus = automationStatus;
    }

    public boolean isWaterSmallNow() {
        return waterSmallNow;
    }

    public void setWaterSmallNow(boolean waterSmallNow) {
        this.waterSmallNow = waterSmallNow;
    }

    public boolean isWaterMediumNow() {
        return waterMediumNow;
    }

    public void setWaterMediumNow(boolean waterMediumNow) {
        this.waterMediumNow = waterMediumNow;
    }

    public boolean isWaterLargeNow() {
        return waterLargeNow;
    }

    public void setWaterLargeNow(boolean waterLargeNow) {
        this.waterLargeNow = waterLargeNow;
    }
}