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
    
    public Cliente(String id, String nombreClt, String telClt, String direccionClt, Date fechaN){
        identificador = id;
        nombre = nombreClt;
        telefono = telClt;
        direccion = direccionClt;
        fechaNacimiento = fechaN;
    }
    
    public Cliente(String id, String nombreClt, String correoClt, String telClt, String direccionClt, 
            String sexoClt, Date fechaN, String tipoClt){
        identificador = id;
        nombre = nombreClt;
        correo = correoClt;
        telefono = telClt;
        direccion = direccionClt;
        sexo = sexoClt;
        fechaNacimiento = fechaN;
        tipoCliente = tipoClt;
    }
    
    public void setID(String ID){
        identificador = ID;
    }
    
    public String getID(){
        return identificador;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setTipoCliente(String tCliente){
        tipoCliente = tCliente;
    }
    
    public String getTipoCliente(){
        return tipoCliente;
    }
    
    @Override
    public String toString(){
        return "Cliente \n" + "ID: " + identificador + "\n" + "Nombre: " + nombre + "\n"
                + "Correo: " + correo + "\n" + "Telefono: " + telefono + "\n" + "Dirección: " + direccion +
                "\n" + "Sexo" + sexo + "\n" + "Fecha de nacimiento: " +
                fechaNacimiento + "\n" + "Tipo de cliente: " + tipoCliente;
    }
}