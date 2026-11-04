/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.util.*;
/**
 *
 * @author Tomas
 */
public class Sistema {
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

// Metodos de Adopcion.

// Metodos de Animal.

// Metodos de Donacion.

// Metodos de Empresa.

// Metodos de Familia.

}
