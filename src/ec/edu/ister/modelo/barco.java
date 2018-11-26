/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author LAB5-PC8-USUARIO
 */
public class barco {
    private float capacidadCarga;
    private int tripulacion;
    private String nombreEmbarcacion;
    public barco (){
        
    }

    /**
     * @return the capacidadCarga
     */
    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * @param capacidadCarga the capacidadCarga to set
     */
    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * @return the tripulacion
     */
    public int getTripulacion() {
        return tripulacion;
    }

    /**
     * @param tripulacion the tripulacion to set
     */
    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    /**
     * @return the nombreEmbarcacion
     */
    public String getNombreEmbarcacion() {
        return nombreEmbarcacion;
    }

    /**
     * @param nombreEmbarcacion the nombreEmbarcacion to set
     */
    public void setNombreEmbarcacion(String nombreEmbarcacion) {
        this.nombreEmbarcacion = nombreEmbarcacion;
    }
    
}
