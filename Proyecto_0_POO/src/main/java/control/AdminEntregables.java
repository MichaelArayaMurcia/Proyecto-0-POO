/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Casillero;
import modelo.Cliente;
import modelo.estadoCasillero;

/**
 *
 * @author araya
 */
public class AdminEntregables {
    private AdmClientes adminClientes;
    private CreacionCounter adminCounter;

    public AdminEntregables(AdmClientes adminClientes, CreacionCounter Counter) {
        this.adminClientes = adminClientes;
        this.adminCounter = Counter;
    }
    
    public estadoCasillero EstadoCasillero(String identificador){
        ArrayList<Cliente> listaClientes = adminClientes.getListaClientes();
        ArrayList<Casillero> listaCasilleros = adminCounter.getListaCasilleros();
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente unCliente = listaClientes.get(i);
            if (unCliente.getID() == identificador) {
                for (int j = 0; j < listaCasilleros.size(); j++) {
                    if (listaCasilleros.get(j).getNumeroCasillero() == unCliente.getIdCasillero()) {
                        return listaCasilleros.get(j).getEstadoCasillero();
                    }
                }
            }
        }
        return null;
    }
    
    public estadoCasillero EstadoCasillero(int idCasillero){
        ArrayList<Casillero> listaCasilleros = adminCounter.getListaCasilleros();
        for (int i = 0; i < listaCasilleros.size(); i++) {
            if (listaCasilleros.get(i).getNumeroCasillero() == idCasillero) {
                return listaCasilleros.get(i).getEstadoCasillero();
            }
        }
        return null;
    }
    
    
    
}
