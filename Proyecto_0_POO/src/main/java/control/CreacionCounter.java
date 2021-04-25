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
    
    
    public void crear(String nombre, String cedJuridica, String direccion, int cantCasilleros){
        elCounter = new Counter(nombre, cedJuridica, direccion, cantCasilleros);
        ArrayList<Casillero> listaCasilleros = new ArrayList<Casillero>();
        
        for (int i=0; i < cantCasilleros; i++){
            Casillero nuevoCasillero = new Casillero(i + 1000);
            listaCasilleros.add(nuevoCasillero);
        }
        
        elCounter.setListaCasilleros(listaCasilleros);
    }
}
