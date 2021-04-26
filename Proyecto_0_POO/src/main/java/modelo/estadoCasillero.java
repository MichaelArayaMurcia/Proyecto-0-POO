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
public class estadoCasillero {

    private String estado;
    
    public estadoCasillero(String estado){
        /**
        * Constructor de la clase estadoCasillero
        * @author Sebas
        */
        this.estado = estado;
    }
    
    public void setEstado(int opcion){
        /**
        * Funcion encargada de establecer el estado del casillero
        * @param opcion: numero que define el estado del casillero
        * @author Sebas
        */
        if (opcion == 0){
            estado = "Libre";
        }
        if (opcion == 1){
            estado = "Ocupado";
        }
        else{
            System.out.println("Valor no valido.");
        }    
    }
    
    public String getEstado(){
        /**
        * Funcion encargada de obtener el estado de un casillero
        * @return estado de un casillero
        * @author Sebas
        */
        return estado;
    }
}
