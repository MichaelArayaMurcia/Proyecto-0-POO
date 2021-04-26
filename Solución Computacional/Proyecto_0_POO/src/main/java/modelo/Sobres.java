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
public class Sobres {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    private String tipo;
    private String contenido;
    private double peso;
    private Calendar fechaRecibido;
    private Calendar fechaEntrega;
    
    public Sobres(){
        /**
         * Constructor de la clase Sobres
         * @author Sebas
         */

    }
    
    public Sobres(int id, String descrip, String remi, String tipoSob, String contenidoSob, Calendar FechaRecibido){
        /**
         * Constructor de la clase Sobres
         * @param id: identificador del sobre
         * @param descrip: descripcion del sobre
         * @param remi: remitente del sobre
         * @param tipoSob: tipo de sobre
         * @param contenidoSob: contenido del sobre
         * @author Sebas
         */

        identificacion = id;
        descripcion = descrip;
        remitente = remi;
        tipo = tipoSob;
        contenido = contenidoSob;
        this.fechaRecibido = FechaRecibido;
    }
    
    public void setID(int ID){
        /**
         * Funcion encargada de establecer el identificador del sobre
         * @param ID: identificador del sobre
         * @author Sebas
         */

        identificacion = ID;
    }
    
    public int getID(){
        /**
         * Funcion encargada de obtener el identificador del sobre
         * @return identificador del sobre
         * @author Sebas
         */

        return identificacion;
    }
    
    public void setEntregado(int opcion){
        /**
         * Funcion encargada de establecer si el sobre esta entregado o no
         * @param opcion: define si el sobre esta entregado o no
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
         * Funcion encargada de obtener el estado del sobre
         * @return estado del sobre
         * @author Sebas
         */

        return estaEntregado;
    }
    
    public void setDescripcion(String descripcion){
        /**
         * Funcion encargada de establecer la descripcion del sobre
         * @param descripcion: descripcion del sobre
         * @author Sebas
         */

        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        /**
         * Funcion encargada de obtener la descripcion del sobre
         * @return descripcion del sobre
         * @author Sebas
         */

        return descripcion;
    }
    
    public void setRemitente(String remitente){
        /**
         * Funcion encargada de establecer el remitente del sobre
         * @param remitente; remitente del sobre
         * @author Sebas
         */

        this.remitente = remitente;
    }
    
    public String getRemitente(){
        /**
         * Funcion encargada de obtener el remitente del sobre
         * @return remitente del sobre
         * @athor Sebas
         */

        return remitente;
    }
    
    public void setTipo(String opcion){
        /**
         * Funcion encargada de establecer el tipo de sobre
         * @param opcion: define el tipo de sobre
         * @author Sebas
         */

        if (opcion == "A"){
            tipo = "Aereo";
        }
        if (opcion == "M"){
            tipo = "Manilla";
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public String getTipo(){
        /**
         * Funcion encargada de obtener el tipo del sobre
         * @return tipo del sobre
         * @author Sebas
         */

        return tipo;
    }
    
    public void setContenido(String contenido){
        /**
         * Funcion encargada de establecer el contenido del sobre
         * @param contenido: contenido del sobre
         * @author Sebas
         */

        this.contenido = contenido;
    }
    
    public String getContenido(){
        /**
         * Funcion encargada de obtener el contenido del sobre
         * @return contenido del sobre
         * @author Sebas
         */

        return contenido;
    }
    
    public void setPeso(double peso){
        /**
         * Funcion encargada de establecer el peso del sobre
         * @param peso: peso del sobre
         * @author Sebas
         */

        this.peso = peso;
    }
    
    public double getPeso(){
        /**
         * Funcion encargada de obtener el peso del sobre
         * @return peso del sobre
         * @author Sebas
         */

        return peso;
    }

    public Calendar getFechaRecibido() {
        /**
         * Funcion encargada de obtener la fecha de recibido del sobre
         * @return fecha de recibido del sobre
         * @author José
         */
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        /**
         * Funcion encargada de establecer la fecha de recibido el sobre
         * @param fechaRecibido: fecha de recibido del sobre
         * @author José
         */
        this.fechaRecibido = fechaRecibido;
    }

    public Calendar getFechaEntrega() {
        /**
         * Funcion encargada de obtener la fecha entrega
         * @return fecha de entrega del sobre
         * @author José
         */
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        /**
         * Funcion encargada de establecer la fecha de entrega del sobre
         * @param fechaEntrega: fecha de entrega del sobre
         * @author José
         */
        this.fechaEntrega = fechaEntrega;
    }
    
    
    
    @Override
    public String toString(){
        /**
         * Funcion encargada de pasar todos los atributos de sobres a String
         * @return todos los atributos de sobres en string
         * @author Sebas
         */

        return "Sobre\n" + "ID: " + identificacion + "\n" + "Entregado: " + estaEntregado + "\n" +
                "Descripción: " + descripcion + "\n" + "Remitente: " + remitente + "\n" +
                "Tipo: " + tipo + "\n" + "Contenido: " + contenido + "\n" + "Peso: " + peso;
    }
}
