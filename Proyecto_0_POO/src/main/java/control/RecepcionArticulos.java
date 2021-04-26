/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Calendar;
import modelo.CambioDolar;
import modelo.Cliente;
import modelo.Paquetes;
import modelo.Revistas;
import modelo.Sobres;

/**
 *
 * @author Sebas
 */
public class RecepcionArticulos {
    
    private ArrayList<Paquetes> listaPaquetes = new ArrayList();
    private ArrayList<Revistas> listaRevistas = new ArrayList();
    private ArrayList<Sobres> listaSobres = new ArrayList();
    
    public RecepcionArticulos(){
    }
    
    public boolean registrarPaquete(int ident, String descrip, String remi, String opcEntregar, int opcElec, int opcFragil, double peso){
        /**
        * Funcion encargada de registrar paquetes en la lista de paquetes
        * @param ident: identificador del paquete
        * @param descrip: descripcion del paquete
        * @param remi: remitente del paquete
        * @param opcEntregar: en que hay que entregar el paquete
        * @param opcElec: define si el paquete tiene o no un electronico
        * @param opcFragil: defne si el paquete es fragil o no
        * @param peso: peso del paquete
        * @return true/false: si se pudo registrar o no el paquete
        * @author Sebas
        */

        for (int i=0; i < listaPaquetes.size(); i++){
            Paquetes packAct = listaPaquetes.get(i);
            if (ident == packAct.getID()) {
                return false;
            }
        }
        
        Paquetes unPaquete = new Paquetes();
        Calendar FechaRecibido = Calendar.getInstance();
        unPaquete.setID(ident);
        unPaquete.setDescripcion(descrip);
        unPaquete.setRemitente(remi);
        unPaquete.setEntregarEn(opcEntregar);
        unPaquete.setElectronico(opcElec);
        unPaquete.setFragil(opcFragil);
        unPaquete.setPeso(peso);
        unPaquete.setFechaRecibido(FechaRecibido);
        listaPaquetes.add(unPaquete);
        return true;
    }
    
    public boolean registrarRevista(int ident, String descrip, String remi, String tema, String nombre, double peso, int opcCatalogo){
        /**
        * Funcion encargada de registrar revistas en la lista de revistas
        * @param ident: identificador de la revista
        * @param descrip: descripcion de la revista
        * @param remi: remitente de la revista
        * @param tema: tema de la revista
        * @param nombre: nombre de la revista
        * @param peso: peso de la revista
        * @param opcCatalogo: define si la revista es un catalogo o no
        * @return true/false: si se pudo registrar o no la revista
        * @author Sebas
        */

        for (int i=0; i < listaRevistas.size(); i++){
            Revistas revAct = listaRevistas.get(i);
            if (ident == revAct.getID()) {
                return false;
            }
        }
        
        Calendar FechaRecibido = Calendar.getInstance();
        Revistas unaRevista = new Revistas();
        unaRevista.setID(ident);
        unaRevista.setDescripcion(descrip);
        unaRevista.setRemitente(remi);
        unaRevista.setTema(tema);
        unaRevista.setNombre(nombre);
        unaRevista.setCatalogo(opcCatalogo);
        unaRevista.setFechaRecibido(FechaRecibido);
        listaRevistas.add(unaRevista);
        return true;
    }
    
    public boolean registrarSobre(int ident, String remi, String descrip, String contenido, double peso, String opcTipo){
        /**
        * Funcion encargada de registrar sobres en la lista de sobres
        * @param ident: identificador del sobre
        * @param descrip: descripcion del sobre
        * @param remi: remitente del sobre
        * @param contenido: contenido del sobre
        * @param opcTipo: tipo de sobre
        * @param peso: peso del sobre
        * @return true/false: si se pudo registrar o no el sobre
        * @author Sebas
        */

        for (int i=0; i < listaSobres.size(); i++){
            Sobres sobreAct = listaSobres.get(i);
            if (ident == sobreAct.getID()) {
                return false;
            }
        }
        Calendar FechaRecibido = Calendar.getInstance();
        Sobres unSobre = new Sobres();
        unSobre.setID(ident);
        unSobre.setRemitente(remi);
        unSobre.setDescripcion(descrip);
        unSobre.setContenido(contenido);
        unSobre.setPeso(peso);
        unSobre.setTipo(opcTipo);
        unSobre.setFechaRecibido(FechaRecibido);
        listaSobres.add(unSobre);
        return true;
    }
    
    public ArrayList mostrarPaquetes(){
        /**
        * Funcion encargada de mostrar la lista de paquetes
        * @return ArrayList con los paquetes registrados
        * @author Sebas
        */

        return listaPaquetes;
    }
    
    public ArrayList mostrarRevistas(){
        /**
        * Funcion encargada de mostrar la lista de revistas
        * return ArrayList con las revistas registradas
        * @author Sebas
        */

        return listaRevistas;
    }
    
    public ArrayList mostrarSobres(){
        /**
        * Funcion encargada de mostrar la lista de sobres
        * @return ArrayList con los sobres registrados
        * @author Sebas
        */

        return listaSobres;
    }
    
