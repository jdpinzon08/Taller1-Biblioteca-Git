package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

//arreglos y eso
static ArrayList<Cliente> clientes = new ArrayList<>();
static Scanner sc = new Scanner(System.in);


public static void main(String[] args) {
//menu al futuro xd
}

//metodos pal cliente______________________________

//crear
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

public static void leerCliente(){
    if(clientes.isEmpty()){
        System.out.println("ta vacio");
        return;
    }
    for(int i=0; i <clientes.size(); i++){
        Cliente cliente =clientes.get(i);
        System.out.println((i + 1) + " - " + cliente);
    }
}

public static void leerBuscarCliente(){
    if(clientes.isEmpty()){
        System.out.println("ta vacio");
        return;
    };
    System.out.println("_______Lector y buscador de clientes______");
    System.out.println("ingrese la cedula del cliente a buscar");
    int idCliente= sc.nextInt();
    sc.nextLine();

    int encontrado=0;
    for(Cliente cliente : clientes){
        if(cliente.getCedula()==(idCliente)){
            System.out.println(cliente);
            encontrado=1;
            break;
        }
    }
    if (encontrado==0){
        System.out.println("no se encontro el cliente, por favor creeelo");
    }
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
