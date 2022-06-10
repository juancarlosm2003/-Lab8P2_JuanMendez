/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos Mendez
 */
public class Item {

    String nombre;
    int probabilidad_obtencion;
    int precio_venta;

    public Item() {
    }

    public Item(String nombre, int probabilidad_obtencion, int precio_venta) {
        this.nombre = nombre;
        this.probabilidad_obtencion = probabilidad_obtencion;
        this.precio_venta = precio_venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProbabilidad_obtencion() {
        return probabilidad_obtencion;
    }

    public void setProbabilidad_obtencion(int probabilidad_obtencion) {
        this.probabilidad_obtencion = probabilidad_obtencion;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

}
