package com.iiddd.model;

public class StateData {

    boolean isAutomation;
    boolean isWaterSmallNow;
    boolean isWaterMediumNow;
    boolean isWaterLargeNow;

    public boolean isAutomation() {
        return isAutomation;
    }

    public StateData setAutomation(boolean automation) {
        isAutomation = automation;
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
