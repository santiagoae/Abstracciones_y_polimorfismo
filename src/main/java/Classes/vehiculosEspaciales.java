/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author kawa
 */
public abstract class vehiculosEspaciales {
    
    public float potencia;
    public float velocidad;
    public String tipoVehiculo;
    private String nombreVehiculo;    
    public int peso;   

    public vehiculosEspaciales(float potencia, float velocidad, String tipoVehiculo, String nombreVehiculo, int peso) {
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.tipoVehiculo = tipoVehiculo;
        this.nombreVehiculo = nombreVehiculo;
        this.peso = peso;
    }   

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    } 
    
    public void mostrarNave(){
        System.out.println(
                "Nombre del Vehiculo Espacial: " + this.nombreVehiculo + "\n" +
                "Tipo de vehiculo Espacial: " + this.tipoVehiculo + "\n" +
                "Potencia del vehiculo Espacial: " + this.potencia + "\n" +
                "Velocidad del vehiculo Espacial: " + this.velocidad + " km/h"+"\n"+
                "Peso del vehiculo Espacial: " + this.peso + " toneladas" +"\n"
        );
    }
    
    public abstract void acelerar();
    
    public abstract void frenar();   
    
    
}
