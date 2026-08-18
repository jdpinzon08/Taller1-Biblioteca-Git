package com.mycompany.biblioteca;

public class Material {
    String Nombre;
    String Autor;
    String Codigo;

    public Material(String Nombre,String Autor, String Codigo){
        this.Autor=Autor;
        this.Codigo=Codigo;
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getAutor(){
        return Autor;
    }
    public String getCodigo(){
        return Codigo;
    }
    
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    @Override
    public String toString() {
        return "nombre: "+ Nombre +" Autor: " + Autor +" codigo: " +Codigo;
    }
}
