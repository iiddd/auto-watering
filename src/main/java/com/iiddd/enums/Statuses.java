package com.iiddd.enums;

public enum Statuses {
    SUCCESS("SUCCESS");

    private String status;

    Statuses(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
