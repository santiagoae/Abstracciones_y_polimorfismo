/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naves;

import Classes.vehiculosEspaciales;

/**
 *
 * @author kawa
 */
public class noTripulada extends vehiculosEspaciales{

    public noTripulada(float potencia, float velocidad, String tipoVehiculo, String nombreVehiculo, int peso) {
        super(potencia, velocidad, tipoVehiculo, nombreVehiculo, peso);
        this.tipoVehiculo= "No tripulada";
    }   
    
    @Override
    public void acelerar() {
        System.out.println("Acelera: de 0 a " + velocidad + "Km/h"+ " en 2segundos");
    }

    @Override
    public void frenar() {
        System.out.println("en caso de frenado se detiene totalmente y queda a disposicion del espacio");
    }
    
}
