/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implement;
import Naves.lanzadera;
import Naves.noTripulada;
import Naves.tripulada;


/**
 *
 * @author kawa
 */
public class vehiculosEspacialesImplementacion {
    
    int opcion;
    lanzadera Lanzadera = new lanzadera(0, 0, "", "", 0);
    noTripulada NoTripulada = new noTripulada(0, 0, "", "", 0);
    tripulada Tripulada = new tripulada(0, 0, "", "", 0);    
    
    public vehiculosEspacialesImplementacion(int opcion, float potencia, float velocidad, String nombreVehiculo, int peso) {
        this.opcion = opcion;
        Lanzadera = new lanzadera(potencia,velocidad,"",nombreVehiculo,peso);
        NoTripulada = new noTripulada(potencia,velocidad,"",nombreVehiculo,peso);
        Tripulada = new tripulada(potencia,velocidad,"",nombreVehiculo,peso); 
    }
    
    public void menu(){
        
        switch(opcion){
    
        case 1: 
                Lanzadera.mostrarNave();
                Lanzadera.acelerar();
                Lanzadera.frenar();
                Lanzadera.desplegarNave();
                break;
        case 2: 
                NoTripulada.mostrarNave();
                NoTripulada.acelerar();
                NoTripulada.frenar();
                break;
        case 3: 
                Tripulada.mostrarNave();
                Tripulada.activarGravedad();
                Tripulada.frenar();
                break;
        default:
                break;
                
    }
    }
    
   
    
}
