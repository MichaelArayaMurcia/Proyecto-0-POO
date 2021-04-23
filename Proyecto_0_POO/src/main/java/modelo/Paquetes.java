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
    private String entregarEn;
    private boolean tieneElectronico;
    private boolean esFragil;
    private double peso;
    
    public Paquetes(){
        
    }
    
    public Paquetes(int id, String descrip, String remi, String entregaEn, double peso) {
        identificacion = id;
        descripcion = descrip;
        remitente = remi;
        entregarEn = entregaEn;
        this.peso = peso;
    }
    
    public void setID(int ID){
        identificacion = ID;
    }
    
    public int getID(){
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
    
    public void setEntregarEn(String opcion){
        if (opcion == "C"){
            entregarEn = "Caja";
        }
        if (opcion == "B"){
            entregarEn = "Bolsa";
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public String getEntregarEn(){
        return entregarEn;
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
    
    @Override
    public String toString(){
        return "Paquete\n" + "ID: " + identificacion + "\n" + "Entregado: " + estaEntregado + "\n" +
                "Descripcion: " + descripcion + "\n" + "Remitente: " + remitente + "\n" +
                "Entregar en: " + entregarEn + "\n" + "Contiene artículo electrónico: " + tieneElectronico + "\n"
                + "Es frágil: " + esFragil + "\n" + "Peso: " + peso;
    }
}

