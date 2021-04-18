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
public class Revistas {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    private String nombre;
    private boolean esCatalogo;
    private String tema;
    
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
}
