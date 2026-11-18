/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.io.Serializable;
/**
 *
 * @author Tomas
 */
public class Empresa implements Serializable {
    private String nombreEmpresa;
    private String rut;
    private String direccion;
    
    public Empresa (String unNombreEmpresa, String unRut, String unaDireccion){
        this.nombreEmpresa = unNombreEmpresa;
        this.rut = unRut;
        this.direccion = unaDireccion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String unRut) {
        this.rut = unRut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return nombreEmpresa + " (RUT " + rut + ")";
    }
    
}
