/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Counter;
import modelo.Casillero;

/**
 *
 * @author Sebas
 */
public class CreacionCounter {
    
    private Counter elCounter;
    
    public CreacionCounter(){
    }
    
    public void crear(String nombre, String cedJuridica, String direccion, int cantCasilleros){
        /**
        * Funcion creadora del counter
        * @param nombre: nombre del counter 
        * @param cedJuridica: cedula juridica del counter
        * @param direccion: direccion del counter
        * @param cantCasilleros: cantidad de casilleros diponibles en el counter
        * @author Sebas
        */

        elCounter = new Counter(nombre, cedJuridica, direccion, cantCasilleros);
        ArrayList<Casillero> listaCasilleros = new ArrayList<Casillero>();
        
        for (int i=1; i <= cantCasilleros; i++){
            Casillero nuevoCasillero = new Casillero(i + 1000);
            listaCasilleros.add(nuevoCasillero);
        }
        
        elCounter.setListaCasilleros(listaCasilleros);
    }

    @Override
    public String toString() {
        return "CreacionCounter{" + "elCounter=" + elCounter + '}';
    }
    
    public ArrayList<Casillero> getListaCasilleros(){
        return elCounter.getListaCasilleros();
    }
}
