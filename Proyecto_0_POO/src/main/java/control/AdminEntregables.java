/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Calendar;
import modelo.Casillero;
import modelo.Cliente;
import modelo.Paquetes;
import modelo.Revistas;
import modelo.Sobres;
import modelo.estadoCasillero;

/**
 *
 * @author araya
 */
public class AdminEntregables {
    private AdmClientes adminClientes;
    private CreacionCounter adminCounter;
    private RecepcionArticulos AdminArticulos;

    public AdminEntregables(AdmClientes adminClientes, CreacionCounter Counter, RecepcionArticulos AdminArticulos) {
        /**
         * Constructor de la clase AdminEntregables
         * @param adminClientes: datos del administrador de clientes
         * @param Counter: datos del counter
         * @param AdminArticulos: datos del administrador de articulos
         * @author José
         */
        this.adminClientes = adminClientes;
        this.adminCounter = Counter;
        this.AdminArticulos = AdminArticulos;
    }

    public estadoCasillero EstadoCasillero(String identificador){
        /**
         * Funcion encargada de obtener el estado de un casillero en base al identificador del cliente dado
         * @param identificador: identificador del cliente
         * @return si el casillero esta ocupado o no, o null
         * @author José
         */
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
        /**
         * Funcion encargada de obtener el estado de un casillero en base al identificador del casillero dado
         * @param idCasillero: identificador del casillero
         * @return si el casillero esta ocupado o no, o null
         * @author José 
         */
        ArrayList<Casillero> listaCasilleros = adminCounter.getListaCasilleros();
        for (int i = 0; i < listaCasilleros.size(); i++) {
            if (listaCasilleros.get(i).getNumeroCasillero() == idCasillero) {
                return listaCasilleros.get(i).getEstadoCasillero();
            }
        }
        return null;
    }

    public void EntregablesRecibidos(int Dia, int Mes, int Anno){
        /**
         * Busca entregables recibidos en una fecha especifica
         * @param Dia: dia a buscar
         * @param Mes: mes a buscar
         * @param Anno: anno a buscar
         * @author José
         */
        ArrayList<Sobres> listaSobres = AdminArticulos.mostrarSobres();
        ArrayList<Paquetes> listaPaquetes = AdminArticulos.mostrarPaquetes();
        ArrayList<Revistas> listaRevistas = AdminArticulos.mostrarRevistas();
        for (int i = 0; i < listaSobres.size(); i++) {
            Sobres unSobre = listaSobres.get(i);
            Calendar fecha = unSobre.getFechaRecibido();
            if(fecha.get(Calendar.DATE)==Dia && fecha.get(Calendar.MONTH) == Mes && fecha.get(Calendar.YEAR)==Anno){
                System.out.println(unSobre.toString());
            }
        }
        for (int i = 0; i < listaPaquetes.size(); i++) {
            Paquetes unPaquete = listaPaquetes.get(i);
            Calendar fecha = unPaquete.getFechaRecibido();
            if(fecha.get(Calendar.DATE)==Dia && fecha.get(Calendar.MONTH) == Mes && fecha.get(Calendar.YEAR)==Anno){
                System.out.println(unPaquete.toString());
            }
        }
        for (int i = 0; i < listaRevistas.size(); i++) {
            Revistas unRevista = listaRevistas.get(i);
            Calendar fecha = unRevista.getFechaRecibido();
            if(fecha.get(Calendar.DATE)==Dia && fecha.get(Calendar.MONTH) == Mes && fecha.get(Calendar.YEAR)==Anno){
                System.out.println(unRevista.toString());
            }
        }

    }

    public void EntregablesEntregados(int Dia, int Mes, int Anno){
        /**
         * Busca entregables entregados en una fecha especifica
         * @param Dia: dia a buscar
         * @param Mes: mes a buscar
         * @param Anno: anno a buscar
         * @author José
         */
        ArrayList<Sobres> listaSobres = AdminArticulos.mostrarSobres();
        ArrayList<Paquetes> listaPaquetes = AdminArticulos.mostrarPaquetes();
        ArrayList<Revistas> listaRevistas = AdminArticulos.mostrarRevistas();
        for (int i = 0; i < listaSobres.size(); i++) {
            Sobres unSobre = listaSobres.get(i);
            Calendar fecha = unSobre.getFechaEntrega();
            if(fecha.get(Calendar.DATE)==Dia && fecha.get(Calendar.MONTH) == Mes && fecha.get(Calendar.YEAR)==Anno){
                System.out.println(unSobre.toString());
            }
        }
        for (int i = 0; i < listaPaquetes.size(); i++) {
            Paquetes unPaquete = listaPaquetes.get(i);
            Calendar fecha = unPaquete.getFechaEntrega();
            if(fecha.get(Calendar.DATE)==Dia && fecha.get(Calendar.MONTH) == Mes && fecha.get(Calendar.YEAR)==Anno){
                System.out.println(unPaquete.toString());
            }
        }
        for (int i = 0; i < listaRevistas.size(); i++) {
            Revistas unRevista = listaRevistas.get(i);
            Calendar fecha = unRevista.getFechaEntrega();
            if(fecha.get(Calendar.DATE)==Dia && fecha.get(Calendar.MONTH) == Mes && fecha.get(Calendar.YEAR)==Anno){
                System.out.println(unRevista.toString());
            }
        }

    }

    public String DetallesPendientes(){
        /**
         * Muestra los detalles de entregables pendientes de entregar
         * @return detalles de los diferentes entregables pendientes de entregar
         * @author José
         */
        ArrayList<Sobres> listaSobres = AdminArticulos.mostrarSobres();
        ArrayList<Paquetes> listaPaquetes = AdminArticulos.mostrarPaquetes();
        ArrayList<Revistas> listaRevistas = AdminArticulos.mostrarRevistas();

        String entregables = "";

        for (int i = 0; i < listaSobres.size(); i++) {
            Sobres unSobre = listaSobres.get(i);
            if (!unSobre.getEntregado()) {
                entregables += unSobre.toString()+"\n";
            }
        }
        for (int i = 0; i < listaPaquetes.size(); i++) {
            Paquetes unPaquete = listaPaquetes.get(i);
            if (!unPaquete.getEntregado()) {
                entregables += unPaquete.toString()+"\n";
            }
        }
        for (int i = 0; i < listaPaquetes.size(); i++) {
            Revistas unRevista = listaRevistas.get(i);
            if (!unRevista.getEntregado()) {
                entregables += unRevista.toString()+"\n";
            }
        }
        
        return entregables;
    }

}
