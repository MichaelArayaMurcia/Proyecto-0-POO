/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Calendar;
import modelo.CambioDolar;

/**
 *
 * @author araya
 */
public class test01 {
    
    public static void pruebaDolar(){
        double venta = CambioDolar.ventaDolar();
        double compra = CambioDolar.compraDolar();
        
        System.out.println(venta);
        System.out.println(compra);
        
        System.out.println(Calendar.DATE);
    }
    
    public static void main(String[] args) {
        pruebaDolar();
    }
}
