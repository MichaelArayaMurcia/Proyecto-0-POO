/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class Counter {
    private String nombre;
    private String cedulaJuridica;
    private String direccion;
    private int cantidadCasilleros;
    private ArrayList<Casillero> listaCasilleros = new ArrayList();
    
    public Counter(String nombreC, String cJuridica, String direccion){
        nombre = nombreC;
        cedulaJuridica = cJuridica;
        this.direccion = direccion;
    }
    
    public void setNombre(String nombreC){
        nombre = nombreC;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCedJuridica(String cJuridica){
        cedulaJuridica = cJuridica;
    }
    
    public String getCedJuridica(){
        return cedulaJuridica;
    } 
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setCantCasilleros(int cantCasilleros){
        cantidadCasilleros = cantCasilleros;
    }
    
    public int getCantcasilleros(){
        return cantidadCasilleros;
    }
}
