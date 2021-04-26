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
        /**
        * Constructor de la clase Counter
        * @author Sebas
        */

    }
    
    public Counter(String nombreC, String cJuridica, String direccion, int cCasilleros){
        /**
        * Constructor de la clase Counter
        * @param nombreC: nombre del counter
        * @param cJuridica: cedula juridica del counter
        * @param direccion: direccion del counter
        * @param cCasilleros: cantidad de casilleros en el counter
        * @author Sebas
        */

        nombre = nombreC;
        cedulaJuridica = cJuridica;
        this.direccion = direccion;
        cantidadCasilleros = cCasilleros;
    }
    
    public void setNombre(String nombreC){
        /**
        * Funcion encargada de establecer el nombre del counter
        * @param nombreC: nombre del counter
        * @author Sebas
        */

        nombre = nombreC;
    }
    
    public String getNombre(){
        /**
        * Funcion encargada de obtener el nombre del counter
        * @return nombre del counter
        * @author Sebas
        */

        return nombre;
    }
    
    public void setCedJuridica(String cJuridica){
        /**
        * Funcion encargada de establecer la cedula juridica del counter
        * @param cJuridica: cedula juridica del counter
        * @author Sebas
        */

        cedulaJuridica = cJuridica;
    }
    
    public String getCedJuridica(){
        /**
        * Funcion encargada de obtener la cedula juridica del counter
        * @return cedula juridica del counter
        * @author Sebas
        */

        return cedulaJuridica;
    } 
    
    public void setDireccion(String direccion){
        /**
        * Funcion encargada de establecer la direccion dell cliente
        * @param direccion: direccion del counter
        * @author Sebas
        */

        this.direccion = direccion;
    }
    
    public String getDireccion(){
        /**
        * Funcion encargada de obtener la direccion del counter
        * @return direccion del counter
        * @author Sebas
        */

        return direccion;
    }
    
    public void setCantCasilleros(int cantCasilleros){
        /**
        * Funcion encargada de establecer la cantidad de casilleros del counter
        * @param cantcasilleros: cantidad de casilleros del counter
        * @author Sebas
        */

        cantidadCasilleros = cantCasilleros;
    }
    
    public int getCantCasilleros(){
        /**
        * Funcion encargada de obtener la cantidad de casilleros del counter
        * @return cantidad de casilleros del counter
        * @author Sebas
        */

        return cantidadCasilleros;
    }
    
    public void setListaCasilleros(ArrayList<Casillero> listaCasilleros){
        /**
        * Funcion encargada de establecer la lista de casilleros del counter
        * @param listaCasilleros: ArrayList con los casilleros del counter
        * @author José
        */

        this.listaCasilleros = listaCasilleros;
    }
    
    public ArrayList<Casillero> getListaCasilleros(){
        /**
        * Funcion encargada de obtener la lista de casilleros del counter
        * @return lista de casilleros del counter
        * @author José
        */

        return listaCasilleros;
    }
    
    @Override
    public String toString(){
        /**
        * Funcion encargada de pasar todos los atributos de counter a String
        * @return todos los atributos de counter en string
        * @author Sebas
        */

        return "Counter \n" + "Nombre: " + nombre + "\n" + "Cédula jurídica: " +
                cedulaJuridica + "\n" + "Dirección: " + direccion + "\n" + "Cantidad de casilleros: "
                + cantidadCasilleros;
    }    
}
