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
    private int CasilleroActual = 1001;
    
    public AdmClientes(){
    }
    
    public boolean agregar(String id, String nombreClt, String correoClt, String telClt, String direccionClt, 
            String sexoClt, Date fechaN, String tipoClt){
            /**
        * Funcion encargada de agregar un cliente a la lista de clientes
        * @param id: identificador del cliente
        * @param nombreClt: nombre del cliente
        * @param correoClt: correo del cliente
        * @param telClt: telefono del cliente
        * @param direccionClt: direccion del cliente
        * @param sexoClt: sexo del cliente 
        * @param fechaN: fecha de nacimiento del cliente
        * @param tipoClt: tipo de cliente
        * @author Sebas
        */

        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                return false;
            }
        }
        
        Cliente unCliente = new Cliente(id, nombreClt, correoClt, telClt, direccionClt, 
            sexoClt, fechaN, tipoClt, CasilleroActual);
        listaClientes.add(unCliente);
        CasilleroActual+=1;
        return true;
    }
    
    public boolean modificarCliente(String id){
        /**
        * Funcion encargada de verificar si el cliente es modificable
        * @param id: identificador del cliente
        * @author Sebas
        */
        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                return true;
            }
        }
        return false;
    }
    
    public String consultarCliente(String id){
        /**
        * Funcion encargada de consultar el cliente
        * @param id: identificador del cliente
        * @author Sebas
        */

        for (int i=0; i < listaClientes.size(); i++){
            Cliente cltActual = listaClientes.get(i);
            if (id == cltActual.getID()) {
                return cltActual.toString();
            }
        }
        return "El cliente solicitado no existe en los registros."; 
    }
    
    public boolean eliminarCliente(String id){
        /**
        * Funcion encargada de eliminar el cliente
        * @param id: identificador del cliente
        * @author Sebas
        */

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
        /**
         * Funcion encargado de obtener la lista de clientes
         * @return lista de clientes
         * @José
         */
        return listaClientes;
    }
    
    
}
