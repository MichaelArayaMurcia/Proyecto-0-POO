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
public class Paquetes {
    private int identificacion;
    private boolean estaEntregado;
    private String descripcion;
    private String remitente;
    private String entregarEn;
    private boolean tieneElectronico;
    private boolean esFragil;
    private double peso;
    private Calendar fechaRecibido;
    private Calendar fechaEntrega;
    
    public Paquetes(){
        /**
        * Constructor de la clase Paquetes
        * @author Sebas
        */

    }
    
    public Paquetes(int id, String descrip, String remi, String entregaEn, double peso, Calendar FechaRecibido) {
        /**
        * Constructor de la clase Paquete
        * @param id: identificador de paquete
        * @param descrip: descripcion del paquete
        * @param remi: remitente del paquete
        * @param entregarEn: entregar en caja o bolsa
        * @param peso: peso del paquete
        * @param FechaRecibido: fecha en que se recibio el paquete 
        * @author Sebas
        */

        identificacion = id;
        descripcion = descrip;
        remitente = remi;
        entregarEn = entregaEn;
        this.peso = peso;
        this.fechaRecibido = FechaRecibido;
    }
    
    public void setID(int ID){
        /**
        * Funcion encargada de establecer el identificador del paquete
        * @param ID: identificador del paquete
        * @author Sebas
        */

        identificacion = ID;
    }
    
    public int getID(){
        /**
        * Funcion encargada de obtener el identificador del paquete
        * @return identificador del paquete
        * @author Sebas
        */

        return identificacion;
    }
    
    public void setEntregado(int opcion){
        /**
        * Funcion encargada de establecer si el paquete esta entregado o no
        * @param opcion: numero que define el estado del paquete
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
        * Funcion encargada de obtener el estado de un paquete
        * @return estado del paquete
        * @author Sebas
        */

        return estaEntregado;
    }
    
    public void setDescripcion(String descripcion){
        /**
        * Funcion encargada de establecer la descripcion del paquete
        * @param descripcion: descripcion del paquete
        * @author Sebas
        */

        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        /**
        * Funcion encargada de obtener la descripcion
        * @return descripcion del paquete
        * @author Sebas 
        */

        return descripcion;
    }
    
    public void setRemitente(String remitente){
        /**
        * Funcion encargada de establecer el remitente del paquete
        * @param remitente: remitente del paquete
        * @author Sebas
        */

        this.remitente = remitente;
    }
    
    public String getRemitente(){
        /**
        * Funcion encargada de obtener el remitente del paquete
        * @return remitente del paquete
        * @author Sebas
        */

        return remitente;
    }
    
    public void setEntregarEn(String opcion){
        /**
        * Funcion encargada de establecer donde entregar el paquete
        * @param opcion: entregar en caja o bolsa
        * @author Sebas
        */

        if (opcion == "C"){
            entregarEn = "Caja";
        }
        if (opcion == "B"){
            entregarEn = "Bolsa";
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public String getEntregarEn(){
        /**
        * Funcion encargada de obtener donde entregar el paquete
        * @return en que entregar el paquete
        * @author Sebas
        */

        return entregarEn;
    }
    
    public void setElectronico(int opcion){
        /**
        * Funcion encargada de establecer si el paquete trae o no un electronico
        * @param opcion: si trae o no electronico
        * @author Sebas
        */

        if (opcion == 0){
            tieneElectronico = false;
        }
        if (opcion == 1){
            tieneElectronico = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getElectronico(){
        /**
        * Funcion encargada de obtener si el paquete trae o no un elctronico
        * @return si trae electronico o no
        * @author Sebas
        */

        return tieneElectronico;
    }
    
    public void setFragil(int opcion){
        /**
        * Funcion encargada de establecer si el paquete es fragil o no
        * @param opcion: si es fragil o no
        * @author Sebas
        */

        if (opcion == 0){
            esFragil = false;
        }
        if (opcion == 1){
            esFragil = true;
        }
        else{
            System.out.println("Valor no valido.");
        }
    }
    
    public boolean getFragil(){
        /**
        * Funcion encargada de obtener si el paquete es fragil o no
        * @return si es fragil o no
        * @author Sebas
        */

        return esFragil;
    }
    
    public void setPeso(double peso){
        /**
        * Funcion encargada de establecer el peso
        * @param peso: peso del paquete
        * @author Sebas
        */

        this.peso = peso;
    }
    
    public double getPeso(){
        /**
        * Funcion encargada de obtener el peso
        * @return peso del paquete
        * @author Sebas
        */

        return peso;
    }

    public Calendar getFechaRecibido() {
        /**
         * Funcion encargada de obtener la fecha de recibido de un articulo
         * @return fecha de recibido del paquete
         * @author José
         */
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        /**
         * Funcion encargada de establecer la fecha de recibido de un articulo
         * @param fechaRecibido: fecha de recibido de un articulo
         * @author José
         */
        this.fechaRecibido = fechaRecibido;
    }

    public Calendar getFechaEntrega() {
        /**
         * Funcion encargada de obtener la fecha de entrega de un articulo
         * @return fecha de entrega de un articulo
         * @author José
         */
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        /**
         * Funcion encargada de establecer la fecha de entrega de un articulo
         * @param fechaEntrega: fecha de entrega del articulo
         * @author José
         */
        this.fechaEntrega = fechaEntrega;
    }
    
    
    
    @Override
    public String toString(){
        /**
         * Funcion encargada de pasar todos los atributos de paquetes a String
         * @return todos los atributos de paquetes en string
         * @author Sebas
         */

        return "Paquete\n" + "ID: " + identificacion + "\n" + "Entregado: " + estaEntregado + "\n" +
                "Descripcion: " + descripcion + "\n" + "Remitente: " + remitente + "\n" +
                "Entregar en: " + entregarEn + "\n" + "Contiene artículo electrónico: " + tieneElectronico + "\n"
                + "Es frágil: " + esFragil + "\n" + "Peso: " + peso;
    }
}

