/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author alumnoFI
 */
public class ArchivoLectura {
    private Scanner in;
    private String lineaActual;
    
    public ArchivoLectura(String unNombre) {
        try {
            in = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
            System.err.println("Error ");
            //System.exit(1);
        }
    }

    public boolean hayMasLineas() {
        boolean hay = false;
        lineaActual = null;
        if (in.hasNext()){
            lineaActual = in.nextLine();
            hay = true;
        }
        return hay;
    }
    
    public String linea() {
        // devuelve la ultima linea leida
        return this.lineaActual;
    }

    public void cerrar() {
        in.close();
    }
    
}
