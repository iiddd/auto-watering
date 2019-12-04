package com.iiddd.enums;

public enum Configurations {
    AUTOMATION_STATUS("automation_status");

    private String value;

    Configurations(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setConfiguration(String value) {
        this.value = value;
    }
}
