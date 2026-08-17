package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

static ArrayList<Cliente> clientes = new ArrayList<>();
static Scanner sc = new Scanner(System.in);

public static void listarCliente(){
    for (Cliente cliente : clientes){
        System.out.println(cliente);
    }
}
public static Cliente buscarCliente(String nombre) {
    for (Cliente cliente : clientes) {
        if (cliente.getNombre().equalsIgnoreCase(nombre)) {
            return cliente;
        }
    }

    return null;
}


public static void main(String[] args) {
//menu al futuro xd
}

}
