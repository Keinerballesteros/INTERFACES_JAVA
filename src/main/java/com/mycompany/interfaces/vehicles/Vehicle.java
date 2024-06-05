
package com.mycompany.interfaces.vehicles;


public class Vehicle {
    private String brand;
    private String color;
    private int doorOtty;

    public Vehicle(String brand, String color, int doorOtty) {
        this.brand = brand;
        this.color = color;
        this.doorOtty = doorOtty;
    }
    
    
    
    public void run(){
        System.out.println("Carro andando");
    }
}
