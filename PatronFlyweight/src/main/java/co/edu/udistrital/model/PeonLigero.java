/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

// PeonLigero.java
/**
 * PeonLigero = Flyweight (estado intrínseco: color)
 */
public final class PeonLigero {
    private final Color color; // intrínseco

    public PeonLigero(Color color) {
        this.color = color;
    }

    public Color obtenerColor() {
        return color;
    }

    @Override
    public String toString() {
        return "PeonLigero{" + "color=" + color + '}';
    }
}

