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
public class avion {
    private int numeroPasajeros;
    private float cantidadCombustible;
    private String modelo;
   
public avion(){

}

    /**
     * @return the numeroPasajeros
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * @param numeroPasajeros the numeroPasajeros to set
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * @return the cantidadCombustible
     */
    public float getCantidadCombustible() {
        return cantidadCombustible;
    }

    /**
     * @param cantidadCombustible the cantidadCombustible to set
     */
    public void setCantidadCombustible(float cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
