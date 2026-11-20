/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

//Prueba push franco

/**
 *
 * @author Tomas
 */
public class Adopcion implements Serializable {
    private int numeroAdopcion;
    private Animal animal;
    private Familia familia;
    private String comentario;
    
    
    public Adopcion (int unNumeroAdopcion, Animal unAnimal, Familia unaFamilia, String unComentario){
    this.numeroAdopcion = unNumeroAdopcion;
    this.animal = unAnimal;
    this.familia = unaFamilia;
    this.comentario = unComentario;
    }
    
    @Override
    public String toString(){
        return "- " + "Familia: " + getFamilia().getApellido() + " (" + getFamilia().getCedula() + ")  " + "Animal: " + getAnimal().getNombreAnimal() + " ("+ getAnimal().getCodigo() +")";
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public int getNumeroAdopcion(){
        return numeroAdopcion;
    }
    
    public void setNumeroAdopcion(int numero){
        this.numeroAdopcion = numero;
    }
    
}
