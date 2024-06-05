

package com.mycompany.interfaces;

import com.mycompany.interfaces.vehicles.classics.Renault;
import com.mycompany.interfaces.vehicles.sports.BMW;


public class Interfaces {

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "blanco y azul", 2);
        bmw.run();
        bmw.addTurbo();
        bmw.openCeiling();
        
        Renault renault = new Renault("Renault","azul" , 4);
        renault.openCeiling();
        renault.run();
    }
}
