package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

private static ArrayList<Material> listaL = new ArrayList<>();
private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    
}

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

    public static void leerLibro(){
        if(listaL.isEmpty()){
            System.out.println("la lista esta vacia, ingrese algo primero");
        }
        for(Material libro : listaL){
            System.out.println(libro);
        }
    }



    
}
