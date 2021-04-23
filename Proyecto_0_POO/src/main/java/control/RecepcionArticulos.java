/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
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
    
    public boolean registrarPaquete(int ident, String descrip, String remi, String opcEntregar, int opcElec, int opcFragil, double peso){
        
        for (int i=0; i < listaPaquetes.size(); i++){
            Paquetes packAct = listaPaquetes.get(i);
            if (ident == packAct.getID()) {
                return false;
            }
        }
        Paquetes unPaquete = new Paquetes();
        unPaquete.setID(ident);
        unPaquete.setDescripcion(descrip);
        unPaquete.setRemitente(remi);
        unPaquete.setEntregarEn(opcEntregar);
        unPaquete.setElectronico(opcElec);
        unPaquete.setFragil(opcFragil);
        unPaquete.setPeso(peso);
        listaPaquetes.add(unPaquete);
        return true;
    }
    
    public boolean registrarRevista(int ident, String descrip, String remi, String tema, String nombre, double peso, int opcCatalogo){
        
        for (int i=0; i < listaRevistas.size(); i++){
            Revistas revAct = listaRevistas.get(i);
            if (ident == revAct.getID()) {
                return false;
            }
        }
        
        Revistas unaRevista = new Revistas();
        unaRevista.setID(ident);
        unaRevista.setDescripcion(descrip);
        unaRevista.setRemitente(remi);
        unaRevista.setTema(tema);
        unaRevista.setNombre(nombre);
        unaRevista.setPeso(peso);
        unaRevista.setCatalogo(opcCatalogo);
        listaRevistas.add(unaRevista);
        return true;
    }
    
    public boolean registrarSobre(int ident, String remi, String descrip, String contenido, double peso, String opcTipo){
        
        for (int i=0; i < listaSobres.size(); i++){
            Sobres sobreAct = listaSobres.get(i);
            if (ident == sobreAct.getID()) {
                return false;
            }
        }
        
        Sobres unSobre = new Sobres();
        unSobre.setID(ident);
        unSobre.setRemitente(remi);
        unSobre.setDescripcion(descrip);
        unSobre.setContenido(contenido);
        unSobre.setPeso(peso);
        unSobre.setTipo(opcTipo);
        listaSobres.add(unSobre);
        return true;
    }
    
    public ArrayList mostrarPaquetes(){
        return listaPaquetes;
    }
    
    public ArrayList mostrarRevistas(){
        return listaRevistas;
    }
    
    public ArrayList mostrarSobres(){
        return listaSobres;
    }
    
    public boolean retirarPaquete(int ident){
        
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
        
        for (int i=0; i < listaPaquetes.size(); i++){
            Paquetes packAct = listaPaquetes.get(i);
            if (ident == packAct.getID()) {
                return packAct;
            }
        }
        return null;
    }
    
    public Revistas consultarRevista(int ident){
        
        for (int i=0; i < listaRevistas.size(); i++){
            Revistas revAct = listaRevistas.get(i);
            if (ident == revAct.getID()) {
                return revAct;
            }
        }
        return null;
    }
    
    public Sobres consultarSobre(int ident){
        for (int i=0; i < listaSobres.size(); i++){
            Sobres sobreAct = listaSobres.get(i);
            if (ident == sobreAct.getID()) {
                return sobreAct;
            }
        }
        return null;
    }
}
