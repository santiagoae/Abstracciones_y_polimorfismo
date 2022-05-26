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
public class tripulada extends vehiculosEspaciales implements vehiculosEspacialesInterface { 

    public tripulada(float potencia, float velocidad, String tipoVehiculo, String nombreVehiculo, int peso) {
        super(potencia, velocidad, tipoVehiculo, nombreVehiculo, peso);
        this.tipoVehiculo= "Tripulada";        
    }   
    
    @Override
    public void prender() {
        System.out.println("esta nave esta siempre activa");
    }

    @Override
    public void apagar() {
        System.out.println("esta nave no se debe apagar");
    }   

    @Override
    public void activarGravedad() {
        System.out.println("Gravedad: la gravedad se activo");
    }

    @Override
    public void desactivarGravedad() {
        System.out.println("Gravedad: la gravedad se apago");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar: solo acelera de ser necesario");
    }

    @Override
    public void frenar() {
        System.out.println("En caso de frenado se detiene totalmente");
    }   

    @Override
    public void desplegarNave() {
        System.out.println("No cuenta con esta herramienta todavia");
    }
}
