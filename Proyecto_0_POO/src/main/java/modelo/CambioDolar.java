/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import calculadora.Wsindicadoreseconomicos;
import calculadora.WsindicadoreseconomicosSoap;
import java.util.Calendar;

/**
 *
 * @author araya
 */
public class CambioDolar {
    
    public static double ventaDolar(){
      /*
      /* Función que cambia la moneda a dolar
      /* @author josé
      /* @return
      */
        Calendar actFecha = Calendar.getInstance();
        String fecha = actFecha.get(Calendar.DATE)+"/"+(actFecha.get(Calendar.MONTH)+1)+"/"+actFecha.get(Calendar.YEAR);
        Wsindicadoreseconomicos indicador = new Wsindicadoreseconomicos();
        WsindicadoreseconomicosSoap respuesta;
        respuesta = indicador.getWsindicadoreseconomicosSoap();
        String cambio = respuesta.obtenerIndicadoresEconomicosXML("318", fecha, fecha, "José Araya Castillo","n", "arayacastilloj@gmail.com", "OAGR1CSA6A");
        double cam = Double.parseDouble((String) cambio.subSequence(196, 203));
        return cam;
    }
    
    public static double compraDolar(){
      /*
      /* Función que cambia la moneda a dolar
      /* @author josé
      /* @return
      */
        Calendar actFecha = Calendar.getInstance();
        String fecha = actFecha.get(Calendar.DATE)+"/"+(actFecha.get(Calendar.MONTH)+1)+"/"+actFecha.get(Calendar.YEAR);
        Wsindicadoreseconomicos indicador = new Wsindicadoreseconomicos();
        WsindicadoreseconomicosSoap respuesta;
        respuesta = indicador.getWsindicadoreseconomicosSoap();
        String cambio = respuesta.obtenerIndicadoresEconomicosXML("317", fecha, fecha, "José Araya Castillo","n", "arayacastilloj@gmail.com", "OAGR1CSA6A");
        double cam = Double.parseDouble((String) cambio.subSequence(196, 203));
        return cam;
    }
    
}
