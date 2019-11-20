package com.iiddd.model;

public class StateDataResponse {

    private boolean isAutomation;
    private String result;

    public boolean isAutomation() {
        return isAutomation;
    }

    public StateDataResponse setAutomation(boolean automation) {
        isAutomation = automation;
        return this;
    }

    public String getResult() {
        return result;
    }

    public StateDataResponse setResult(String result) {
        this.result = result;
        return this;
    }
}