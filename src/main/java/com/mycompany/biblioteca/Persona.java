package com.mycompany.biblioteca;

public class Persona {
    protected String nombre;
    protected int cedula;

    public Persona(String nombre, int cedula){
        this.nombre=nombre;
        this.cedula=cedula;
    }

    public String getNombre() {
        return nombre;
    };
    public int getCedula(){
        return cedula;
    };
}
