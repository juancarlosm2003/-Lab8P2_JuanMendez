/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos Mendez
 */
public class Zona {

    String nombre;
    int derrumbe, ataque;

    public Zona() {
    }

    public Zona(String nombre, int derrumbe, int ataque) {
        this.nombre = nombre;
        this.derrumbe = derrumbe;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDerrumbe() {
        return derrumbe;
    }

    public void setDerrumbe(int derrumbe) {
        this.derrumbe = derrumbe;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

}
