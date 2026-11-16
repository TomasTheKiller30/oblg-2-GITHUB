/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

//no borrar
import java.util.*;
import java.nio.*;
import java.io.*;
import java.nio.file.*;
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
    
    //constructor de Sistema
    public Sistema (){
    this.listaAdopciones = new ArrayList<>();
    this.listaAnimales = new ArrayList<>(); 
    this.listaDonaciones = new ArrayList<>();
    this.listaEmpresas = new ArrayList<>();
    this.listaFamilias = new ArrayList<>();
    }
    
    
    // parte de archivos y seria:
    public void guardarDatos() {
        try {
            // 1. Instanciamos ObjectOutputStream y creamos el archivo "datos.ser" en la ruta del proyecto[cite: 11, 12]
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos.ser")));

            // 2. Usamos writeObject enviando "this", lo que hace que toda tu clase Sistema (y sus listas) se guarde de un solo golpe[cite: 11]
            output.writeObject(this);

            // 3. Cerramos el archivo para liberar la memoria y asegurar que se guarde correctamente[cite: 11, 12]
            output.close();
            System.out.println("DEBUG: guardarDatos() se ejecutó correctamente");

        } catch (IOException e) {
            // 4. Si hay un problema de archivos, capturamos la excepción IOException[cite: 11, 12]
            System.out.println("Error al guardar los datos del sistema");
        }
}
    public void recuperarDatos() {
        try {
            // 1. Instanciamos ObjectInputStream para leer el archivo "datos.ser"[cite: 12, 13]
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("datos.ser")));
            
            // 2. Leemos el objeto del archivo y lo "casteamos" a nuestra clase Sistema[cite: 12, 13]
            Sistema sistemaRecuperado = (Sistema) input.readObject();
            
            // 3. Reemplazamos las listas actuales vacías por las que estaban guardadas[cite: 6, 13]
            this.listaAdopciones = sistemaRecuperado.listaAdopciones;
            this.listaAnimales = sistemaRecuperado.listaAnimales;
            this.listaDonaciones = sistemaRecuperado.listaDonaciones;
            this.listaEmpresas = sistemaRecuperado.listaEmpresas;
            this.listaFamilias = sistemaRecuperado.listaFamilias;
            
            // 4. Cerramos el flujo de lectura del archivo[cite: 12]
            input.close();
            
        } catch (IOException | ClassNotFoundException e) {
            // 5. Capturamos los errores obligatorios si el archivo no existe o hay conflicto de clases[cite: 12, 13]
            System.out.println("Error al recuperar los datos del sistema");
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
    
    
    //Devuelve true o false si el animal (por código) ya existe. PARA VALIDACIONES
    public boolean existeAnimal(String codigoIng){
        boolean existe = false;
        
        for (int i = 0 ; i < getListaAnimales().size() && !existe; i++ ){
            String a = getListaAnimales().get(i).getCodigo();
            if ( a.equalsIgnoreCase(codigoIng)){
                existe = true;
            }
        }
        return existe;
    }
    
    public void registrarAnimal(String codigoIng, String nombreIng, String temperamentoIng, double pesoIng, String estadoIng){
        
        if (existeAnimal(codigoIng) == false){ 
            Animal A = new Animal(codigoIng, nombreIng, temperamentoIng, pesoIng, estadoIng);
            this.listaAnimales.add(A);
        }
    
    }
    
    // Metodos de Donacion.

    // Metodos de Empresa.

    //Devuelve true si la empresa ya existe según su rut
    public boolean existeEmpresa(String rutEmpresa){
        boolean existe = false;
        for (int i = 0 ; i < getListaEmpresas().size() && !existe; i++){
            String rutRegistrado = getListaEmpresas().get(i).getRut();
            if ( rutRegistrado.equals(rutEmpresa)){
                existe = true;
            }
        }
        return existe;
    }

    public void registrarEmpresa(String unNombreEmpresa, String unRut, String unaDireccion){
        if (!existeEmpresa(unRut)){
            Empresa A = new Empresa(unNombreEmpresa, unRut, unaDireccion);
            this.listaEmpresas.add(A);
        }
    
    }    
    
    // Metodos de Familia.
    
    //Devuelve true si la familia ya existe según su cedula
    public boolean existeFamilia(String ciFamilia){
        boolean existe = false;
        for (int i = 0 ; i < getListaFamilias().size() && !existe; i++){
            String ciRegistrada = getListaFamilias().get(i).getCedula();
            if ( ciRegistrada.equals(ciFamilia)){
                existe = true;
            }
        }
        return existe;
    }

    public void registrarFamilia(String cedulaIngreso, String apellidoIngreso, String celularIngreso){
        if (!existeFamilia(cedulaIngreso)){
            Familia A = new Familia(cedulaIngreso, apellidoIngreso, celularIngreso);
            this.listaFamilias.add(A);
        }
    
    }
    
}
