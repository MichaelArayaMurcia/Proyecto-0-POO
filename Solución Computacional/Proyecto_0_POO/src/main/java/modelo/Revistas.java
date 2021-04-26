/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Sebas
 */
public class Revistas {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    private String nombre;
    private boolean esCatalogo;
    private String tema;
    private double peso;
    private Calendar fechaRecibido;
    private Calendar fechaEntrega;
    
    public Revistas(){
        /**
        * Constructor de la clase Revistas
        * @author Sebas
        */

    }
    
    public Revistas(int id, String descrip, String remi, String nombreRev, String temaRev, Calendar FechaRecibido){
        /**
        * Constructor de la clase Revistas
        * @param id: identificador de la revista
        * @param descrip: descripcion de la revista
        * @param remi: remitente de la revista
        * @param nombreRev: nombre de la revista
        * @param temaRev: tema de la revista
        */

        identificacion = id;
        descripcion = descrip;
        remitente = remi;
        nombre = nombreRev;
        tema = temaRev;
        this.fechaRecibido = FechaRecibido;
    }    
    
    public void setID(int ID){
        /**
        * Funcion encargada de establecer el identificador de la revista
        * @param ID: identificador de la revista
        * @author Sebas
        */

        identificacion = ID;
    }
    
    public int getID(){
        /**
        * Funcion encargada de obtener el identificador de la revista
        * @return identificador de la revista
        * @author Sebas
        */

        return identificacion;
    }
    
    public void setEntregado(int opcion){
        /**
        * Funcion encargada de establecer el estado de entregado de la revista
        * @param opcion: entregado o no
        * @author Sebas
        */

        if (opcion == 0){
            estaEntregado = false;
        }
        if (opcion == 1){
            estaEntregado = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getEntregado(){
        /**
        * Funcion encargada de obtener el estado de la revista
        * @return entregado o no
        * @author Sebas
        */

        return estaEntregado;
    }
    
    public void setDescripcion(String descripcion){
        /**
        * Funcion encargada de establecer la descripcion de la revista
        * @param descripcin: descripcion de las revistas
        * @author Sebas
        */

        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        /**
        * funcon encargada de obtener la descripcion de la revista
        * @return descripcion de la revista
        * @author Sebas
        */

        return descripcion;
    }
    
    public void setRemitente(String remitente){
        /**
        * Funcion encargada de establecer el remitente de la revista
        * @param remitente: remitente de la revista
        * @author Sebas
        */

        this.remitente = remitente;
    }
    
    public String getRemitente(){
        /**
        * Funcion encargada de obtener el remitente de la revista
        * @return remitente de la revista
        * @author Sebas
        */

        return remitente;
    }
    
    public void setNombre(String nombre){
        /**
        * Funcion encargada de establecer un nombre a la revista
        * @param nombre: nombre de la revista
        * @author Sebas
        */

        this.nombre = nombre;
    }
    
    public String getNombre(){
        /**
        * Funcion encargada de obtener el nombre de la revista
        * @return nombre de la revista
        * @author Sebas
        */

        return nombre;
    }
    
    public void setCatalogo(int opcion){
        /**
        * Funcion encargada de establecer si la revista es catalogo o no
        * @param opcion: define si la revista es catalogo o no
        * @author Sebas
        */

        if (opcion == 0){
            esCatalogo = false;
        }
        if (opcion == 1){
            esCatalogo = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getCatalogo(){
        /**
        * Funcion encargada de obtener si la revista es catalogo o no
        * @return si es catalogo o no
        * @author Sebas
        */

        return esCatalogo;
    }
    
    public void setTema(String tema){
        /**
        * Funcion encargada de establecer el tema de la revista
        * @param tema: tema de la revista
        * @author Sebas
        */

        this.tema = tema;
    }
    
    public String getTema(){
        /**
        * Funcion encargada de obtener el tema de la revista
        * @return tema de la revista
        * @author Sebas
        */

        return tema;
    }


    public Calendar getFechaRecibido() {
        /**
         * Funcion encargada de obtener la fecha de recibido de la revista
         * @return fecha de recibido
         * @author José
         */
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        /**
         * Funcion encargada de establecer la fecha de recibido de la revista
         * @param fechaRecibido: fecha de recibido de la revista
         * @author José
         */
        this.fechaRecibido = fechaRecibido;
    }

    public Calendar getFechaEntrega() {
        /**
         * Funcion encargada de obtener la fecha de entrega de la revista
         * @return fecha de entrega
         * @author José
         */
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        /**
         * funcion encargada de establecer la fecha de entrea de la revista
         * @param fechaEntrega: fecha de entrega de la revista
         * @author José
         */
        this.fechaEntrega = fechaEntrega;
    }
    
    
    
    @Override
    public String toString(){
        /**
        * Funcion encargada de pasar todos los atributos de revistas a String
        * @return todos los atributos de revistas en string
        * @author Sebas
        */

        return "Revista\n" + "ID: " + identificacion + "\n" + "Entregado: " + estaEntregado + "\n"
                + "Descripción: " + descripcion + "\n" + "Remitente: " + remitente + "\n" +
                "Nombre: " + nombre + "\n" + "Es catálogo: " + esCatalogo + "\n" +
                "Tema: " + tema;
    }
}
