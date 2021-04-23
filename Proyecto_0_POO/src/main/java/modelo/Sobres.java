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
public class Sobres {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    private String tipo;
    private String contenido;
    private double peso;
    
    public Sobres(){
        
    }
    
    public Sobres(int id, String descrip, String remi, String tipoSob, String contenidoSob){
        identificacion = id;
        descripcion = descrip;
        remitente = remi;
        tipo = tipoSob;
        contenido = contenidoSob;
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
    
    public void setTipo(String opcion){
        if (opcion == "A"){
            tipo = "Aereo";
        }
        if (opcion == "M"){
            tipo = "Manilla";
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    
    public String getContenido(){
        return contenido;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    @Override
    public String toString(){
        return "Sobre\n" + "ID: " + identificacion + "\n" + "Entregado: " + estaEntregado + "\n" +
                "Descripción: " + descripcion + "\n" + "Remitente: " + remitente + "\n" +
                "Tipo: " + tipo + "\n" + "Contenido: " + contenido + "\n" + "Peso: " + peso;
    }
}
