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
public class Donacion implements Serializable {
    
    private Empresa empresa;
    private int numeroDonacion;
    private int tipoAlimento;
    private int cantidadKilos;
    
    public Donacion (int unNumero, Empresa unaEmpresa, int unTipoAlimento, int unaCantidadKilos){
        this.numeroDonacion = unNumero;
        this.empresa = unaEmpresa;
        this.tipoAlimento = unTipoAlimento;
        this.cantidadKilos = unaCantidadKilos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public int getNumeroDonacion() {
        return numeroDonacion;        
    }

    public int getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(int tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getCantidadKilos() {
        return cantidadKilos;
    }

    public void setCantidadKilos(int cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

    public String getNombreTipo() {
    String nombre = "Otra";
    if (tipoAlimento == 1) {
        nombre = "Perros grandes";
    } else if (tipoAlimento == 2) {
        nombre = "Perros chicos";
    } else if (tipoAlimento == 3) {
        nombre = "Perros adultos";
    }
    return nombre;
    }

    @Override
    public String toString() {
        return "Nº " + numeroDonacion + " - " + empresa.getNombreEmpresa() + " - " + getNombreTipo() + " - " + cantidadKilos + " kg";
    }
    
}
