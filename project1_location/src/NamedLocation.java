/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1_location;

/**
 *
 * @author VENOM S
 */
public class NamedLocation extends SimpleLocation {
    private String name;

    public NamedLocation(double lat, double lon, String name) {
        super(lat, lon);
        this.name = name;
    }

    //  Overriding: إعادة تعريف دالة الطباعة
    @Override
    public void printLocation() {
        System.out.println("Location: " + name + " (" + latitude + ", " + longitude + ")");
    }
}
