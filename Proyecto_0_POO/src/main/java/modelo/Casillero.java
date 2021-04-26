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
    
    public Casillero(int numero){
        /**
        * Constructor de la clase Casillero
        * @param numero: numero del casillero
        * @author Sebas
        */

        this.numero = numero;
    }
    
    public Casillero(int numero, estadoCasillero estado){
        /**
        * Constructor de la clase Casillero
        * @param numero: numero del casillero
        * @param estado: estado del casillero
        * @author Sebas
        */

        this.numero = numero;
        this.estado = estado;
    }
    
    public void setNumeroCasillero(int numCasillero){
        /**
        * Funcion encargada de establecer un numero a un casillero
        * @param numCasillero: numero a asignar al casillero
        * @author Sebas
        */

        numero = numCasillero;
    }
    
    public int getNumeroCasillero(){
        /**
        * Funcion encargada de obtener el numero de un casillero
        * @return numero del casillero
        * @author Sebas
        */

        return numero;
    }
    
    public void setEstadoCasillero(estadoCasillero estCasillero){
        /**
        * Funcion encargada de establecer el estado de un casillero
        * @param estCasillero: estado del casillero
        * @author Sebas
        */

        estado = estCasillero;
    }
    
    public estadoCasillero getEstadoCasillero(){
        /**
        * Funcion encargada de obtener el estado de un casillero
        * @return estado del casillero
        * @author Sebas
        */

        return estado;
    }
    
    @Override
    public String toString(){
        /**
        * Funcion encargada de pasar todos los atributos de casillero a String
        * @return todos los atributos de casillero en string
        * @author Sebas
        */

        return "Casillero \n" + "Número: " + numero + "\n" + "Estado del casillero: " +
                estado;
    }
}
