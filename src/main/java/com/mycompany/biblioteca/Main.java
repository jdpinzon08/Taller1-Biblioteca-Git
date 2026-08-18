package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
private static ArrayList<Material> listaL = new ArrayList<>();
private static Scanner sc = new Scanner(System.in);
//arreglos y eso
static ArrayList<Cliente> clientes = new ArrayList<>();

public static void main(String[] args) {
    
}
//_____________________________________metodos del libro_____________________________________
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



//_____________________metodos pal cliente______________________________

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


//leer
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


//leer y buscar
public static void leerBuscarCliente(){
    if(clientes.isEmpty()){
        System.out.println("ta vacio");
        return;
    }
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


//actualizar el cliente
public static void actualizar(){

 if(clientes.isEmpty()){
        System.out.println("ta vacio");
        return;
    }
    System.out.println("escriba la cedula del cliente a actualizar");
    int idCliente =sc.nextInt();
    sc.nextLine();

    for(Cliente cliente : clientes){
         if(cliente.getCedula()==(idCliente)){
            System.out.println("escriba la correccion del nombre");
            String nombre = sc.nextLine();
            cliente.setNombre(nombre);
            System.out.println("se hizo el cambio correctamente");
            break;
        }
    }
    System.out.println("no se encontro a dicho cliente");
}


//eliminador de clientes
public static void borrarCliente(){
    if(clientes.isEmpty()){
        System.out.println("ta vacio");
        return;
    }
    System.out.println("escriba la cedula del cliente a actualizar");
    int idCliente =sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < clientes.size(); i++){
        if(clientes.get(i).getCedula()==idCliente){
            clientes.remove(i);
            break;
        }
    }
}

}
