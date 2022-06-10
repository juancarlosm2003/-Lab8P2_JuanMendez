/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos Mendez
 */
public class Mascotas {
    String nombre; 
    int puntos_vida, Delay;
    int costo;

    public Mascotas() {
    }

    public Mascotas(String nombre, int puntos_vida, int Delay, int costo) {
        this.nombre = nombre;
        this.puntos_vida = puntos_vida;
        this.Delay = Delay;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    public int getDelay() {
        return Delay;
    }

    public void setDelay(int Delay) {
        this.Delay = Delay;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
