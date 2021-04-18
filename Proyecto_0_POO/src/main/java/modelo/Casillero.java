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
public class Casillero {
    private int numero;
    private estadoCasillero estado;
    
    public void setNumeroCasillero(int numCasillero){
        numero = numCasillero;
    }
    
    public int getNumeroCasillero(){
        return numero;
    }
    
    public void setEstadoCasillero(estadoCasillero estCasillero){
        estado = estCasillero;
    }
    
    public estadoCasillero getEstadoCasillero(){
        return estado;
    }
}
