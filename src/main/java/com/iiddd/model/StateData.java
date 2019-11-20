package com.iiddd.model;

public class StateData {

    private boolean automationStatus;
    private boolean isWaterSmallNow;
    private boolean isWaterMediumNow;
    private boolean isWaterLargeNow;

    public boolean isAutomation() {
        return automationStatus;
    }

    public StateData setAutomation(boolean automation) {
        automationStatus = automation;
        return this;
    }

    public boolean isWaterSmallNow() {
        return isWaterSmallNow;
    }

    public StateData setWaterSmallNow(boolean waterSmallNow) {
        isWaterSmallNow = waterSmallNow;
        return this;
    }

    public boolean isWaterMediumNow() {
        return isWaterMediumNow;
    }

    public StateData setWaterMediumNow(boolean waterMediumNow) {
        isWaterMediumNow = waterMediumNow;
        return this;
    }

    public boolean isWaterLargeNow() {
        return isWaterLargeNow;
    }

    public StateData setWaterLargeNow(boolean waterLargeNow) {
        isWaterLargeNow = waterLargeNow;
        return this;
    }
}
