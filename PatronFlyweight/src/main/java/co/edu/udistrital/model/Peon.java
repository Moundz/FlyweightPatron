/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

// Peon.java
/**
 * Peon: contiene la referencia al flyweight (PeonLigero) y su estado extrínseco (fila, columna).
 */
public class Peon {
    private final PeonLigero ligero; // referencia al flyweight (intrínseco)
    private final int fila;          // extrínseco
    private final int columna;       // extrínseco

    public Peon(PeonLigero ligero, int fila, int columna) {
        this.ligero = ligero;
        this.fila = fila;
        this.columna = columna;
    }

    // Método para "dibujar" o mostrar el peón en consola combinando intrínseco + extrínseco
    public void dibujar() {
        System.out.printf("Peon %s en (fila=%d, col=%d) -> ligeroId=%d%n",
                ligero.obtenerColor(), fila, columna, System.identityHashCode(ligero));
    }
}

