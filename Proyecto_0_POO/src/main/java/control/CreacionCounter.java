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
    
    private ArrayList<Counter> elCounter = new ArrayList();
    private ArrayList<Casillero> listaCasilleros = new ArrayList();
    
    public void crear(String nombre, String cedJuridica, String direccion, int cantCasilleros, ArrayList lisCasilleros){
        Counter nuevoCounter = new Counter();
        nuevoCounter.setNombre(nombre);
        nuevoCounter.setCedJuridica(cedJuridica);
        nuevoCounter.setDireccion(direccion);
        nuevoCounter.setCantCasilleros(cantCasilleros);
        listaCasilleros = lisCasilleros;
    } 
}
