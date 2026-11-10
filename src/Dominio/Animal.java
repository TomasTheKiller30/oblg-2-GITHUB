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
public class Animal implements Serializable {
    
    private String codigo;
    private String nombreAnimal;
    private String temperamento;
    private Double peso;
    private String estado;
    
    public Animal (String unCodigo, String unNombreAnimal, String unTemperamento, Double unPeso, String unEstado){
        this.codigo = unCodigo;
        this.nombreAnimal = unNombreAnimal;
        this.temperamento = unTemperamento;
        this.peso = unPeso;
        this.estado = unEstado;
        
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
