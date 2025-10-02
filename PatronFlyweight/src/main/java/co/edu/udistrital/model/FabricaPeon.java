/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

// FabricaPeonLigero.java
import java.util.HashMap;
import java.util.Map;

/**
 * FabricaPeonLigero: mantiene el pool de flyweights.
 * Garantiza que por color exista solo una instancia de PeonLigero.
 */
public class FabricaPeon {
    private static final Map<Color, PeonLigero> pool = new HashMap<>();

    // Devuelve el PeonLigero para el color dado. Si no existe, lo crea.
    public static PeonLigero obtenerLigero(Color color) {
        return pool.computeIfAbsent(color, c -> new PeonLigero(c));
    }

    // Tamaño actual del pool (debe ser 2 al final del ejemplo).
    public static int tamanoPool() {
        return pool.size();
    }
}
