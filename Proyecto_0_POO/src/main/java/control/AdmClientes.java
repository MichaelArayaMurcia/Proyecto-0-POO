/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;

/**
 *
 * @author Sebas
 */
public class AdmClientes {
    
    private ArrayList<Cliente> listaClientes = new ArrayList();
    
    public boolean agregar(String id, String nombreClt, String correoClt, String telClt, String direccionClt, 
            String sexoClt, Date fechaN, String tipoClt){
        
        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                return false;
            }
        }
        
        Cliente unCliente = new Cliente(id, nombreClt, correoClt, telClt, direccionClt, 
            sexoClt, fechaN, tipoClt);
        listaClientes.add(unCliente);
        return true;
    }
    
    public boolean modificarCliente(String id){
        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                return true;
            }
        }
        return false;
    }
    
    public String consultarCliente(String id){
        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                return cltActual.toString();
            }
        }
        return "El cliente solicitado no existe en los registros."; 
    }
    
    public boolean eliminarCliente(String id){
        
        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                listaClientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
}
