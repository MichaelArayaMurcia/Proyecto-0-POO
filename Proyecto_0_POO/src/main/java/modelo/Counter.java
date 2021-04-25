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
    
    public Counter(){
        
    }
    
    public Counter(String nombreC, String cJuridica, String direccion, int cCasilleros){
        nombre = nombreC;
        cedulaJuridica = cJuridica;
        this.direccion = direccion;
        cantidadCasilleros = cCasilleros;
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
    
    public void setListaCasilleros(ArrayList<Casillero> listaCasilleros){
        this.listaCasilleros = listaCasilleros;
    }
    
    public ArrayList<Casillero> getListaCasilleros(){
        return listaCasilleros;
    }
    
    @Override
    public String toString(){
        return "Counter \n" + "Nombre: " + nombre + "\n" + "Cédula jurídica: " +
                cedulaJuridica + "\n" + "Dirección: " + direccion + "\n" + "Cantidad de casilleros: "
                + cantidadCasilleros;
    }    
}
