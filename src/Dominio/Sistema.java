/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

//no borrar
import io.ArchivoGrabacion;
import io.ArchivoLectura;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
    
    public PropertyChangeSupport manejador;
    
    
    //constructor de Sistema
    public Sistema (){
    this.listaAdopciones = new ArrayList<>();
    this.listaAnimales = new ArrayList<>(); 
    this.listaDonaciones = new ArrayList<>();
    this.listaEmpresas = new ArrayList<>();
    this.listaFamilias = new ArrayList<>();
    
    manejador = new PropertyChangeSupport(this);
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
            
            // Franco: Agregue esto porque proximoNumeroDonacion es atributo de instancia, necesitamos recuperarlo.
            
            this.proximoNumeroDonacion = sistemaRecuperado.proximoNumeroDonacion;
            
            // 4. Cerramos el flujo de lectura del archivo[cite: 12]
            input.close();
            
        } catch (IOException | ClassNotFoundException e) {
            // 5. Capturamos los errores obligatorios si el archivo no existe o hay conflicto de clases[cite: 12, 13]
            System.out.println("Error al recuperar los datos del sistema");
        }
    }
    
    // parte de Patron Observer
    public void agregarSubscriptor(PropertyChangeListener observer){
        manejador.addPropertyChangeListener( observer);
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
   
    public void realizarAdopcion(Animal unAnimal, Familia unaFamilia, String unComentario){
        Adopcion A = new Adopcion(unAnimal, unaFamilia, unComentario);
        getListaAdopciones().add(A);
        unAnimal.setEstado("Entregado a Familia");
        
         
    }
    
    // se usa en ventanaAnularAdopcion()
    public Adopcion[] adopcionesDisponibles(){
        
        ArrayList<Adopcion> l = new ArrayList<>(getListaAdopciones());
        return l.toArray(new Adopcion[0]);
    
    }
    
    // Elimina la adopcion del listaAdopciones y remueve su estado de "Entregado a Familia" a "Disponible"
    public void anularAdopcion(Adopcion unaAdopcion){
        
        boolean encontrada = false;
        
        for (int i = 0; i < getListaAdopciones().size() && encontrada == false; i++){
            Adopcion a = getListaAdopciones().get(i); 
            if (a.equals(unaAdopcion)){ // verifica si existe 
                encontrada = true;
                getListaAdopciones().remove(i);
                
            }
        }
    }
    
    
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
    
    // se usa en listas, agarra el ArrayList, filtra por disponibles y devuelve un Array[] no un ArrayList
    public Animal[] animalesDisponibles(){

        ArrayList<Animal> l = new ArrayList<>();

        for (int i = 0; i < getListaAnimales().size() ; i++ ){
            Animal a = getListaAnimales().get(i);
            if (a.getEstado().equals("Disponible")){
            l.add(a);
            }
        }
    return l.toArray(new Animal[0]);
    } 
    
    
    // hace lo mismo que AnimalesDisponibles, pero devuelve el array simple de todos los animales que no estan en un proceso de adopción
    public Animal[] AnimalesParaAdoptar() {
        ArrayList<Animal> l = new ArrayList<>();

        for (int i = 0; i < getListaAnimales().size() ; i++ ){
            Animal a = getListaAnimales().get(i);
            if (a.getEstado().equals("Disponible") || a.getEstado().equals("No Disponible")){
            l.add(a);
            }
        }
    return l.toArray(new Animal[0]);
    }
    
    public void intercambiarEstado(Animal unAnimal) {
        if (unAnimal != null) {
            String estadoActual = unAnimal.getEstado();

            if (estadoActual.equals("Disponible")) {
                unAnimal.setEstado("No Disponible");
            } else if (estadoActual.equals("No Disponible")) {
                unAnimal.setEstado("Disponible");
            }
        }
    }
    
    // Metodos de Donacion.
    
    private int proximoNumeroDonacion = 1;

    public int getProximoNumeroDonacion() {
        return proximoNumeroDonacion;
    }
    
    public int registrarDonacion(Empresa empresa, int tipo, int kilos) {
        int numero = proximoNumeroDonacion;
        listaDonaciones.add(new Donacion(numero, empresa, tipo, kilos));
        proximoNumeroDonacion++;
        return numero;
    }

    public boolean esTipoValido(int tipo) {
        return tipo >= 1 && tipo <= 4;
    }

    // Devuelve -1 si el texto no es un entero; sirve para validar en ventana e importación
    public int convertirEntero(String texto) {
        int numero = -1;
        try {
            numero = Integer.parseInt(texto.trim());
        } 
        catch (NumberFormatException e) {
            numero = -1;
        }
        return numero;
    }

    public int stockAlimento(int tipo) {
        int total = 0;
        for (int i = 0; i < listaDonaciones.size(); i++) {
            if (listaDonaciones.get(i).getTipoAlimento() == tipo) {
                total = total + listaDonaciones.get(i).getCantidadKilos();
            }
        }
        return total;
    }
    
    // Devuelve la cantidad de líneas con error (0 = todo ok)
public int importarDonaciones(String ruta) {
    ArchivoLectura arch = new ArchivoLectura(ruta);
    ArrayList<String> errores = new ArrayList<>();
    int numeroLinea = 0;

    while (arch.hayMasLineas()) {
        numeroLinea++;
        String error = procesarLineaDonacion(arch.linea());
        if (!error.isEmpty()) {
            errores.add("Línea " + numeroLinea + ": " + error.trim());
        }
    }
    arch.cerrar();

    if (!errores.isEmpty()) {
        ArchivoGrabacion archError = new ArchivoGrabacion(nombreArchivoError(ruta));
        for (int i = 0; i < errores.size(); i++) {
            archError.grabarLinea(errores.get(i));
        }
        archError.cerrar();
    }
    return errores.size();
}

// Registra la donación si la línea es válida; si no, devuelve los errores encontrados
private String procesarLineaDonacion(String linea) {
    String error = "";
    String[] partes = linea.split("#");

    if (partes.length != 3) {
        error = "formato incorrecto (se espera rut#tipo#kilos).";
    } else {
        Empresa empresa = buscarEmpresa(partes[0].trim());
        int tipo = convertirEntero(partes[1]);
        int kilos = convertirEntero(partes[2]);

        if (empresa == null) {
            error += "Empresa no registrada. ";
        }
        if (!esTipoValido(tipo)) {
            error += "Tipo incorrecto. ";
        }
        if (kilos <= 0) {
            error += "Cantidad incorrecta. ";
        }
        if (error.isEmpty()) {
            registrarDonacion(empresa, tipo, kilos);
        }
    }
    return error;
}

// "C:/carpeta/Datos.txt" -> "C:/carpeta/DatosError.txt"
private String nombreArchivoError(String ruta) {
    String nombre = ruta + "Error";
    int punto = ruta.lastIndexOf(".");
    if (punto != -1) {
        nombre = ruta.substring(0, punto) + "Error" + ruta.substring(punto);
    }
    return nombre;
}

    // Metodos de Empresa.

    //Devuelve true si la empresa ya existe según su rut
    
    public Empresa buscarEmpresa(String rutIng) {
        Empresa encontrada = null;
        for (int i = 0; i < listaEmpresas.size() && encontrada == null; i++) {
            if (listaEmpresas.get(i).getRut().equals(rutIng)) {
                encontrada = listaEmpresas.get(i);
            }
        }
        return encontrada;
    }

    public boolean existeEmpresa(String rutIng) {
        return buscarEmpresa(rutIng) != null;
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
    
    
    
    
    // Metodos de Familia.
    
    // devuelve un Array simple de todas las familias (se usa en Listas)
    public Familia[] familiasDisponibles() {
        
        ArrayList<Familia> l = new ArrayList<>(getListaFamilias()); 
        return l.toArray(new Familia[0]);
    }
}
