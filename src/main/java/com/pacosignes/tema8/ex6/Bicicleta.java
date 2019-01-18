package com.pacosignes.tema8.ex6;

public class Bicicleta {
    private int referencia;
    private String nombre;
    private String modelo;
    private float peso;
    private float pulgadas;
    private boolean tieneMotor;
    private String fecha;
    //todo gregorian calendar
    private float precio;
    private int existencias;

//setters

    public void setReferencia(int referencia){
        this.referencia=referencia;

    }
    public boolean setNombre(String nombre){
        this.nombre=nombre;
        return true;

    }

}
