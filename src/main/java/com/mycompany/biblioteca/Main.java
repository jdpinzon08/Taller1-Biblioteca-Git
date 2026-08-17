package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

static ArrayList<Cliente> clientes = new ArrayList<>();
static Scanner sc = new Scanner(System.in);


public static void main(String[] args) {
//menu al futuro xd
}

//metodos pal cliente______________________________
public static void crearCliente(){
    System.out.println("ingrese los datos necesitados:");
    System.out.println("ingrese el numero de cedula: ");
    int cedula= sc.nextInt();
    sc.nextLine();
    System.out.println("ingrese el nombre del cliente: ");
    String nombre= sc.nextLine();

    Cliente cliente = new Cliente(nombre, cedula);
    clientes.add(cliente);
    System.out.println("_______________cliente registrado_______________");
}

//listar 
public static void listarCliente(){
    for (Cliente cliente : clientes){
        System.out.println(cliente);
    }
}

//busqueda
public static Cliente buscarCliente(String nombre) {
    for (Cliente cliente : clientes) {
        if (cliente.getNombre().equalsIgnoreCase(nombre)) {
            return cliente;
        }
    }
    return null;
}



}
