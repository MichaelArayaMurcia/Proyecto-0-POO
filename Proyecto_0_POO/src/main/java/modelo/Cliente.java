/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Sebas
 */
public class Cliente {
    private String identificador;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String sexo;
    private Date fechaNacimiento;
    private String tipoCliente;
    private int idCasillero;
    
    public Cliente(String id, String nombreClt, String telClt, String direccionClt, Date fechaN, int idCasillero){
        /**
        * Constructor de la clase Cliente
        * @param id: identificador del cliente
        * @param nombreClt: nombre del cliente
        * @param telClt: telefono del cliente
        * @param direccionClt: direccion del cliente
        * @param fechaN: fecha de nacimiento del cliente
        * @param idCasillero: identificador del casillero
        * @author Sebas
        */

        identificador = id;
        nombre = nombreClt;
        telefono = telClt;
        direccion = direccionClt;
        fechaNacimiento = fechaN;
        this.idCasillero = idCasillero;
    }
    
    public Cliente(String id, String nombreClt, String correoClt, String telClt, String direccionClt, 
            String sexoClt, Date fechaN, String tipoClt, int idCasillero){
        /**
        * Constructor de la clase Cliente
        * @param id: identificador del cliente
        * @param nombreClt: nombre del cliente
        * @param correoClt: correo electronico del cliente
        * @param telClt: telefono del cliente
        * @param direccionClt: direccion del cliente
        * @param sexoClt: sexo del cliente
        * @param fechaN: fecha de nacimiento del cliente
        * @param tipoClt: tipo de cliente
        * @param idcasillero: identificador del casillero
        * @author Sebas
        */

        identificador = id;
        nombre = nombreClt;
        correo = correoClt;
        telefono = telClt;
        direccion = direccionClt;
        sexo = sexoClt;
        fechaNacimiento = fechaN;
        tipoCliente = tipoClt;
        this.idCasillero = idCasillero;
    }
    
    public void setID(String ID){
        /**
        * Funcion encargada de establecer el ID del cliente
        * @param ID: identificador del cliente
        * @author Sebas
        */

        identificador = ID;
    }
    
    public String getID(){
        /**
        * Funcion encargada de obtener el ID del cliente
        * @return identificador del cliente
        * @author Sebas
        */

        return identificador;
    }
    
    public void setNombre(String nombre){
        /**
        * Funcion encargada de establecer el Nombre del cliente
        * @param nombre: nombre del cliente
        * @author Sebas
        */

        this.nombre = nombre;
    }
    
    public String getNombre(){
        /**
        * Funcion encargada de obtener el nombre del cliente
        * @return nombre del cliente
        * @author Sebas
        */

        return nombre;
    }
    
    public void setCorreo(String correo){
        /**
        * Funcion encargada de establecer el correo del cliente
        * @param correo: correo electronico del cliente
        * @author Sebas
        */

        this.correo = correo;
    }
    
    public String getCorreo(){
        /**
        * Funcion encargada de obtener el correo electronico del cliente
        * @return correo electronico del cliente
        * @author Sebas
        */

        return correo;
    }
    
    public void setTelefono(String telefono){
        /**
        * Funcion encargada de establecer el telefono del cliente
        * @param telefono: numero telefonico del cliente
        * @author Sebas
        */

        this.telefono = telefono;
    }
    
    public String getTelefono(){
        /**
        * Funcion encargada de obtener el telefono del cliente
        * @return numero telefonico del cliente
        * @author Sebas
        */

        return telefono;
    }
    
    public void setDireccion(String direccion){
        /**
        * Funcion encargada de establecer la direccion del cliente
        * @param direccion: direccion del cliente
        * @author Sebas
        */

        this.direccion = direccion;
    }
    
    public String getDireccion(){
        /**
        * Funcion encargada de obtener la direccion del cliente
        * @return direccion del cliente
        * @author Sebas
        */

        return direccion;
    }
    
    public void setSexo(String sexo){
        /**
        * Funcion encargada de establecer el sexo del cliente
        * @param sexo: sexo del cliente
        * @author Sebas
        */

        this.sexo = sexo;
    }
    
    public String getSexo(){
        /**
        * Funcion encargada de obtener el sexo del cliente
        * @return sexo del cliente
        * @author Sebas
        */

        return sexo;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        /**
        * Funcion encargada de establecer la fecha de nacimiento del cliente
        * @param fechanacimiento: fecha de nacimiento del cliente
        * @author Sebas
        */

        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Date getFechaNacimiento(){
        /**
        * Funcion encargada de obtener la fecha de nacimiento del cliente
        * @return fecha de nacimiento del cliente
        * @author Sebas
        */

        return fechaNacimiento;
    }
    
    public void setTipoCliente(String tCliente){
        /**
        * Funcion encargada de establecer el tipo del cliente
        * @param tCliente: tipo del cliente
        * @author Sebas
        */

        tipoCliente = tCliente;
    }
    
    public String getTipoCliente(){
        /**
        * Funcion encargada de obtener el tipo del cliente
        * @return tipo del cliente
        * @author Sebas
        */

        return tipoCliente;
    }

    public int getIdCasillero() {
        /**
        * Funcion encargada de obtener el identificador del casillero
        * @return identificador del casillero
        * @author José
        */
        return idCasillero;
    }

    public void setIdCasillero(int idCasillero) {
        /**
         * Funcion encargada de establecer el identificador del casillero
         * @param idCasillero: identificador del casillero
         * @author José
         */
        this.idCasillero = idCasillero;
    }
    
    
    @Override
    public String toString(){
        /**
        * Funcion encargada de pasar todos los atributos de cliente a String
        * @return todos los atributos de cliente en string
        * @author Sebas
        */

        return "Cliente \n" + "ID: " + identificador + "\n" + "Nombre: " + nombre + "\n"
                + "Correo: " + correo + "\n" + "Telefono: " + telefono + "\n" + "Dirección: " + direccion +
                "\n" + "Sexo" + sexo + "\n" + "Fecha de nacimiento: " +
                fechaNacimiento + "\n" + "Tipo de cliente: " + tipoCliente;
    }
}