/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Empleados;

import java.util.Scanner;

/**
 *
 * @author DAAD
 */
public class EmpleadoPorComision extends Empleado {
    
    private double VentasBrutas;
    private double TarifaComision;
    private double Cobro;    
    
    public EmpleadoPorComision(String PrimerNombre, String PrimerApellido, int NumeroSeguroSocial, double VentasBrutas, double TarifaComision, double Cobro) {
        super(PrimerNombre, PrimerApellido, NumeroSeguroSocial);
    
        if(VentasBrutas<0.0)
        throw new IllegalArgumentException("Las ventas Brutas deben ser >= 0.0");
    
        if(TarifaComision<0.0||TarifaComision>1.0)
        throw new IllegalArgumentException("La tarifa de comisión debe ser >= 0.0 y <=1.0");
    
    this.VentasBrutas= VentasBrutas;
    this.TarifaComision=TarifaComision;
    }
    
    public void setVentasBrutas(double VentasBrutas){
        if (VentasBrutas<0.0)
            throw new IllegalArgumentException("Las ventas netas debe ser >= 0.0");
        this.VentasBrutas=VentasBrutas;
       
    }
    
    public double getVentasBrutas(){
        return VentasBrutas;
    }
    
    public void setTarifaComision(double TarifaComision){
        if(TarifaComision<0.0||TarifaComision>1.0)
            throw new IllegalArgumentException("La tarifa debe ser >= 0.0 y <= 1.0");
        this.TarifaComision=TarifaComision;
    }
    public double getTarifaComision(){
        return TarifaComision;
    }
    
    public double Ingresos(){
        return getVentasBrutas()*getTarifaComision();
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre del empleado: "+getPrimerNombre()+
                "\nPrimer Apellido del empleado: "+getPrimerApellido()+
                "\nNumero del seguro Social: "+getNumeroSeguroSocial()+
                "\nVentas Brutas: "+getVentasBrutas()+
                "\nTarifa de la Comision: "+getTarifaComision()+
                "\nIngresos del empleado: "+getVentasBrutas()*getTarifaComision());
        
    }
    
}

                
                
                
                
                
                
                
                
                
                
   
    
    
    

