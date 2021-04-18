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
    
    public void setEstado(int opcion){
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
        return estado;
    }
}
