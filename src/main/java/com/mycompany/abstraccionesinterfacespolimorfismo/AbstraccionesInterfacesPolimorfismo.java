/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstraccionesinterfacespolimorfismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Implement.vehiculosEspacialesImplementacion;


/**
 *
 * @author kawa
 */
public class AbstraccionesInterfacesPolimorfismo{

    public static void main(String[] args) throws IOException {
        
        int opcion,peso;
        float potencia,velocidad;
        String nombreVehiculo;        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.println("1. Crear Nave Lanzadera");
            System.out.println("2. Crear Nave No Tripulada");
            System.out.println("3. Crear Nave Tripulada");
            System.out.println("4. Salir");
            System.out.println("OPCION:");
            opcion = Integer.parseInt(br.readLine());
            if (opcion != 4) {
                try{
                    System.out.println("Ingresa potencia del vehiculo Espacial:");
                    potencia = Float.parseFloat(br.readLine());
                    System.out.println("Ingresa la velocidad del vehiculo Espacial en Km:");
                    velocidad = Float.parseFloat(br.readLine());
                    System.out.println("Ingresa el peso del vehiculo Espacial en toneladas:");
                    peso = Integer.parseInt(br.readLine());
                    System.out.println("Ingresa el nombre del vehiculo Espacial:");
                    nombreVehiculo = br.readLine();                    
                    vehiculosEspacialesImplementacion implementacion = new vehiculosEspacialesImplementacion(opcion,potencia,velocidad,nombreVehiculo,peso);
                    implementacion.menu();
                    
                }catch(IOException e){
                    System.out.println(e);
                }
                
            }
            
        } while (opcion != 4);
    }
}
