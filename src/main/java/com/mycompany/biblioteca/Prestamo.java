package com.mycompany.biblioteca;

import java.time.LocalDate;

public class Prestamo {
String idPrestamo;
Cliente cliente;
Libro libro;
LocalDate fecha;
String estado;

public Prestamo(String idPrestamo,Cliente cliente,Libro libro,LocalDate fecha,String estado){
    this.cliente=cliente;
    this.estado=estado;
    this.fecha=fecha;
    this.idPrestamo=idPrestamo;
    this.libro=libro;
}
//getters
public String getIdPrestamo(){
    return idPrestamo;
}
public Cliente getCliente(){
    return cliente;
}
public Libro getLibro(){
    return libro;
}
public LocalDate getFecha(){
    return fecha;
}
public String getEstado(){
    return estado;
}
//setters
public void setIdPrestamo(String idPrestamo){
    this.idPrestamo=idPrestamo;
}
public void setCliente(Cliente cliente){
    this.cliente=cliente;
}
public void setLibro(Libro libro){
    this.libro=libro;
}
public void setFecha(LocalDate fecha){
    this.fecha=fecha;
}
public void setEstado(String estado){
    this.estado=estado;
}


}
