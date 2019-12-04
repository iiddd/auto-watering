package com.iiddd.models;

import com.iiddd.enums.Statuses;

public class StateDataResponse {

    private boolean isAutomation;
    private Statuses result;

    public boolean isAutomation() {
        return isAutomation;
    }

    public StateDataResponse setAutomation(boolean automation) {
        isAutomation = automation;
        return this;
    }

    public String getResult() {
        return result.getStatus();
    }

    public StateDataResponse setResult(Statuses result) {
        this.result = result;
        return this;
    }
}
