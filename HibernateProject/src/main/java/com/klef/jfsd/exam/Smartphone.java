package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Smartphone extends Device {

    private String operatingSystem;
    private double cameraResolution; // in Megapixels

    // Getters and Setters
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
