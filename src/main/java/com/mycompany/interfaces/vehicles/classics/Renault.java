
package com.mycompany.interfaces.vehicles.classics;

import com.mycompany.interfaces.Convertible;
import com.mycompany.interfaces.vehicles.Vehicle;


public class Renault extends Vehicle implements Convertible{

    public Renault(String brand, String color, int doorOtty) {
        super(brand, color, doorOtty);
    }

    @Override
    public void openCeiling() {
        System.out.println("Soy cool");
    }
    
}
