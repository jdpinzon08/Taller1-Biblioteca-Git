package com.mycompany.biblioteca;

public class Libro extends Material {
    private int numeroPaginas;

    public Libro(String nombre, String codigo, String autor, int numeroPaginas) {
        super(nombre, codigo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Paginas=" + numeroPaginas;
    }
}