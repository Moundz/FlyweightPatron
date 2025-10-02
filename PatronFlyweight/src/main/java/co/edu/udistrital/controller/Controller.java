/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Color;
import co.edu.udistrital.model.FabricaPeon;
import co.edu.udistrital.model.Peon;
import co.edu.udistrital.model.PeonLigero;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    
    
    public void run() {
        List<Peon> tablero = new ArrayList<>();

        // Crear 8 peones blancos en fila 2
        for (int c = 1; c <= 8; c++) {
            PeonLigero blanco = FabricaPeon.obtenerLigero(Color.BLANCO);
            tablero.add(new Peon(blanco, 2, c));
        }

        // Crear 8 peones negros en fila 7
        for (int c = 1; c <= 8; c++) {
            PeonLigero negro = FabricaPeon.obtenerLigero(Color.NEGRO);
            tablero.add(new Peon(negro, 7, c));
        }

        // Dibujar peones
        tablero.forEach(Peon::dibujar);

        // Mostrar cuántos flyweights se crearon en total
        System.out.println("Peones ligeros creados en el pool: " + FabricaPeon.tamanoPool());
    }
}
