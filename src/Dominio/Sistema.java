/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Tomas
 */
public class Sistema implements Serializable{
    public ArrayList<Adopcion> listaAdopciones = new ArrayList<>();
    public ArrayList<Animal> listaAnimales = new ArrayList<>();
    public ArrayList<Donacion> listaDonaciones = new ArrayList<>();
    public ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    public ArrayList<Familia> listaFamilias = new ArrayList<>();
    
    public Sistema (ArrayList<Adopcion> unaListaAdopciones, ArrayList<Animal> unaListaAnimales, ArrayList<Donacion> unaListaDonaciones, ArrayList<Empresa> unaListaEmpresas, ArrayList<Familia> unaListaFamilias){
    this.listaAdopciones = unaListaAdopciones;
    this.listaAnimales = unaListaAnimales; 
    this.listaDonaciones = unaListaDonaciones;
    this.listaEmpresas = unaListaEmpresas;
    this.listaFamilias = unaListaFamilias;
    }
    
    
    // parte de archivos y seri:
    public void guardarDatos() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos.ser")));
            out.writeObject(this);
            out.close();

        } catch (IOException e) {
            System.out.println("Error al guardar los datos del sistema");
        }
    }
    // getters y setters

    public ArrayList<Adopcion> getListaAdopciones() {
        return listaAdopciones;
    }

    public void setListaAdopciones(ArrayList<Adopcion> listaAdopciones) {
        this.listaAdopciones = listaAdopciones;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }

    public void setListaDonaciones(ArrayList<Donacion> listaDonaciones) {
        this.listaDonaciones = listaDonaciones;
    }

    public ArrayList<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    public ArrayList<Familia> getListaFamilias() {
        return listaFamilias;
    }

    public void setListaFamilias(ArrayList<Familia> listaFamilias) {
        this.listaFamilias = listaFamilias;
    }
    
    // Metodos de Adopcion.

    // Metodos de Animal.

    // Metodos de Donacion.

    // Metodos de Empresa.

    // Metodos de Familia.

}