    public boolean retirarPaquete(int ident){
        /**
        * Funcion encargada de retirar paquetes
        * @param identificador: ID del paquete a retirar
        * @return true/false si se puede o no retirar el paquete
        * @author Sebas
        */

        for (int i=0; i < listaPaquetes.size(); i++){
            Paquetes packAct = listaPaquetes.get(i);
            if (ident == packAct.getID()) {
                listaPaquetes.remove(packAct);
                return true;
            }
        }
        return false;
    }
    
    public boolean retirarRevista(int ident){
        /**
        * Funcion encargada de retirar revistas
        * @param identificador: ID de la revista a retirar
        * @return true/false si se puede o no retirar la revista
        * @author Sebas
        */

        for (int i=0; i < listaRevistas.size(); i++){
            Revistas revAct = listaRevistas.get(i);
            if (ident == revAct.getID()) {
                listaRevistas.remove(revAct);
                return true;
            }
        }
        return false;
    }
    
    public boolean retirarSobres(int ident){
        /**
        * Funcion encargada de retirar sobres
        * @param identificador: ID del sobre a retirar
        * @return true/false si se puede o no retirar el sobre
        * @author Sebas
        */

        for (int i=0; i < listaSobres.size(); i++){
            Sobres sobreAct = listaSobres.get(i);
            if (ident == sobreAct.getID()) {
                listaSobres.remove(sobreAct);
                return true;
            }
        }
        return false;
    }
    
    public Paquetes consultarPaquete(int ident){
        /**
        * Funcion encargada de consultar paquetes
        * @param identificador: ID del paquete a consultar
        * @return packAct/null si se encontro el objeto o no 
        * @author Sebas
        */

        for (int i=0; i < listaPaquetes.size(); i++){
            Paquetes packAct = listaPaquetes.get(i);
            if (ident == packAct.getID()) {
                return packAct;
            }
        }
        return null;
    }
    
    public Revistas consultarRevista(int ident){
        /**
        * Funcion encargada de consultar revistas
        * @param identificador: ID de la revista a consultar
        * @return revAct/null si se encontro el objeto o no 
        * @author Sebas
        */

        for (int i=0; i < listaRevistas.size(); i++){
            Revistas revAct = listaRevistas.get(i);
            if (ident == revAct.getID()) {
                return revAct;
            }
        }
        return null;
    }
    
    public Sobres consultarSobre(int ident){
        /**
        * Funcion encargada de consultar sobres
        * @param identificador: ID del sobre a consultar
        * @return sobreAct/null si se encontro el objeto o no 
        * @author Sebas
        */

        for (int i=0; i < listaSobres.size(); i++){
            Sobres sobreAct = listaSobres.get(i);
            if (ident == sobreAct.getID()) {
                return sobreAct;
            }
        }
        return null;
    }
    
    public double CalcularPrecioSobre(ArrayList<Sobres> listaSobres){
        double precio = 0;
        for (int i = 0; i < listaSobres.size(); i++) {
            Sobres unSobre = listaSobres.get(i);
            unSobre.setFechaEntrega(Calendar.getInstance());
            if (unSobre.getTipo() == "Manila" && unSobre.getContenido() == "Documento") {
                precio += 1;
            }else if(unSobre.getTipo() == "Aereo" && unSobre.getContenido() != "Documento"){
                precio+=1;
            }
            else if(unSobre.getTipo() == "Manila" && unSobre.getContenido() != "Documento"){
                precio += 2;
            }
        }
        return precio;
    }
    
    public double CalcularPrecioPaquete(ArrayList<Paquetes> listaPaquetes){
        double precio = 0;
        for (int i = 0; i < listaPaquetes.size(); i++) {
            Paquetes unPaquete = listaPaquetes.get(i);
            unPaquete.setFechaEntrega(Calendar.getInstance());
            double peso = unPaquete.getPeso();
            if(unPaquete.getElectronico() && unPaquete.getFragil()){
                precio += peso*0.02+4;
            }else if(unPaquete.getElectronico() || unPaquete.getFragil()){
                precio += peso*0.02+2;
            }
        }
        return precio;
    }
    
    public double CalcularPrecioRevista(ArrayList<Revistas> listaRevistas){
        double precio = 0;
        for (int i = 0; i < listaRevistas.size(); i++) {
            Revistas unaRevista = listaRevistas.get(i);
            unaRevista.setFechaEntrega(Calendar.getInstance());
            if(!unaRevista.getCatalogo()){
                precio += 1;
            }
        }
        return precio;
    }
    
    public boolean retirarEntregables(ArrayList<Sobres> listaSobres, ArrayList<Paquetes> listaPaquetes,
                                        ArrayList<Revistas> listaRevistas, Cliente unCliente){
        
        double descuento = 0;
        if(unCliente.getTipoCliente() == "Normal"){
            descuento = 1;
        }else if(unCliente.getTipoCliente() == "Plata"){
            descuento = 0.05;
        }else{
            descuento = 0.1;
        }
        
        double PrecioTotal = CalcularPrecioSobre(listaSobres)+CalcularPrecioPaquete(listaPaquetes)+CalcularPrecioRevista(listaRevistas);
        PrecioTotal *= descuento;
        double cambioDolar = CambioDolar.ventaDolar();
        
        System.out.println("El precio total en dolares es: "+PrecioTotal);
        System.out.println("El precio total en colones es: "+PrecioTotal*cambioDolar);
        
        
        return true;
    }
}
