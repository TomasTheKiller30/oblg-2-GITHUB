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
public class Familia implements Serializable {
    private int cedula;
    private String apellido;
    private int celular;
    
    public Familia (int unaCedula, String unApellido, int unCelular){
        this.cedula = unaCedula;
        this.apellido = unApellido;
        this.celular = unCelular;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
   
    
}
