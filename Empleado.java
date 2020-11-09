/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package Empleados;

/**
 *
 * @author DAAD
 */
public class Empleado {
    
    private String PrimerNombre;
    private String PrimerApellido;
    private int NumeroSeguroSocial;
    
    public Empleado(String PrimerNombre, String PrimerApellido, int NumeroSeguroSocial)  {
        this.PrimerNombre=PrimerNombre;
        this.PrimerApellido=PrimerApellido;
        this.NumeroSeguroSocial=NumeroSeguroSocial;
        
    }
    
    public String getPrimerNombre(){
        return PrimerNombre;
    }
    
    public String getPrimerApellido(){
        return PrimerApellido;
    }
    
    public int getNumeroSeguroSocial(){
        return NumeroSeguroSocial;
    }

}
