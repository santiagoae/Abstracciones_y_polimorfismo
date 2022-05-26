/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naves;

import Classes.vehiculosEspaciales;
import Interfaces.vehiculosEspacialesInterface;

/**
 *
 * @author kawa
 */
public class lanzadera extends vehiculosEspaciales implements vehiculosEspacialesInterface {

    public lanzadera(float potencia, float velocidad, String tipoVehiculo, String nombreVehiculo, int peso) {
        super(potencia, velocidad, tipoVehiculo, nombreVehiculo, peso);
        this.tipoVehiculo= "Lanzadera";
    }
    

    @Override
    public void acelerar() {
        System.out.println("Aceleracion: el vehiculo sube de 1 en 1 a una velocidad de: " + velocidad + "Km/h");
    }

    @Override
    public void frenar() {
        System.out.println("en caso de frenado el vehiculo baja su velocidad 0");
    }

    @Override
    public void prender() {
        System.out.println("Encendido: el vehiculo se activa para su funcionamiento");
    }

    @Override
    public void apagar() {
        System.out.println("en caso de apagado vehiculo corta todo su funcionamiento");
    }

    @Override
    public void desplegarNave() {
        System.out.println("Nave en orbita satisfactoriamente");
    }

    @Override
    public void activarGravedad() {
        System.out.println("Gravedad: la gravedad se vuelve estable dentro de la nave");
    }

    @Override
    public void desactivarGravedad() {
        System.out.println("Gravedad: todo vuelve a flotar");
    }

    
}
