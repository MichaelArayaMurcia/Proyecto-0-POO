/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Sebas
 */
public class Revistas {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    private String nombre;
    private boolean esCatalogo;
    private String tema;
    private double peso;
    private Calendar fechaRecibido;
    private Calendar fechaEntrega;
    
    public Revistas(){
        
    }
    
    public Revistas(int id, String descrip, String remi, String nombreRev, String temaRev, Calendar FechaRecibido){
        identificacion = id;
        descripcion = descrip;
        remitente = remi;
        nombre = nombreRev;
        tema = temaRev;
        this.fechaRecibido = FechaRecibido;
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
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCatalogo(int opcion){
        if (opcion == 0){
            esCatalogo = false;
        }
        if (opcion == 1){
            esCatalogo = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getCatalogo(){
        return esCatalogo;
    }
    
    public void setTema(String tema){
        this.tema = tema;
    }
    
    public String getTema(){
        return tema;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }

    public Calendar getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
    
    @Override
    public String toString(){
        return "Revista\n" + "ID: " + identificacion + "\n" + "Entregado: " + estaEntregado + "\n"
                + "Descripción: " + descripcion + "\n" + "Remitente: " + remitente + "\n" +
                "Nombre: " + nombre + "\n" + "Es catálogo: " + esCatalogo + "\n" +
                "Tema: " + tema;
    }
}
