/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw_1_8;

/**
 *
 * @author Alexandr Balkovskii
 */
public class TelephoneInfo {
    private String model;
    private String serialNumber;
    private String color;
    private boolean isMobile;

    public TelephoneInfo(String model, String serialNumber, String color, boolean isMobile) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.isMobile = isMobile;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return (model + ", " + serialNumber + ", " + color + ", " + isMobile);
    }
}
