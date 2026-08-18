package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

private static ArrayList<Material> listaL = new ArrayList<>();
private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    
}
//agregar libro
public static void agregarLibro() {
        System.out.println("_____AGREGAR LIBRO_____");
        System.out.print("escriba el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("escriba el codigo: ");
        String codigo = sc.nextLine();
        System.out.print("escriba el autor: ");
        String autor = sc.nextLine();

        Material nuevoLibro = new Material(nombre, codigo, autor);
        listaL.add(nuevoLibro);
        System.out.println("Libro agregado exitosamente");
    }
// leer 
public static void leerLibro(){
    if(listaL.isEmpty()){
        System.out.println("la lista esta vacia, ingrese algo primero");
        }
    for(Material libro : listaL){
            System.out.println(libro);
        }
    }

//buscar
 public static void buscar(){
    System.out.println("escriba el codigo del libro a buscar");
    String cod = sc.nextLine();
    for (Material libro : listaL) {
        if(libro.getCodigo().equals(cod)){
            System.out.println("libro encontrado");
            System.out.println(libro);
            return;
        }
    }
    System.out.println("no se encontro el libro");
 }

//actualizar
public static void actualizarL(){
    System.out.println("_____actualizar libro_____");
    System.out.println("ingrese el codigo del libro que desea actualizar");
    String lib = sc.nextLine();
    if(listaL.isEmpty()){
        System.out.println("la lista esta vacia, ingrese un material primero");
    }
    for(Material libro : listaL){
        if(libro.getCodigo().equalsIgnoreCase(lib)){
            System.out.println("ingrese el nuevo nombre del libro");
            libro.setNombre(sc.nextLine());
            System.out.println("ingrese el nuevo codigo del libro");
            libro.setCodigo(sc.nextLine());
            System.out.println("ingrese el nuevo autor del libro");
            libro.setAutor(sc.nextLine());
            System.out.println("libro actualizado :D");
            return;
        }
    }
    System.out.println("el libro no fue encontrado");
}
//eliminar libro 
public static void eliminarLibro(){
    System.out.println("_______eliminar un libro_______");
    System.out.println("ingrese el codigo del libro a eliminar");
    String elim =sc.nextLine();

    for(int i = 0; i < listaL.size(); i++){
        if(listaL.get(i).getCodigo().equalsIgnoreCase(elim)){
            listaL.remove(i);
            System.out.println("libro eliminado con exito");
            return;
        }
    }
    System.out.println("libro no encontrado ");
}


}
