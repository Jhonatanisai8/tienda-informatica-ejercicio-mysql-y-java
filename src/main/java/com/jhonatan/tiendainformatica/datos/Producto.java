package com.jhonatan.tiendainformatica.datos;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private int idFabricante;

    public Producto(int idProducto, String nombre, double precio, int idFabricante) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.idFabricante = idFabricante;
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(String nombre, double precio, int idFabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.idFabricante = idFabricante;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

}
