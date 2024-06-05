
package com.mycompany.interfaces.vehicles.sports;

import com.mycompany.interfaces.Convertible;
import com.mycompany.interfaces.Turbo;
import com.mycompany.interfaces.vehicles.Vehicle;


public class BMW extends Vehicle implements Turbo, Convertible{

    public BMW(String brand, String color, int doorOtty) {
        super(brand, color, doorOtty);
    }
//primero se hereda y despues se implementa la interfaz
    @Override
    public void addTurbo() {
        System.out.println("Nitro añadido");
    }

    @Override
    public void openCeiling() {
        System.out.println("Abriendo el techo");
    }   
}
