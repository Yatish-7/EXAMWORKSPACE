package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Tablet extends Device {

    private double screenSize; // in inches
    private int batteryLife; // in hours

    // Getters and Setters
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
