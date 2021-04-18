/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sebas
 */
public class Paquetes {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    // Por definir "entregarEn": caja o bolsilla
    private boolean tieneElectronico;
    private boolean esFragil;
    private double peso;
    
    public void setID(int ID){
        identificacion = ID;
    }
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    public void setEntregado(int opcion){
        if (opcion == 0){
            estaEntregado = false;
        }
        if (opcion == 1){
            estaEntregado = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getEntregado(){
        return estaEntregado;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setRemitente(String remitente){
        this.remitente = remitente;
    }
    
    public String getRemitente(){
        return remitente;
    }
    
    public void setElectronico(int opcion){
        if (opcion == 0){
            tieneElectronico = false;
        }
        if (opcion == 1){
            tieneElectronico = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getElectronico(){
        return tieneElectronico;
    }
    
    public void setFragil(int opcion){
        if (opcion == 0){
            esFragil = false;
        }
        if (opcion == 1){
            esFragil = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getFragil(){
        return esFragil;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
}
