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
    private String cedula;
    private String apellido;
    private String celular;
    
    public Familia (String unaCedula, String unApellido, String unCelular){
        this.cedula = unaCedula;
        this.apellido = unApellido;
        this.celular = unCelular;
    }    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   
    
}
