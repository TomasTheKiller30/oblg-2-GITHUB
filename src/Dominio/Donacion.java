/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Tomas
 */
public class Donacion {
    
    private Empresa empresa;
    private int tipoAlimento;
    private int cantidadKilos;
    
    public Donacion (Empresa unaEmpresa, int unTipoAlimento, int unaCantidadKilos){
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
    
}
