/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author Sebas
 */
public class GUI_Principal {
    
    public static void main(String args[]) throws FontFormatException, IOException {
        
        //@author Michael
        
        JFrame pantallaPrincipal = new JFrame("Pantalla Principal");
        //boolean mostrarBotonRegresar = false;

        //--------------
         /*
         *  #############################################
         *  #############################################
         *  ##--- Menu Principal ---##
         *  #############################################
         *  #############################################
         */
         
        //----------------------------------------------------------------------
        JPanel menuPrincipal = new JPanel();
        menuPrincipal.setPreferredSize(new Dimension(1153, 803));
        menuPrincipal.setVisible(true);
        menuPrincipal.setLayout(null);
        menuPrincipal.setBackground(Color.decode("#F2F4F7"));
        menuPrincipal.setBounds(0,0,1153,803);
        
        //----------------------------------------------------------------------
        
        InputStream is = GUI_Principal.class.getResourceAsStream("Mulish-VariableFont_wght.ttf");
        //Font font = Font.createFont(Font.TRUETYPE_FONT, is);
        
        JLabel tituloPantalla = new JLabel("Bienvenido a la aplicación");
        tituloPantalla.setSize(395, 345);
        tituloPantalla.setLocation(379, -86);
        //Font sizedFont1 = font.deriveFont(32f);
        //tituloPantalla.setFont(sizedFont1);

        //Font sizedFont3 = font.deriveFont(12f);
        
        //----------------------------------------------------------------------
        JButton botonCreacionCounter = new JButton("Creación de counter");  
        botonCreacionCounter.setSize(358, 46);
        botonCreacionCounter.setLocation(114,217);
        botonCreacionCounter.setBackground(Color.decode("#00C04D"));
       // Font sizedFont2 = font.deriveFont(16f);
       // botonCreacionCounter.setFont(sizedFont2);
        botonCreacionCounter.setForeground(Color.white);
        
        JButton botonAdministraciónClientes = new JButton("Administración de clientes");  
        botonAdministraciónClientes.setSize(358, 46);
        botonAdministraciónClientes.setLocation(114,348);
        botonAdministraciónClientes.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonAdministraciónClientes.setForeground(Color.white);
        
        JButton botonAdministraciónEntregables = new JButton("Administración de entregables");  
        botonAdministraciónEntregables.setSize(358, 46);
        botonAdministraciónEntregables.setLocation(114,479);
        botonAdministraciónEntregables.setBackground(Color.decode("#5A4FF3"));
       // botonAdministraciónEntregables.setFont(sizedFont2);
        botonAdministraciónEntregables.setForeground(Color.white);
        
        JButton botonAdministraciónEntregables2 = new JButton("Administración de entregables 2");  
        botonAdministraciónEntregables2.setSize(358, 46);
        botonAdministraciónEntregables2.setLocation(114,610);
        botonAdministraciónEntregables2.setBackground(Color.decode("#5A4FF3"));
       // botonAdministraciónEntregables2.setFont(sizedFont2);
        botonAdministraciónEntregables2.setForeground(Color.white);
        
        JButton botonConsultarCambio = new JButton("Consultar tipo de cambio");  
        botonConsultarCambio.setSize(358, 46);
        botonConsultarCambio.setLocation(774,217);
        botonConsultarCambio.setBackground(Color.decode("#5A4FF3"));
       // botonConsultarCambio.setFont(sizedFont2);
        botonConsultarCambio.setForeground(Color.white);        
        
        JButton botonListaPendientes = new JButton("Lista de clientes con paquetes pendientes");  
        botonListaPendientes.setSize(358, 46);
        botonListaPendientes.setLocation(774,348);
        botonListaPendientes.setBackground(Color.decode("#5A4FF3"));
       // botonListaPendientes.setFont(sizedFont2);
        botonListaPendientes.setForeground(Color.white);     
        
        JButton botonResumenContable = new JButton("Resumen Contable");  
        botonResumenContable.setSize(358, 46);
        botonResumenContable.setLocation(774,479);
        botonResumenContable.setBackground(Color.decode("#5A4FF3"));
        //botonResumenContable.setFont(sizedFont2);
        botonResumenContable.setForeground(Color.white);     
        
        //------------------ Eventos de los botones ----------------------------

        /*
         *  #############################################
         *  #############################################
         *  ##--- Componentes menu paneles ------------##
         *  #############################################
         *  #############################################
         */        
            //------------------ Paneles -------------------------------------------
        JPanel menuCounter1 = new JPanel();
        menuCounter1.setPreferredSize(new Dimension(1153, 803));
        menuCounter1.setVisible(true);
        menuCounter1.setLayout(null);
        menuCounter1.setBackground(Color.decode("#F2F4F7"));
        menuCounter1.setBounds(0,0,1153,803);
        
        JPanel menuAdminClientes1 = new JPanel();
        menuAdminClientes1.setPreferredSize(new Dimension(1153, 803));
        menuAdminClientes1.setVisible(true);
        menuAdminClientes1.setLayout(null);
        menuAdminClientes1.setBackground(Color.decode("#F2F4F7"));
        menuAdminClientes1.setBounds(0,0,1153,803);
        
        JPanel menuAdminClientesRegistrar = new JPanel();
        menuAdminClientesRegistrar.setPreferredSize(new Dimension(1153, 803));
        menuAdminClientesRegistrar.setVisible(false);
        menuAdminClientesRegistrar.setLayout(null);
        menuAdminClientesRegistrar.setBackground(Color.decode("#F2F4F7"));
        menuAdminClientesRegistrar.setBounds(0,0,1153,803);
        
        JPanel menuAdminClientesModificar1 = new JPanel();
        menuAdminClientesModificar1.setPreferredSize(new Dimension(1153, 803));
        menuAdminClientesModificar1.setVisible(false);
        menuAdminClientesModificar1.setLayout(null);
        menuAdminClientesModificar1.setBackground(Color.decode("#F2F4F7"));
        menuAdminClientesModificar1.setBounds(0,0,1153,803);
        
        JPanel menuAdminClientesModificar2 = new JPanel();
        menuAdminClientesModificar2.setPreferredSize(new Dimension(1153, 803));
        menuAdminClientesModificar2.setVisible(false);
        menuAdminClientesModificar2.setLayout(null);
        menuAdminClientesModificar2.setBackground(Color.decode("#F2F4F7"));
        menuAdminClientesModificar2.setBounds(0,0,1153,803);

        JPanel menuAdminClientesConsultar1 = new JPanel();
        menuAdminClientesConsultar1.setPreferredSize(new Dimension(1153, 803));
        menuAdminClientesConsultar1.setVisible(false);
        menuAdminClientesConsultar1.setLayout(null);
        menuAdminClientesConsultar1.setBackground(Color.decode("#F2F4F7"));
        menuAdminClientesConsultar1.setBounds(0,0,1153,803);
        
        JPanel menuAdminClientesEliminar1 = new JPanel();
        menuAdminClientesEliminar1.setPreferredSize(new Dimension(1153, 803));
        menuAdminClientesEliminar1.setVisible(false);
        menuAdminClientesEliminar1.setLayout(null);
        menuAdminClientesEliminar1.setBackground(Color.decode("#F2F4F7"));
        menuAdminClientesEliminar1.setBounds(0,0,1153,803);
        
        JPanel menuAdminEntregables1 = new JPanel();
        menuAdminEntregables1.setPreferredSize(new Dimension(1153, 803));
        menuAdminEntregables1.setVisible(false);
        menuAdminEntregables1.setLayout(null);
        menuAdminEntregables1.setBackground(Color.decode("#F2F4F7"));
        menuAdminEntregables1.setBounds(0,0,1153,803);

        JPanel menuAdminEntregables2 = new JPanel();
        menuAdminEntregables2.setPreferredSize(new Dimension(1153, 803));
        menuAdminEntregables2.setVisible(false);
        menuAdminEntregables2.setLayout(null);
        menuAdminEntregables2.setBackground(Color.decode("#F2F4F7"));
        menuAdminEntregables2.setBounds(0,0,1153,803);
        
        JPanel menuAdminEntregables3 = new JPanel();
        menuAdminEntregables3.setPreferredSize(new Dimension(1153, 803));
        menuAdminEntregables3.setVisible(false);
        menuAdminEntregables3.setLayout(null);
        menuAdminEntregables3.setBackground(Color.decode("#F2F4F7"));
        menuAdminEntregables3.setBounds(0,0,1153,803);
        
        JPanel menuAdminEntregables4 = new JPanel();
        menuAdminEntregables4.setPreferredSize(new Dimension(1153, 803));
        menuAdminEntregables4.setVisible(false);
        menuAdminEntregables4.setLayout(null);
        menuAdminEntregables4.setBackground(Color.decode("#F2F4F7"));
        menuAdminEntregables4.setBounds(0,0,1153,803);
        
        menuCounter1.setVisible(false);
        menuAdminClientes1.setVisible(false);
        
        JPanel menuAdminEntregables5 = new JPanel();
        menuAdminEntregables5.setPreferredSize(new Dimension(1153, 803));
        menuAdminEntregables5.setVisible(false);
        menuAdminEntregables5.setLayout(null);
        menuAdminEntregables5.setBackground(Color.decode("#F2F4F7"));
        menuAdminEntregables5.setBounds(0,0,1153,803);

        JPanel menuAdminEntregables6 = new JPanel();
        menuAdminEntregables6.setPreferredSize(new Dimension(1153, 803));
        menuAdminEntregables6.setVisible(false);
        menuAdminEntregables6.setLayout(null);
        menuAdminEntregables6.setBackground(Color.decode("#F2F4F7"));
        menuAdminEntregables6.setBounds(0,0,1153,803);
        
        //--------------------------------------------------------------------
        //jose
        JPanel menuAdminConsultaEntregables1 = new JPanel();
        menuAdminConsultaEntregables1.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaEntregables1.setVisible(false);
        menuAdminConsultaEntregables1.setLayout(null);
        menuAdminConsultaEntregables1.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaEntregables1.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaEntregables2 = new JPanel();
        menuAdminConsultaEntregables2.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaEntregables2.setVisible(false);
        menuAdminConsultaEntregables2.setLayout(null);
        menuAdminConsultaEntregables2.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaEntregables2.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaEntregables3 = new JPanel();
        menuAdminConsultaEntregables3.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaEntregables3.setVisible(false);
        menuAdminConsultaEntregables3.setLayout(null);
        menuAdminConsultaEntregables3.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaEntregables3.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaEntregables4 = new JPanel();
        menuAdminConsultaEntregables4.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaEntregables4.setVisible(false);
        menuAdminConsultaEntregables4.setLayout(null);
        menuAdminConsultaEntregables4.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaEntregables4.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaRecibidos1 = new JPanel();
        menuAdminConsultaRecibidos1.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaRecibidos1.setVisible(false);
        menuAdminConsultaRecibidos1.setLayout(null);
        menuAdminConsultaRecibidos1.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaRecibidos1.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaRecibidos2 = new JPanel();
        menuAdminConsultaRecibidos2.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaRecibidos2.setVisible(false);
        menuAdminConsultaRecibidos2.setLayout(null);
        menuAdminConsultaRecibidos2.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaRecibidos2.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaEntregados1 = new JPanel();
        menuAdminConsultaEntregados1.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaEntregados1.setVisible(false);
        menuAdminConsultaEntregados1.setLayout(null);
        menuAdminConsultaEntregados1.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaEntregados1.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaEntregados2 = new JPanel();
        menuAdminConsultaEntregados2.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaEntregados2.setVisible(false);
        menuAdminConsultaEntregados2.setLayout(null);
        menuAdminConsultaEntregados2.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaEntregados2.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaPendientes1 = new JPanel();
        menuAdminConsultaPendientes1.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaPendientes1.setVisible(false);
        menuAdminConsultaPendientes1.setLayout(null);
        menuAdminConsultaPendientes1.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaPendientes1.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaPendientes2 = new JPanel();
        menuAdminConsultaPendientes2.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaPendientes2.setVisible(false);
        menuAdminConsultaPendientes2.setLayout(null);
        menuAdminConsultaPendientes2.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaPendientes2.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaTipoCambio1 = new JPanel();
        menuAdminConsultaTipoCambio1.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaTipoCambio1.setVisible(false);
        menuAdminConsultaTipoCambio1.setLayout(null);
        menuAdminConsultaTipoCambio1.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaTipoCambio1.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaTipoCambio2 = new JPanel();
        menuAdminConsultaTipoCambio2.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaTipoCambio2.setVisible(false);
        menuAdminConsultaTipoCambio2.setLayout(null);
        menuAdminConsultaTipoCambio2.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaTipoCambio2.setBounds(0,0,1153,803);
        
        JPanel menuAdminConsultaTipoCambio3 = new JPanel();
        menuAdminConsultaTipoCambio3.setPreferredSize(new Dimension(1153, 803));
        menuAdminConsultaTipoCambio3.setVisible(false);
        menuAdminConsultaTipoCambio3.setLayout(null);
        menuAdminConsultaTipoCambio3.setBackground(Color.decode("#F2F4F7"));
        menuAdminConsultaTipoCambio3.setBounds(0,0,1153,803);
        
        JPanel menuAdminListaClientesPendientes = new JPanel();
        menuAdminListaClientesPendientes.setPreferredSize(new Dimension(1153, 803));
        menuAdminListaClientesPendientes.setVisible(false);
        menuAdminListaClientesPendientes.setLayout(null);
        menuAdminListaClientesPendientes.setBackground(Color.decode("#F2F4F7"));
        menuAdminListaClientesPendientes.setBounds(0,0,1153,803);
        
        JPanel menuAdminResumenContable = new JPanel();
        menuAdminResumenContable.setPreferredSize(new Dimension(1153, 803));
        menuAdminResumenContable.setVisible(false);
        menuAdminResumenContable.setLayout(null);
        menuAdminResumenContable.setBackground(Color.decode("#F2F4F7"));
        menuAdminResumenContable.setBounds(0,0,1153,803);
        //--------------------------------------------------------------------
        
        pantallaPrincipal.add(menuCounter1);
        pantallaPrincipal.add(menuAdminClientes1);
        pantallaPrincipal.add(menuAdminClientesRegistrar);
        pantallaPrincipal.add(menuAdminClientesModificar1);
        pantallaPrincipal.add(menuAdminClientesModificar2);
        pantallaPrincipal.add(menuAdminClientesConsultar1);
        pantallaPrincipal.add(menuAdminClientesEliminar1);
        pantallaPrincipal.add(menuAdminEntregables1);
        pantallaPrincipal.add(menuAdminEntregables2);
        pantallaPrincipal.add(menuAdminEntregables3);
        pantallaPrincipal.add(menuAdminEntregables4);
        pantallaPrincipal.add(menuAdminEntregables5);
        pantallaPrincipal.add(menuAdminEntregables6);
        
        //----------------------------------------------------------------------
         //jose
        pantallaPrincipal.add(menuAdminConsultaEntregables1);
        pantallaPrincipal.add(menuAdminConsultaEntregables2);
        pantallaPrincipal.add(menuAdminConsultaEntregables3);
        pantallaPrincipal.add(menuAdminConsultaEntregables4);
        pantallaPrincipal.add(menuAdminConsultaRecibidos1);
        pantallaPrincipal.add(menuAdminConsultaRecibidos2);
        pantallaPrincipal.add(menuAdminConsultaEntregados1);
        pantallaPrincipal.add(menuAdminConsultaEntregados2);
        pantallaPrincipal.add(menuAdminConsultaPendientes1);
        pantallaPrincipal.add(menuAdminConsultaPendientes2);
        pantallaPrincipal.add(menuAdminConsultaTipoCambio1);
        pantallaPrincipal.add(menuAdminConsultaTipoCambio2);
        pantallaPrincipal.add(menuAdminConsultaTipoCambio3);
        pantallaPrincipal.add(menuAdminListaClientesPendientes);
        pantallaPrincipal.add(menuAdminResumenContable);
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        
        //----------------------------------------------------------------------
        //--------------------- Botones de regresar ----------------------------
        JButton botonRegresarAMenuDesdeCreacionCounter1 = new JButton("Regresar");  
        botonRegresarAMenuDesdeCreacionCounter1.setSize(70, 68);
        botonRegresarAMenuDesdeCreacionCounter1.setLocation(24,20);
        botonRegresarAMenuDesdeCreacionCounter1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeCreacionCounter1.setForeground(Color.white);     
  
        JButton botonRegresarAMenuDesdeAdministracionClientes1 = new JButton("Regresar");  
        botonRegresarAMenuDesdeAdministracionClientes1.setSize(70, 68);
        botonRegresarAMenuDesdeAdministracionClientes1.setLocation(24,20);
        botonRegresarAMenuDesdeAdministracionClientes1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeAdministracionClientes1.setForeground(Color.white);     
  
        JButton botonRegresarDeAdminClientesRegistrar = new JButton("Regresar");  
        botonRegresarDeAdminClientesRegistrar.setSize(70, 68);
        botonRegresarDeAdminClientesRegistrar.setLocation(24,20);
        botonRegresarDeAdminClientesRegistrar.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarDeAdminClientesRegistrar.setForeground(Color.white);
       
        JButton botonRegresarDeAdminClientesModificar1 = new JButton("Regresar");  
        botonRegresarDeAdminClientesModificar1.setSize(70, 68);
        botonRegresarDeAdminClientesModificar1.setLocation(24,20);
        botonRegresarDeAdminClientesModificar1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarDeAdminClientesModificar1.setForeground(Color.white);
        
                JButton botonRegresarDeAdminClientesModificar2 = new JButton("Regresar");  
        botonRegresarDeAdminClientesModificar2.setSize(70, 68);
        botonRegresarDeAdminClientesModificar2.setLocation(24,20);
        botonRegresarDeAdminClientesModificar2.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarDeAdminClientesModificar2.setForeground(Color.white);
        
        JButton botonRegresarDeClientesConsultar1 = new JButton("Regresar");  
        botonRegresarDeClientesConsultar1.setSize(70, 68);
        botonRegresarDeClientesConsultar1.setLocation(24,20);
        botonRegresarDeClientesConsultar1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarDeClientesConsultar1.setForeground(Color.white);
        
        JButton botonRegresarDeEliminarCliente1 = new JButton("Regresar");
        botonRegresarDeEliminarCliente1.setSize(70, 68);
        botonRegresarDeEliminarCliente1.setLocation(24,20);
        botonRegresarDeEliminarCliente1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarDeEliminarCliente1.setForeground(Color.white);
        
        JButton botonRegresarDeAdministraciónEntregables1 = new JButton("Regresar");
        botonRegresarDeAdministraciónEntregables1.setSize(70, 68);
        botonRegresarDeAdministraciónEntregables1.setLocation(24,20);
        botonRegresarDeAdministraciónEntregables1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarDeAdministraciónEntregables1.setForeground(Color.white);
        
        JButton botonRegresarAMenuDesdeRegistroEntregable1 = new JButton("Regresar");
        botonRegresarAMenuDesdeRegistroEntregable1.setSize(70, 68);
        botonRegresarAMenuDesdeRegistroEntregable1.setLocation(24,20);
        botonRegresarAMenuDesdeRegistroEntregable1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeRegistroEntregable1.setForeground(Color.white);
        
        JButton botonRegresarAMenuDesdeRegistroDeArticulo1 = new JButton("Regresar");
        botonRegresarAMenuDesdeRegistroDeArticulo1.setSize(70, 68);
        botonRegresarAMenuDesdeRegistroDeArticulo1.setLocation(24,20);
        botonRegresarAMenuDesdeRegistroDeArticulo1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeRegistroDeArticulo1.setForeground(Color.white);
        
        JButton botonRegresarAMenuDesdeRetiroDeArticulo1 = new JButton("Regresar");
        botonRegresarAMenuDesdeRetiroDeArticulo1.setSize(70, 68);
        botonRegresarAMenuDesdeRetiroDeArticulo1.setLocation(24,20);
        botonRegresarAMenuDesdeRetiroDeArticulo1.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeRetiroDeArticulo1.setForeground(Color.white);
        
        JButton botonRegresarAMenuDesdeRegistroDeArticulo4 = new JButton("Regresar");
        botonRegresarAMenuDesdeRegistroDeArticulo4.setSize(70, 68);
        botonRegresarAMenuDesdeRegistroDeArticulo4.setLocation(24,20);
        botonRegresarAMenuDesdeRegistroDeArticulo4.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeRegistroDeArticulo4.setForeground(Color.white);
        
        JButton botonRegresarAMenuDesdeRegistroDeArticulo5 = new JButton("Regresar");
        botonRegresarAMenuDesdeRegistroDeArticulo5.setSize(70, 68);
        botonRegresarAMenuDesdeRegistroDeArticulo5.setLocation(24,20);
        botonRegresarAMenuDesdeRegistroDeArticulo5.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeRegistroDeArticulo5.setForeground(Color.white);
        
        JButton botonRegresarAMenuDesdeRegistroDeArticulo6 = new JButton("Regresar");
        botonRegresarAMenuDesdeRegistroDeArticulo6.setSize(70, 68);
        botonRegresarAMenuDesdeRegistroDeArticulo6.setLocation(24,20);
        botonRegresarAMenuDesdeRegistroDeArticulo6.setBackground(Color.decode("#6D7D8B"));
        //botonResumenContable.setFont(sizedFont2);
        botonRegresarAMenuDesdeRegistroDeArticulo6.setForeground(Color.white);
        //----------------------------------------------------------------------
        //------------------------ Botones del menu principal eventos-----------
        botonCreacionCounter.addActionListener((ActionEvent e) -> {
             menuPrincipal.setVisible(false);
             menuCounter1.setVisible(true);
             //mostrarBotonRegresar = true;
             botonRegresarAMenuDesdeCreacionCounter1.setVisible(true);
        });
         
        botonAdministraciónClientes.addActionListener((ActionEvent e) -> {
             menuPrincipal.setVisible(false);
             menuAdminClientes1.setVisible(true);
             
        });
        
        botonRegresarDeAdminClientesRegistrar.addActionListener((ActionEvent e) -> {
             menuAdminClientesRegistrar.setVisible(false);
             menuAdminClientes1.setVisible(true);
             
        });
        
        botonRegresarDeAdminClientesModificar1.addActionListener((ActionEvent e) -> {
            menuAdminClientesConsultar1.setVisible(false);
            menuAdminClientesModificar1.setVisible(false);
            menuAdminClientes1.setVisible(true);
            
        });
        
        botonRegresarDeAdminClientesModificar2.addActionListener((ActionEvent e) -> {
            menuAdminClientesModificar2.setVisible(false);
            menuAdminClientesModificar1.setVisible(true);
            
        });
        
        botonRegresarDeClientesConsultar1.addActionListener((ActionEvent e) -> {
            menuAdminClientesConsultar1.setVisible(false);
            menuAdminClientes1.setVisible(true);
        });
        
        botonAdministraciónEntregables2.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(false);
            //menuAdminEntregables1.setVisible(true);
            menuAdminConsultaEntregables1.setVisible(true);
        });
        
        botonConsultarCambio.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(false);
            menuAdminConsultaTipoCambio1.setVisible(true);
        });
        
        //------------------ agregación de elementos ---------------------------
        menuPrincipal.add(tituloPantalla);
        menuPrincipal.add(botonCreacionCounter);
        menuPrincipal.add(botonAdministraciónClientes);
        menuPrincipal.add(botonAdministraciónEntregables);
        menuPrincipal.add(botonAdministraciónEntregables2);
        menuPrincipal.add(botonConsultarCambio);
        menuPrincipal.add(botonListaPendientes);
        menuPrincipal.add(botonResumenContable);
        
        pantallaPrincipal.add(menuPrincipal);
        pantallaPrincipal.setSize(1153,803);
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaPrincipal.setLocationRelativeTo(null);
        
        
        
        /*
         *  #############################################
         *  #############################################
         *  ##--- Componentes menu counter ------------##
         *  #############################################
         *  #############################################
         */
        
        JLabel tituloCounter1 = new JLabel("Creación de counter");
        tituloCounter1.setSize(395, 345);
        tituloCounter1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1);
        
        JLabel counterNombre = new JLabel("Nombre");
        counterNombre.setSize(74, 16);
        counterNombre.setLocation(114, 181);
        //counterNombre.setFont(sizedFont3);
        counterNombre.setForeground(Color.decode("#000000"));  
        
        JTextField counterNombreInput = new JTextField();
        counterNombreInput.setSize(357, 45);
        counterNombreInput.setLocation(114, 217);
        
        JLabel counterCedulaJuridica = new JLabel("Cedula Juridica");
        counterCedulaJuridica.setSize(158, 16);
        counterCedulaJuridica.setLocation(114, 312);
       // counterCedulaJuridica.setFont(sizedFont3);
        counterCedulaJuridica.setForeground(Color.decode("#000000"));  
        
        JTextField counterCedulaJuridicaInput = new JTextField();
        counterCedulaJuridicaInput.setSize(357, 45);
        counterCedulaJuridicaInput.setLocation(114, 348);
        
        JLabel counterCantidadCasilleros = new JLabel("Cantidad casilleros");
        counterCantidadCasilleros.setSize(158, 16);
        counterCantidadCasilleros.setLocation(114, 443);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterCantidadCasilleros.setForeground(Color.decode("#000000"));  
        
        JTextField counterCantidadCasillerosInput = new JTextField();
        counterCantidadCasillerosInput.setSize(357, 45);
        counterCantidadCasillerosInput.setLocation(114, 479);
        
        JLabel counterDireccion = new JLabel("Direccion");
        counterDireccion.setSize(97, 16);
        counterDireccion.setLocation(681, 181);
        //counterNombre.setFont(sizedFont3);
        counterDireccion.setForeground(Color.decode("#000000"));  
        
        JTextField counterDireccionInput = new JTextField();
        counterDireccionInput.setSize(452, 177);
        counterDireccionInput.setLocation(681, 217);
        
        JButton botonCrearCounter = new JButton("Crear counter");  
        botonCrearCounter.setSize(169, 46);
        botonCrearCounter.setLocation(492,741);
        botonCrearCounter.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonCrearCounter.setForeground(Color.white);
        
        //------------------ Eventos de los botones de regresar ----------------
        
        botonRegresarAMenuDesdeCreacionCounter1.addActionListener((ActionEvent e) -> {
             menuPrincipal.setVisible(true);
             menuCounter1.setVisible(false);
             botonRegresarAMenuDesdeCreacionCounter1.setVisible(false);
             //botonRegresarAMenu.setVisible(mostrarBotonRegresar);
                         
        });
        
        botonRegresarAMenuDesdeAdministracionClientes1.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(true);
            menuAdminClientes1.setVisible(false);
        });
         
        //------------------ agregación de elementos ---------------------------
        
        menuCounter1.add(tituloCounter1);
        menuCounter1.add(counterNombre);
        menuCounter1.add(counterNombreInput);   
        menuCounter1.add(counterCedulaJuridica);
        menuCounter1.add(counterCedulaJuridicaInput);
        menuCounter1.add(counterCantidadCasilleros);
        menuCounter1.add(counterCantidadCasillerosInput);
        menuCounter1.add(botonRegresarAMenuDesdeCreacionCounter1);
        menuCounter1.add(botonCrearCounter);
        menuCounter1.add(counterDireccion);
        menuCounter1.add(counterDireccionInput);
        
         /*
         *  #############################################
         *  #############################################
         *  ##--- Componentes menu clientes -----------##
         *  #############################################
         *  #############################################
         */
        
        //----------------------------------------------------------------------
 
       
                
        JLabel tituloAdminClientes1 = new JLabel("Administración de clientes");
        tituloCounter1.setSize(395, 45);
        tituloCounter1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
                
        JButton botonRegistrarCliente1 = new JButton("Registrar Cliente");  
        botonRegistrarCliente1.setSize(169, 46);
        botonRegistrarCliente1.setLocation(492,217);
        botonRegistrarCliente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRegistrarCliente1.setForeground(Color.white);
        
        JButton botonModificarCliente1 = new JButton("Modificar Cliente");  
        botonModificarCliente1.setSize(169, 46);
        botonModificarCliente1.setLocation(492,349);
        botonModificarCliente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonModificarCliente1.setForeground(Color.white);
        
        JButton botonConsultarCliente1 = new JButton("Consultar Cliente");  
        botonConsultarCliente1.setSize(169, 46);
        botonConsultarCliente1.setLocation(492,479);
        botonConsultarCliente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonConsultarCliente1.setForeground(Color.white);
        
        JButton botonEliminarCliente1 = new JButton("Eliminar Cliente");  
        botonEliminarCliente1.setSize(169, 46);
        botonEliminarCliente1.setLocation(492,610);
        botonEliminarCliente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonEliminarCliente1.setForeground(Color.white);
        
        JButton botonVisualizarClientes1 = new JButton("Visualizar todos los clientes");  
        botonVisualizarClientes1.setSize(247, 46);
        botonVisualizarClientes1.setLocation(492,741);
        botonVisualizarClientes1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonVisualizarClientes1.setForeground(Color.white);
                
        //------------------ Eventos de los botones ----------------------------

        //----------------------------------------------------------------------
         
        botonRegistrarCliente1.addActionListener((ActionEvent e) -> {
            menuAdminClientesRegistrar.setVisible(true);
            menuAdminClientes1.setVisible(false);
        });
        
        botonModificarCliente1.addActionListener((ActionEvent e) -> {
            menuAdminClientesModificar1.setVisible(true);
            menuAdminClientes1.setVisible(false);
        });
        
        botonConsultarCliente1.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(false);
            menuAdminClientes1.setVisible(false);
            menuAdminClientesConsultar1.setVisible(true);
        });
        
        botonEliminarCliente1.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(false);
            menuAdminClientesEliminar1.setVisible(true);
        });
        
        //------------------ agregación de elementos ---------------------------
        
        menuAdminClientes1.add(botonRegresarAMenuDesdeAdministracionClientes1);
        menuAdminClientes1.add(tituloAdminClientes1);
        menuAdminClientes1.add(botonRegistrarCliente1);
        menuAdminClientes1.add(botonModificarCliente1);
        menuAdminClientes1.add(botonConsultarCliente1);
        menuAdminClientes1.add(botonEliminarCliente1);
        menuAdminClientes1.add(botonVisualizarClientes1);

         /*
         *  #############################################
         *  #############################################
         *  ##--- Componentes menu registrar clientes -##
         *  #############################################
         *  #############################################
         */
        
        //----------------------------------------------------------------------
        JLabel tituloRegistroClientes1 = new JLabel("Creación de cliente");
        tituloRegistroClientes1.setSize(395, 45);
        tituloRegistroClientes1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
        JLabel counterClienteNombre = new JLabel("Nombre");
        counterClienteNombre.setSize(74, 16);
        counterClienteNombre.setLocation(114, 181);
        //counterNombre.setFont(sizedFont3);
        counterClienteNombre.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteNombreInput = new JTextField();
        counterClienteNombreInput.setSize(357, 45);
        counterClienteNombreInput.setLocation(114, 217);
        
        JLabel counterClienteCedulaJuridica = new JLabel("Cedula Juridica");
        counterClienteCedulaJuridica.setSize(158, 16);
        counterClienteCedulaJuridica.setLocation(114, 312);
       // counterCedulaJuridica.setFont(sizedFont3);
        counterCedulaJuridica.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteCedulaJuridicaInput = new JTextField();
        counterClienteCedulaJuridicaInput.setSize(357, 45);
        counterClienteCedulaJuridicaInput.setLocation(114, 348);
        
        JLabel counterClienteCorreo = new JLabel("Correo");
        counterClienteCorreo.setSize(158, 16);
        counterClienteCorreo.setLocation(114, 443);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteCorreo.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteCorreoInput = new JTextField();
        counterClienteCorreoInput.setSize(357, 45);
        counterClienteCorreoInput.setLocation(114, 479);
        
        JLabel counterClienteTelefono = new JLabel("Telefono");
        counterClienteTelefono.setSize(158, 16);
        counterClienteTelefono.setLocation(114, 574);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteTelefono.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteTelefonoInput = new JTextField();
        counterClienteTelefonoInput.setSize(357, 45);
        counterClienteTelefonoInput.setLocation(114, 610);
        
        JLabel counterClienteSexo = new JLabel("Sexo");
        counterClienteSexo.setSize(158, 16);
        counterClienteSexo.setLocation(682, 181);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteSexo.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteSexoInput = new JTextField();
        counterClienteSexoInput.setSize(357, 45);
        counterClienteSexoInput.setLocation(682, 217);
        
        JLabel counterClienteFecha = new JLabel("Fecha");
        counterClienteFecha.setSize(158, 16);
        counterClienteFecha.setLocation(682, 312);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteFecha.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteFechaInput = new JTextField();
        counterClienteFechaInput.setSize(357, 45);
        counterClienteFechaInput.setLocation(682, 350);
        
        JLabel counterClienteDireccion = new JLabel("Direccion");
        counterClienteDireccion.setSize(97, 16);
        counterClienteDireccion.setLocation(681, 443);
        //counterNombre.setFont(sizedFont3);
        counterClienteDireccion.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteDireccionInput = new JTextField();
        counterClienteDireccionInput.setSize(357, 45);
        counterClienteDireccionInput.setLocation(681, 480);
        
        JButton botonCrearCliente1 = new JButton("Crear Cliente");  
        botonCrearCliente1.setSize(169, 46);
        botonCrearCliente1.setLocation(492,741);
        botonCrearCliente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonCrearCliente1.setForeground(Color.white);
        //------------------ Eventos de los botones ----------------------------
        

        
        //------------------ agregación de elementos ---------------------------
        
        menuAdminClientesRegistrar.add(botonRegresarDeAdminClientesRegistrar);
        
        menuAdminClientesRegistrar.add(tituloRegistroClientes1);
        menuAdminClientesRegistrar.add(counterClienteNombre);
        menuAdminClientesRegistrar.add(counterClienteNombreInput);
        menuAdminClientesRegistrar.add(counterClienteCedulaJuridica);
        menuAdminClientesRegistrar.add(counterClienteCedulaJuridicaInput);
        menuAdminClientesRegistrar.add(counterClienteCorreo);
        
        menuAdminClientesRegistrar.add(counterClienteCorreoInput);
        menuAdminClientesRegistrar.add(counterClienteTelefono);
        menuAdminClientesRegistrar.add(counterClienteTelefonoInput);
        menuAdminClientesRegistrar.add(counterClienteSexo);
        menuAdminClientesRegistrar.add(counterClienteSexoInput);
        menuAdminClientesRegistrar.add(counterClienteFecha);
        
        menuAdminClientesRegistrar.add(counterClienteFechaInput);
        menuAdminClientesRegistrar.add(counterClienteDireccion);
        menuAdminClientesRegistrar.add(counterClienteDireccionInput);
        menuAdminClientesRegistrar.add(botonCrearCliente1);

        /*
        *  #############################################
        *  #############################################
        *  ## Componentes menu modificación clientes -##
        *  #############################################
        *  #############################################
        */
         
        //----------------------------------------------------------------------
        JLabel tituloModificarClientes1 = new JLabel("Modificación de cliente");
        tituloModificarClientes1.setSize(395, 45);
        tituloModificarClientes1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
        JLabel counterClienteModificarIdentificador = new JLabel("Identificador");
        counterClienteModificarIdentificador.setSize(138, 16);
        counterClienteModificarIdentificador.setLocation(398, 312);
        //counterNombre.setFont(sizedFont3);
        counterClienteModificarIdentificador.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteModificarIdentificadorInput = new JTextField();
        counterClienteModificarIdentificadorInput.setSize(357, 45);
        counterClienteModificarIdentificadorInput.setLocation(398, 348);
        
        JButton botonConsultarCliente2 = new JButton("Consultar cliente a modificar");  
        botonConsultarCliente2.setSize(261, 46);
        botonConsultarCliente2.setLocation(400,479);
        botonConsultarCliente2.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonConsultarCliente2.setForeground(Color.white);
        
        menuAdminClientesModificar1.add(botonRegresarDeAdminClientesModificar1);
        menuAdminClientesModificar1.add(tituloModificarClientes1);
        menuAdminClientesModificar1.add(counterClienteModificarIdentificador);
        menuAdminClientesModificar1.add(counterClienteModificarIdentificadorInput);
        menuAdminClientesModificar1.add(botonConsultarCliente2);
        
        //---------- Evento de los botones ------------------
        botonConsultarCliente2.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(false);
            menuAdminClientesModificar1.setVisible(false);
            menuAdminClientesModificar2.setVisible(true);
        });
        
        //---------------------------------------------------------------------
        
        /*
        *  #############################################
        *  #############################################
        *  ## Componentes menu modificación clientes - segunda parte -##
        *  #############################################
        *  #############################################
        */                       
     
        //----------------------------------------------------------------------
        JLabel tituloModificacionClientes2 = new JLabel("Modificación de cliente");
        tituloModificacionClientes2.setSize(395, 45);
        tituloModificacionClientes2.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
        JLabel counterClienteNombre2 = new JLabel("Nombre");
        counterClienteNombre2.setSize(74, 16);
        counterClienteNombre2.setLocation(114, 181);
        //counterNombre.setFont(sizedFont3);
        counterClienteNombre2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteNombreInput2 = new JTextField();
        counterClienteNombreInput2.setSize(357, 45);
        counterClienteNombreInput2.setLocation(114, 217);
        
        JLabel counterClienteCedulaJuridica2 = new JLabel("Cedula Juridica");
        counterClienteCedulaJuridica2.setSize(158, 16);
        counterClienteCedulaJuridica2.setLocation(114, 312);
       // counterCedulaJuridica.setFont(sizedFont3);
        counterClienteCedulaJuridica2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteCedulaJuridicaInput2 = new JTextField();
        counterClienteCedulaJuridicaInput2.setSize(357, 45);
        counterClienteCedulaJuridicaInput2.setLocation(114, 348);
        
        JLabel counterClienteCorreo2 = new JLabel("Correo");
        counterClienteCorreo2.setSize(158, 16);
        counterClienteCorreo2.setLocation(114, 443);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteCorreo2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteCorreoInput2 = new JTextField();
        counterClienteCorreoInput2.setSize(357, 45);
        counterClienteCorreoInput2.setLocation(114, 479);
        
        JLabel counterClienteTelefono2 = new JLabel("Telefono");
        counterClienteTelefono2.setSize(158, 16);
        counterClienteTelefono2.setLocation(114, 574);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteTelefono2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteTelefonoInput2 = new JTextField();
        counterClienteTelefonoInput2.setSize(357, 45);
        counterClienteTelefonoInput2.setLocation(114, 610);
        
        JLabel counterClienteSexo2 = new JLabel("Sexo");
        counterClienteSexo2.setSize(158, 16);
        counterClienteSexo2.setLocation(682, 181);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteSexo2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteSexoInput2 = new JTextField();
        counterClienteSexoInput2.setSize(357, 45);
        counterClienteSexoInput2.setLocation(682, 217);
        
        JLabel counterClienteFecha2 = new JLabel("Fecha");
        counterClienteFecha2.setSize(158, 16);
        counterClienteFecha2.setLocation(682, 312);
        //counterCantidadCasilleros.setFont(sizedFont3);
        counterClienteFecha2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteFechaInput2 = new JTextField();
        counterClienteFechaInput2.setSize(357, 45);
        counterClienteFechaInput2.setLocation(682, 350);
        
        JLabel counterClienteDireccion2 = new JLabel("Direccion");
        counterClienteDireccion2.setSize(97, 16);
        counterClienteDireccion2.setLocation(681, 443);
        //counterNombre.setFont(sizedFont3);
        counterClienteDireccion2.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteDireccionInput2 = new JTextField();
        counterClienteDireccionInput2.setSize(357, 45);
        counterClienteDireccionInput2.setLocation(681, 480);
        
        JButton botonModificarCliente2 = new JButton("Modificar Cliente");  
        botonModificarCliente2.setSize(169, 46);
        botonModificarCliente2.setLocation(492,741);
        botonModificarCliente2.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonModificarCliente2.setForeground(Color.white);
        
        //-------------------------------------------------
        menuAdminClientesModificar2.add(botonRegresarDeAdminClientesModificar2);
        menuAdminClientesModificar2.add(tituloModificacionClientes2);
        menuAdminClientesModificar2.add(counterClienteNombre2);
        menuAdminClientesModificar2.add(counterClienteNombreInput2);
        menuAdminClientesModificar2.add(counterClienteCedulaJuridica2);
        menuAdminClientesModificar2.add(counterClienteCedulaJuridicaInput2);
        menuAdminClientesModificar2.add(counterClienteCorreo2);
        menuAdminClientesModificar2.add(counterClienteCorreoInput2);
        menuAdminClientesModificar2.add(counterClienteTelefono2);
        menuAdminClientesModificar2.add(counterClienteTelefonoInput2);
        menuAdminClientesModificar2.add(counterClienteSexo2);
        menuAdminClientesModificar2.add(counterClienteSexoInput2);
        menuAdminClientesModificar2.add(counterClienteFecha2);
        menuAdminClientesModificar2.add(counterClienteFechaInput2);
        
        menuAdminClientesModificar2.add(counterClienteDireccion2);
        menuAdminClientesModificar2.add(counterClienteDireccionInput2);
        menuAdminClientesModificar2.add(botonModificarCliente2);       
        
        
        /*
        *  #############################################
        *  #############################################
        *  ## Componentes menu consultar cliente -----##
        *  #############################################
        *  #############################################
        */     
        
        //----------------------------------------------------------------------
        JLabel tituloConsultarClientes1 = new JLabel("Consultar clientes");
        tituloConsultarClientes1.setSize(395, 45);
        tituloConsultarClientes1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
        JLabel counterClienteConsultarIdentificador = new JLabel("Identificador");
        counterClienteConsultarIdentificador.setSize(138, 16);
        counterClienteConsultarIdentificador.setLocation(398, 312);
        //counterNombre.setFont(sizedFont3);
        counterClienteConsultarIdentificador.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteConsultarIdentificadorInput = new JTextField();
        counterClienteConsultarIdentificadorInput.setSize(357, 45);
        counterClienteConsultarIdentificadorInput.setLocation(398, 348);
        
        JButton botonConsultarCliente3 = new JButton("Consultar cliente");  
        botonConsultarCliente3.setSize(261, 46);
        botonConsultarCliente3.setLocation(400,479);
        botonConsultarCliente3.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonConsultarCliente3.setForeground(Color.white);

        //---------- Evento de los botones ------------------
        botonConsultarCliente3.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(false);
            menuAdminClientes1.setVisible(false);
            menuAdminClientesConsultar1.setVisible(true);
        });
        
        menuAdminClientesConsultar1.add(tituloConsultarClientes1);
        menuAdminClientesConsultar1.add(counterClienteConsultarIdentificador);
        menuAdminClientesConsultar1.add(counterClienteConsultarIdentificadorInput);
        menuAdminClientesConsultar1.add(botonConsultarCliente3);
        menuAdminClientesConsultar1.add(botonRegresarDeClientesConsultar1);
        
        //---------------------------------------------------------------------
        
        /*
        *  #############################################
        *  #############################################
        *  ## Componentes menu Eliminar clientes -----##
        *  #############################################
        *  #############################################
        */                       
     
        //----------------------------------------------------------------------
        
        //----------------------------------------------------------------------
        JLabel tituloEliminarClientes1 = new JLabel("Eliminar clientes");
        tituloEliminarClientes1.setSize(395, 45);
        tituloEliminarClientes1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
        JLabel counterClienteEliminarIdentificador = new JLabel("Identificador");
        counterClienteEliminarIdentificador.setSize(138, 16);
        counterClienteEliminarIdentificador.setLocation(398, 312);
        //counterNombre.setFont(sizedFont3);
        counterClienteEliminarIdentificador.setForeground(Color.decode("#000000"));  
        
        JTextField counterClienteEliminarIdentificadorInput = new JTextField();
        counterClienteEliminarIdentificadorInput.setSize(357, 45);
        counterClienteEliminarIdentificadorInput.setLocation(398, 348);
        
        JButton botonEliminarCliente2 = new JButton("Eliminar cliente");  
        botonEliminarCliente2.setSize(261, 46);
        botonEliminarCliente2.setLocation(400,479);
        botonEliminarCliente2.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonEliminarCliente2.setForeground(Color.white);

        //---------- Evento de los botones ------------------
        
        botonEliminarCliente1.addActionListener((ActionEvent e) -> {
            menuAdminClientes1.setVisible(false);
            menuAdminClientesEliminar1.setVisible(true);
        });
        
        botonEliminarCliente2.addActionListener((ActionEvent e) -> {
            menuAdminClientes1.setVisible(false);
            menuAdminClientesEliminar1.setVisible(true);
        });
        
        botonRegresarDeEliminarCliente1.addActionListener((ActionEvent e) -> {
            menuAdminClientes1.setVisible(true);
            menuAdminClientesEliminar1.setVisible(false);
        });
        
        menuAdminClientesEliminar1.add(tituloEliminarClientes1);
        menuAdminClientesEliminar1.add(counterClienteEliminarIdentificador);
        menuAdminClientesEliminar1.add(counterClienteEliminarIdentificadorInput);
        menuAdminClientesEliminar1.add(botonEliminarCliente2);
        menuAdminClientesEliminar1.add(botonRegresarDeEliminarCliente1);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        /*
        *  #############################################
        *  #############################################
        *  ## Componentes menu Entregables -----------##
        *  #############################################
        *  #############################################
        */                       
     
        //----------------------------------------------------------------------
                //----------------------------------------------------------------------
        JLabel tituloAdminEntregables1 = new JLabel("Administración de entregables");
        tituloAdminEntregables1.setSize(395, 45);
        tituloAdminEntregables1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
                
        JButton botonRegistroArticulo1 = new JButton("Registro de artículo");  
        botonRegistroArticulo1.setSize(169, 46);
        botonRegistroArticulo1.setLocation(492,217);
        botonRegistroArticulo1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRegistroArticulo1.setForeground(Color.white);

        JButton botonRetiroArticulo1 = new JButton("Retiro de artículo");  
        botonRetiroArticulo1.setSize(261, 46);
        botonRetiroArticulo1.setLocation(492,349);
        botonRetiroArticulo1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRetiroArticulo1.setForeground(Color.white);
        
        botonRegresarDeAdministraciónEntregables1.addActionListener((ActionEvent e) -> {
            menuPrincipal.setVisible(true);
            menuAdminEntregables1.setVisible(false);
        });
        
        menuAdminEntregables1.add(botonRegresarDeAdministraciónEntregables1);
        menuAdminEntregables1.add(tituloAdminEntregables1);
        menuAdminEntregables1.add(botonRegistroArticulo1);
        menuAdminEntregables1.add(botonRetiroArticulo1);
        
        botonRegistroArticulo1.addActionListener((ActionEvent e) -> {
            menuAdminEntregables3.setVisible(true);
            menuAdminEntregables1.setVisible(false);
        });
        
        botonRetiroArticulo1.addActionListener((ActionEvent e) -> {
            menuAdminEntregables2.setVisible(true);
            menuAdminEntregables1.setVisible(false);
        });
        
        /*
        *  #################################################
        *  #################################################
        *  ## Componentes menu retiro de entregables --##
        *  #################################################
        *  #################################################
        */     
        
        //----------------------------------------------------------------------
        JLabel tituloRecepciónEntregables1 = new JLabel("Registro de entregables");
        tituloRecepciónEntregables1.setSize(395, 45);
        tituloRecepciónEntregables1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)
        
        JLabel counterRecepciónEntregableIdentificador1 = new JLabel("Identificador");
        counterRecepciónEntregableIdentificador1.setSize(138, 16);
        counterRecepciónEntregableIdentificador1.setLocation(398, 312);
        //counterNombre.setFont(sizedFont3);
        counterRecepciónEntregableIdentificador1.setForeground(Color.decode("#000000"));  
        
        JTextField counterRecepciónEntregableIdentificadorInput = new JTextField();
        counterRecepciónEntregableIdentificadorInput.setSize(357, 45);
        counterRecepciónEntregableIdentificadorInput.setLocation(398, 348);
        
        JButton botonRecepciónEntregableSiguiente1 = new JButton("Siguiente");  
        botonRecepciónEntregableSiguiente1.setSize(261, 46);
        botonRecepciónEntregableSiguiente1.setLocation(400,479);
        botonRecepciónEntregableSiguiente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRecepciónEntregableSiguiente1.setForeground(Color.white);

        
        
        menuAdminEntregables2.add(tituloRecepciónEntregables1);
        menuAdminEntregables2.add(counterRecepciónEntregableIdentificador1);
        menuAdminEntregables2.add(counterRecepciónEntregableIdentificadorInput);
        menuAdminEntregables2.add(botonRecepciónEntregableSiguiente1);
        menuAdminEntregables2.add(botonRegresarAMenuDesdeRetiroDeArticulo1);
        
        botonRegresarAMenuDesdeRetiroDeArticulo1.addActionListener(( ActionEvent e) -> {
            menuAdminEntregables2.setVisible(false);
            menuAdminEntregables1.setVisible(true);
        });
        
        botonRecepciónEntregableSiguiente1.addActionListener(( ActionEvent e) -> {
            menuAdminEntregables2.setVisible(false);
            menuAdminEntregables3.setVisible(true);
        });
        //---------- Evento de los botones ------------------
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        /*
        *  #################################################
        *  #################################################
        *  ## Componentes menu registro de entregables --##
        *  #################################################
        *  #################################################
        */     
        
        //----------------------------------------------------------------------
        JLabel tituloRegistroEntregables1 = new JLabel("Registro de entregables");
        tituloRegistroEntregables1.setSize(395, 45);
        tituloRegistroEntregables1.setLocation(379, -86);
        //tituloCounter1.setFont(sizedFont1)

        JLabel tituloRegistroEntregables2 = new JLabel("Tipo de entregable a registrar");
        tituloRegistroEntregables2.setSize(395, 45);
        tituloRegistroEntregables2.setLocation(114, 181);
        //tituloCounter1.setFont(sizedFont1)
        
        JRadioButton RadioSobre = new JRadioButton("Sobre");
        RadioSobre.setSize(176, 24);
        RadioSobre.setLocation(114, 238);
        
        JRadioButton RadioPaquete = new JRadioButton("Paquete");
        RadioPaquete.setSize(176, 24);
        RadioPaquete.setLocation(114, 303);
        
        JRadioButton RadioRevista = new JRadioButton("Revista");
        RadioRevista.setSize(176, 24);
        RadioRevista.setLocation(114, 368);
        
        JButton botonRegistrarEntregableSiguiente1 = new JButton("Siguiente");  
        botonRegistrarEntregableSiguiente1.setSize(261, 46);
        botonRegistrarEntregableSiguiente1.setLocation(400,741);
        botonRegistrarEntregableSiguiente1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRegistrarEntregableSiguiente1.setForeground(Color.white);

        botonRegistrarEntregableSiguiente1.addActionListener((ActionEvent e) -> {
            menuAdminEntregables3.setVisible(false);
            menuAdminEntregables4.setVisible(true);
        });
        
        botonRegresarAMenuDesdeRegistroEntregable1.addActionListener((ActionEvent e) -> {
            menuAdminEntregables1.setVisible(true);
            menuAdminEntregables3.setVisible(false);
        });
        
        menuAdminEntregables3.add(tituloRegistroEntregables1);
        menuAdminEntregables3.add(tituloRegistroEntregables2);
        menuAdminEntregables3.add(RadioSobre);
        menuAdminEntregables3.add(RadioPaquete);
        menuAdminEntregables3.add(RadioRevista);
        menuAdminEntregables3.add(botonRegistrarEntregableSiguiente1);
        menuAdminEntregables3.add(botonRegresarAMenuDesdeRegistroEntregable1);
        
        
        
        //---------- Evento de los botones ------------------
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        /*
        *  #################################################
        *  #################################################
        *  ## Componentes menu registro de paquetes ------##
        *  #################################################
        *  #################################################
        */     
        
        //----------------------------------------------------------------------
        JLabel tituloRegistroPaquetes1 = new JLabel("Registro de paquetes");
        tituloRegistroPaquetes1.setSize(370, 45);
        tituloRegistroPaquetes1.setLocation(392, -86);
        //tituloCounter1.setFont(sizedFont1)

        JLabel RegistroPaquetesIdentificador = new JLabel("Identificador");
        RegistroPaquetesIdentificador.setSize(138, 16);
        RegistroPaquetesIdentificador.setLocation(94, 116);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroPaquetesIdentificadorInput = new JTextField();
        RegistroPaquetesIdentificadorInput.setSize(357, 45);
        RegistroPaquetesIdentificadorInput.setLocation(94, 152);
        
        JLabel RegistroPaquetesRemitente = new JLabel("Remitente");
        RegistroPaquetesRemitente.setSize(99, 16);
        RegistroPaquetesRemitente.setLocation(94, 247);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroPaquetesRemitenteInput = new JTextField();
        RegistroPaquetesRemitenteInput.setSize(357, 45);
        RegistroPaquetesRemitenteInput.setLocation(94, 284);
        
        JLabel RegistroPaquetesPeso = new JLabel("Peso");
        RegistroPaquetesPeso.setSize(46, 16);
        RegistroPaquetesPeso.setLocation(94, 378);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroPaquetesPesoInput = new JTextField();
        RegistroPaquetesPesoInput.setSize(357, 45);
        RegistroPaquetesPesoInput.setLocation(94, 416);
        
        JLabel RegistroPaquetesEsFragil = new JLabel("Es frágil?");
        RegistroPaquetesEsFragil.setSize(46, 16);
        RegistroPaquetesEsFragil.setLocation(94, 509);
        //tituloCounter1.setFont(sizedFont1)
        
        JRadioButton RadioPaqueteFragilSi = new JRadioButton("Si");
        RadioPaqueteFragilSi.setSize(176, 24);
        RadioPaqueteFragilSi.setLocation(94, 547);
        
        JRadioButton RadioPaqueteFragilNo = new JRadioButton("No");
        RadioPaqueteFragilNo.setSize(176, 24);
        RadioPaqueteFragilNo.setLocation(206, 547);
        
        //----------------------------------------------------------------------
        
        JLabel RegistroPaquetesEntregar = new JLabel("Entregar en");
        RegistroPaquetesEntregar.setSize(123, 16);
        RegistroPaquetesEntregar.setLocation(661, 116);
        //tituloCounter1.setFont(sizedFont1)
        
        JRadioButton RadioPaqueteEntregarCaja = new JRadioButton("Caja");
        RadioPaqueteEntregarCaja.setSize(176, 24);
        RadioPaqueteEntregarCaja.setLocation(661, 149);
        
        JRadioButton RadioPaqueteEntregarBolsilla = new JRadioButton("Bolsilla");
        RadioPaqueteEntregarBolsilla.setSize(176, 24);
        RadioPaqueteEntregarBolsilla.setLocation(784, 149);
        
        //----------------------------------------------------------------------
        
        JLabel RegistroPaquetesTieneCorreo = new JLabel("Tiene electronico");
        RegistroPaquetesTieneCorreo.setSize(180, 16);
        RegistroPaquetesTieneCorreo.setLocation(661, 247);
        //tituloCounter1.setFont(sizedFont1)
        
        JRadioButton RadioPaqueteTieneCorreoSi = new JRadioButton("Si");
        RadioPaqueteTieneCorreoSi.setSize(176, 24);
        RadioPaqueteTieneCorreoSi.setLocation(661, 280);
        
        JRadioButton RadioPaqueteTieneCorreoNo = new JRadioButton("No");
        RadioPaqueteTieneCorreoNo.setSize(176, 24);
        RadioPaqueteTieneCorreoNo.setLocation(784, 280);
        
        JLabel RegistroPaquetesDescripción = new JLabel("Descripción");
        RegistroPaquetesDescripción.setSize(120, 16);
        RegistroPaquetesDescripción.setLocation(661, 378);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroPaquetesDescripciónInput = new JTextField();
        RegistroPaquetesDescripciónInput.setSize(452, 176);
        RegistroPaquetesDescripciónInput.setLocation(661, 415);
        
        JButton botonRegistroPaquetes1 = new JButton("Siguiente");  
        botonRegistroPaquetes1.setSize(169, 46);
        botonRegistroPaquetes1.setLocation(492,741);
        botonRegistroPaquetes1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRegistroPaquetes1.setForeground(Color.white);

       botonRegresarAMenuDesdeRegistroDeArticulo4.addActionListener((ActionEvent e) -> {
           menuAdminEntregables4.setVisible(false);
           menuAdminEntregables3.setVisible(true);
       });
        
        menuAdminEntregables4.add(botonRegresarAMenuDesdeRegistroDeArticulo4);
        menuAdminEntregables4.add(tituloRegistroPaquetes1);
        
        menuAdminEntregables4.add(RegistroPaquetesIdentificador);
        menuAdminEntregables4.add(RegistroPaquetesIdentificadorInput);
        
        menuAdminEntregables4.add(RegistroPaquetesRemitente);
        menuAdminEntregables4.add(RegistroPaquetesRemitenteInput);
        
        menuAdminEntregables4.add(RegistroPaquetesPeso);
        menuAdminEntregables4.add(RegistroPaquetesPesoInput);
        
        menuAdminEntregables4.add(RegistroPaquetesEsFragil);
        menuAdminEntregables4.add(RadioPaqueteFragilSi);
        menuAdminEntregables4.add(RadioPaqueteFragilNo);
        
        menuAdminEntregables4.add(RegistroPaquetesEntregar);
        menuAdminEntregables4.add(RadioPaqueteEntregarCaja);
        menuAdminEntregables4.add(RadioPaqueteEntregarBolsilla);
        
        menuAdminEntregables4.add(RegistroPaquetesTieneCorreo);
        menuAdminEntregables4.add(RadioPaqueteTieneCorreoSi);
        menuAdminEntregables4.add(RadioPaqueteTieneCorreoNo);
        
        menuAdminEntregables4.add(RegistroPaquetesDescripción);
        menuAdminEntregables4.add(RegistroPaquetesDescripciónInput);
        menuAdminEntregables4.add(botonRegistroPaquetes1);
        //---------- Evento de los botones ------------------
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        /*
        *  #################################################
        *  #################################################
        *  ## Componentes menu registro de revistas ------##
        *  #################################################
        *  #################################################
        */     
        
        //----------------------------------------------------------------------
        JLabel tituloRegistroRevistas1 = new JLabel("Registro de revistas");
        tituloRegistroRevistas1.setSize(370, 45);
        tituloRegistroRevistas1.setLocation(392, -86);
        //tituloCounter1.setFont(sizedFont1)

        JLabel RegistroRevistasIdentificador = new JLabel("Identificador");
        RegistroRevistasIdentificador.setSize(138, 16);
        RegistroRevistasIdentificador.setLocation(94, 116);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroRevistasIdentificadorInput = new JTextField();
        RegistroRevistasIdentificadorInput.setSize(357, 45);
        RegistroRevistasIdentificadorInput.setLocation(94, 152);
        
        JLabel RegistroRevistasRemitente = new JLabel("Remitente");
        RegistroRevistasRemitente.setSize(99, 16);
        RegistroRevistasRemitente.setLocation(94, 247);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroRevistasRemitenteInput = new JTextField();
        RegistroRevistasRemitenteInput.setSize(357, 45);
        RegistroRevistasRemitenteInput.setLocation(94, 284);
        
        JLabel RegistroRevistasPeso = new JLabel("Peso");
        RegistroRevistasPeso.setSize(46, 16);
        RegistroRevistasPeso.setLocation(94, 378);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroRevistasPesoInput = new JTextField();
        RegistroRevistasPesoInput.setSize(357, 45);
        RegistroRevistasPesoInput.setLocation(94, 416);
        
        JLabel RegistroRevistasEsCatalogo = new JLabel("Es catálogo?");
        RegistroRevistasEsCatalogo.setSize(46, 16);
        RegistroRevistasEsCatalogo.setLocation(94, 509);
        //tituloCounter1.setFont(sizedFont1)
        
        JRadioButton RadioRevistasEsCatalogoSi = new JRadioButton("Si");
        RadioRevistasEsCatalogoSi.setSize(176, 24);
        RadioRevistasEsCatalogoSi.setLocation(94, 547);
        
        JRadioButton RadioRevistasEsCatalogoNo = new JRadioButton("No");
        RadioRevistasEsCatalogoNo.setSize(176, 24);
        RadioRevistasEsCatalogoNo.setLocation(206, 547);
        
        //----------------------------------------------------------------------
        
        JLabel RegistroRevistasTema = new JLabel("Tema");
        RegistroRevistasTema.setSize(123, 16);
        RegistroRevistasTema.setLocation(661, 116);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroRevistasTemaInput = new JTextField();
        RegistroRevistasTemaInput.setSize(357, 45);
        RegistroRevistasTemaInput.setLocation(661, 152);
        
        JLabel RegistroRevistasNombre = new JLabel("Nombre");
        RegistroRevistasNombre.setSize(123, 16);
        RegistroRevistasNombre.setLocation(661, 247);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroRevistasNombreInput = new JTextField();
        RegistroRevistasNombreInput.setSize(357, 45);
        RegistroRevistasNombreInput.setLocation(661, 277);
        //----------------------------------------------------------------------
      
        JLabel RegistroRevistasDescripción = new JLabel("Descripción");
        RegistroRevistasDescripción.setSize(120, 16);
        RegistroRevistasDescripción.setLocation(661, 378);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroRevistasDescripciónInput = new JTextField();
        RegistroRevistasDescripciónInput.setSize(452, 176);
        RegistroRevistasDescripciónInput.setLocation(661, 415);
        
        JButton botonRegistroRevistas1 = new JButton("Siguiente");  
        botonRegistroRevistas1.setSize(169, 46);
        botonRegistroRevistas1.setLocation(492,741);
        botonRegistroRevistas1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRegistroRevistas1.setForeground(Color.white);

       botonRegresarAMenuDesdeRegistroDeArticulo5.addActionListener((ActionEvent e) -> {
           menuAdminEntregables5.setVisible(false);
           menuAdminEntregables3.setVisible(true);
       });
        
        menuAdminEntregables5.add(botonRegresarAMenuDesdeRegistroDeArticulo5);
        menuAdminEntregables5.add(tituloRegistroRevistas1);
        
        menuAdminEntregables5.add(RegistroRevistasIdentificador);
        menuAdminEntregables5.add(RegistroRevistasIdentificadorInput);
        
        menuAdminEntregables5.add(RegistroPaquetesRemitente);
        menuAdminEntregables5.add(RegistroPaquetesRemitenteInput);
        
        menuAdminEntregables5.add(RegistroRevistasPeso);
        menuAdminEntregables5.add(RegistroRevistasPesoInput);
        
        menuAdminEntregables5.add(RegistroRevistasEsCatalogo);
        menuAdminEntregables5.add(RadioRevistasEsCatalogoSi);
        menuAdminEntregables5.add(RadioRevistasEsCatalogoNo);
        
        menuAdminEntregables5.add(RegistroRevistasTema);
        menuAdminEntregables5.add(RegistroRevistasTemaInput);
        menuAdminEntregables5.add(RegistroRevistasNombre);
        
        menuAdminEntregables5.add(RegistroRevistasNombreInput);
        menuAdminEntregables5.add(RegistroRevistasDescripción);
        menuAdminEntregables5.add(RegistroRevistasDescripciónInput);
        
        menuAdminEntregables5.add(botonRegistroRevistas1);
        //---------- Evento de los botones ------------------
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
               //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        /*
        *  #################################################
        *  #################################################
        *  ## Componentes menu registro de sobres ------####
        *  #################################################
        *  #################################################
        */     
        
        //----------------------------------------------------------------------
        JLabel tituloRegistroSobres1 = new JLabel("Registro de Sobres");
        tituloRegistroSobres1.setSize(370, 45);
        tituloRegistroSobres1.setLocation(392, -86);
        //tituloCounter1.setFont(sizedFont1)

        JLabel RegistroSobresIdentificador = new JLabel("Identificador");
        RegistroSobresIdentificador.setSize(138, 16);
        RegistroSobresIdentificador.setLocation(94, 116);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroSobresIdentificadorInput = new JTextField();
        RegistroSobresIdentificadorInput.setSize(357, 45);
        RegistroSobresIdentificadorInput.setLocation(94, 152);
        
        JLabel RegistroSobresRemitente = new JLabel("Remitente");
        RegistroSobresRemitente.setSize(99, 16);
        RegistroSobresRemitente.setLocation(94, 247);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroSobresRemitenteInput = new JTextField();
        RegistroSobresRemitenteInput.setSize(357, 45);
        RegistroSobresRemitenteInput.setLocation(94, 284);
        
        JLabel RegistroSobresPeso = new JLabel("Peso");
        RegistroSobresPeso.setSize(46, 16);
        RegistroSobresPeso.setLocation(94, 378);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroSobresPesoInput = new JTextField();
        RegistroSobresPesoInput.setSize(357, 45);
        RegistroSobresPesoInput.setLocation(94, 416);
        
        JLabel RegistroSobresEsCatalogo = new JLabel("Es catálogo?");
        RegistroSobresEsCatalogo.setSize(46, 16);
        RegistroSobresEsCatalogo.setLocation(94, 509);
        //tituloCounter1.setFont(sizedFont1)
        
        JRadioButton RadioSobresEsCatalogoSi = new JRadioButton("Si");
        RadioSobresEsCatalogoSi.setSize(176, 24);
        RadioSobresEsCatalogoSi.setLocation(94, 547);
        
        JRadioButton RadioSobresEsCatalogoNo = new JRadioButton("No");
        RadioSobresEsCatalogoNo.setSize(176, 24);
        RadioSobresEsCatalogoNo.setLocation(206, 547);
        
        //----------------------------------------------------------------------
        
        JLabel RegistroSobresContenido = new JLabel("Contenido");
        RegistroSobresContenido.setSize(123, 16);
        RegistroSobresContenido.setLocation(661, 116);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroSobresContenidoInput = new JTextField();
        RegistroSobresContenidoInput.setSize(357, 45);
        RegistroSobresContenidoInput.setLocation(661, 152);
        
        JLabel RegistrosSobresNombre = new JLabel("Nombre");
        RegistrosSobresNombre.setSize(123, 16);
        RegistrosSobresNombre.setLocation(661, 247);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroSobresNombreInput = new JTextField();
        RegistroSobresNombreInput.setSize(357, 45);
        RegistroSobresNombreInput.setLocation(661, 277);
        //----------------------------------------------------------------------
      
        JLabel RegistroSobresDescripción = new JLabel("Descripción");
        RegistroSobresDescripción.setSize(120, 16);
        RegistroSobresDescripción.setLocation(661, 378);
        //tituloCounter1.setFont(sizedFont1)
        
        JTextField RegistroSobresDescripciónInput = new JTextField();
        RegistroSobresDescripciónInput.setSize(452, 176);
        RegistroSobresDescripciónInput.setLocation(661, 415);
        
        JButton botonRegistroSobres1 = new JButton("Siguiente");  
        botonRegistroSobres1.setSize(169, 46);
        botonRegistroSobres1.setLocation(492,741);
        botonRegistroSobres1.setBackground(Color.decode("#5A4FF3"));
        //botonAdministraciónClientes.setFont(sizedFont2);
        botonRegistroSobres1.setForeground(Color.white);

       botonRegresarAMenuDesdeRegistroDeArticulo6.addActionListener((ActionEvent e) -> {
           menuAdminEntregables6.setVisible(false);
           menuAdminEntregables3.setVisible(true);
       });
        
        menuAdminEntregables6.add(botonRegresarAMenuDesdeRegistroDeArticulo5);
        menuAdminEntregables6.add(tituloRegistroRevistas1);
        
        menuAdminEntregables6.add(RegistroRevistasIdentificador);
        menuAdminEntregables6.add(RegistroRevistasIdentificadorInput);
        
        menuAdminEntregables6.add(RegistroPaquetesRemitente);
        menuAdminEntregables6.add(RegistroPaquetesRemitenteInput);
        
        menuAdminEntregables6.add(RegistroRevistasPeso);
        menuAdminEntregables6.add(RegistroRevistasPesoInput);
        
        menuAdminEntregables6.add(RegistroRevistasEsCatalogo);
        menuAdminEntregables6.add(RadioRevistasEsCatalogoSi);
        menuAdminEntregables6.add(RadioRevistasEsCatalogoNo);
        
        menuAdminEntregables6.add(RegistroRevistasTema);
        menuAdminEntregables6.add(RegistroRevistasTemaInput);
        menuAdminEntregables6.add(RegistroRevistasNombre);
        
        menuAdminEntregables6.add(RegistroRevistasNombreInput);
        menuAdminEntregables6.add(RegistroRevistasDescripción);
        menuAdminEntregables6.add(RegistroRevistasDescripciónInput);
        
        menuAdminEntregables6.add(botonRegistroRevistas1);
        //---------- Evento de los botones ------------------
        
        //--------------------------------------------------------------
        //-------------------------------------------------------------
        //menuAdminEntregables1
        //jose
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        /*
        *  ######################################################
        *  ######################################################
        *  ## Componentes menu Consulta Componentes -----------##
        *  ######################################################
        *  ######################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        JLabel tituloAdminConsultaEntregables1 = new JLabel("Administración de entregables");
        tituloAdminConsultaEntregables1.setSize(451, 45);
        tituloAdminConsultaEntregables1.setLocation(379, -86);
        
        JButton botonEstadoCasillero = new JButton("Estado del Casillero");
        botonEstadoCasillero.setSize(169, 46);
        botonEstadoCasillero.setLocation(492,217);
        botonEstadoCasillero.setBackground(Color.decode("#00C04D"));
        botonEstadoCasillero.setForeground(Color.white);
        
        JButton botonDetalleArtRecibidos = new JButton("Detalle de Articulos Recibidos");
        botonDetalleArtRecibidos.setSize(217, 46);
        botonDetalleArtRecibidos.setLocation(468,349);
        botonDetalleArtRecibidos.setBackground(Color.decode("#5A4FF3"));
        botonDetalleArtRecibidos.setForeground(Color.white);
        
        JButton botonDetalleArtEntregados = new JButton("Detalle de Articulos Entregados");
        botonDetalleArtEntregados.setSize(240, 46);
        botonDetalleArtEntregados.setLocation(456,479);
        botonDetalleArtEntregados.setBackground(Color.decode("#5A4FF3"));
        botonDetalleArtEntregados.setForeground(Color.white);
        
        JButton botonDetalleArtPendientes = new JButton("Detalle de Articulos Pendientes");
        botonDetalleArtPendientes.setSize(240, 46);
        botonDetalleArtPendientes.setLocation(456,609);
        botonDetalleArtPendientes.setBackground(Color.decode("#5A4FF3"));
        botonDetalleArtPendientes.setForeground(Color.white);
        
        JButton botonDetalleArtGeneral = new JButton("Detalle de Articulos General");
        botonDetalleArtGeneral.setSize(240, 46);
        botonDetalleArtGeneral.setLocation(456,739);
        botonDetalleArtGeneral.setBackground(Color.decode("#5A4FF3"));
        botonDetalleArtGeneral.setForeground(Color.white);
        
        menuAdminConsultaEntregables1.add(tituloAdminConsultaEntregables1);
        menuAdminConsultaEntregables1.add(botonEstadoCasillero);
        menuAdminConsultaEntregables1.add(botonDetalleArtRecibidos);
        menuAdminConsultaEntregables1.add(botonDetalleArtEntregados);
        menuAdminConsultaEntregables1.add(botonDetalleArtPendientes);
        menuAdminConsultaEntregables1.add(botonDetalleArtGeneral);
        
        //----------------------------------------------------------------------
        //----------------------- Eventos ---------------------------------------
        botonEstadoCasillero.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregables1.setVisible(false);
            menuAdminConsultaEntregables2.setVisible(true);
        });
        
        botonDetalleArtRecibidos.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregables1.setVisible(false);
            menuAdminConsultaRecibidos1.setVisible(true);
        });
        
        botonDetalleArtEntregados.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregables1.setVisible(false);
            menuAdminConsultaEntregados1.setVisible(true);
        });  
        
        botonDetalleArtPendientes.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregables1.setVisible(false);
            menuAdminConsultaPendientes1.setVisible(true);
        });
        //----------------------------------------------------------------------

        /*
        *  #######################################################
        *  #######################################################
        *  ## Componentes menu Consulta Componentes 2-----------##
        *  #######################################################
        *  #######################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        JLabel tituloAdminTipoConsulta = new JLabel("Tipo de Consulta");
        tituloAdminTipoConsulta.setSize(451, 45);
        tituloAdminTipoConsulta.setLocation(379, -86);
        
        JLabel tituloAdminMetodoConsulta = new JLabel("Metodo de Consulta");
        tituloAdminMetodoConsulta.setSize(397, 250);
        tituloAdminMetodoConsulta.setLocation(379, -86);
        
        JRadioButton RadioNumeroCliente = new JRadioButton("Numero de Cliente");
        RadioNumeroCliente.setSize(176, 24);
        RadioNumeroCliente.setLocation(395, 306);
        
        JRadioButton RadioNumeroCasillero = new JRadioButton("Numero de Casillero");
        RadioNumeroCasillero.setSize(188, 24);
        RadioNumeroCasillero.setLocation(587, 306);
        
        JButton botonMetodoConsultaSiguiente= new JButton("Siguiente");
        botonMetodoConsultaSiguiente.setSize(169, 46);
        botonMetodoConsultaSiguiente.setLocation(492,741);
        botonMetodoConsultaSiguiente.setBackground(Color.decode("#5A4FF3"));
        botonMetodoConsultaSiguiente.setForeground(Color.white);
        
        menuAdminConsultaEntregables2.add(tituloAdminTipoConsulta);
        menuAdminConsultaEntregables2.add(tituloAdminMetodoConsulta);
        menuAdminConsultaEntregables2.add(RadioNumeroCliente);
        menuAdminConsultaEntregables2.add(RadioNumeroCasillero);
        menuAdminConsultaEntregables2.add(botonMetodoConsultaSiguiente);
                
        //----------------------------------------------------------------------
        //----------------------- Eventos ---------------------------------------
        botonMetodoConsultaSiguiente.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregables3.setVisible(true);
            menuAdminConsultaEntregables2.setVisible(false);
        });
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #######################################################
        *  #######################################################
        *  ## Componentes menu Consulta Componentes 3-----------##
        *  #######################################################
        *  #######################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsulta = new JLabel("Consulta");
        tituloAdminConsulta.setSize(393, 45);
        tituloAdminConsulta.setLocation(380, -82);
        
        JLabel tituloAdminNumero = new JLabel("Numero");
        tituloAdminNumero.setSize(74, 16);
        tituloAdminNumero.setLocation(398, 181);
        
        JTextField ConsultaNombre = new JTextField("nombre");
        ConsultaNombre.setSize(357, 45);
        ConsultaNombre.setLocation(398, 217);
        
        JButton botonConsultaSiguiente = new JButton("Siguiente");
        botonConsultaSiguiente.setSize(169, 46);
        botonConsultaSiguiente.setLocation(492,741);
        botonConsultaSiguiente.setBackground(Color.decode("#5A4FF3"));
        botonConsultaSiguiente.setForeground(Color.white);
        
        menuAdminConsultaEntregables3.add(tituloAdminConsulta);
        menuAdminConsultaEntregables3.add(tituloAdminNumero);
        menuAdminConsultaEntregables3.add(ConsultaNombre);
        menuAdminConsultaEntregables3.add(botonConsultaSiguiente);
        
        //----------------------------------------------------------------------
        //----------------------- Eventos ---------------------------------------
        botonMetodoConsultaSiguiente.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregables4.setVisible(true);
            menuAdminConsultaEntregables3.setVisible(false);
        });
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #######################################################
        *  #######################################################
        *  ## Componentes menu Consulta Componentes 4-----------##
        *  #######################################################
        *  #######################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsulta2 = new JLabel("Consulta");
        tituloAdminConsulta2.setSize(393, 45);
        tituloAdminConsulta2.setLocation(380, -82);
        
        JLabel tituloAdminEstado = new JLabel("Estado");
        tituloAdminEstado.setSize(74, 16);
        tituloAdminEstado.setLocation(398, 181);
        
        JTextField ConsultaNombre2 = new JTextField("nombre");
        ConsultaNombre2.setSize(357, 45);
        ConsultaNombre2.setLocation(398, 217);
        
        menuAdminConsultaEntregables4.add(tituloAdminConsulta2);
        menuAdminConsultaEntregables4.add(tituloAdminEstado);
        menuAdminConsultaEntregables4.add(ConsultaNombre2);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Recibidos 1-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsultaRecibidos = new JLabel("Consulta de Articulos Recibidos");
        tituloAdminConsultaRecibidos.setSize(456, 45);
        tituloAdminConsultaRecibidos.setLocation(380, -82);
        
        JLabel tituloAdminFecha = new JLabel("Fecha");
        tituloAdminFecha.setSize(56, 16);
        tituloAdminFecha.setLocation(398, 181);
        
        JTextField ConsultaNombreRecibidos = new JTextField("nombre");
        ConsultaNombreRecibidos.setSize(357, 45);
        ConsultaNombreRecibidos.setLocation(398, 217);
        
        JButton botonConsultaRecibidosSiguiente = new JButton("Siguiente");
        botonConsultaRecibidosSiguiente.setSize(169, 46);
        botonConsultaRecibidosSiguiente.setLocation(492,741);
        botonConsultaRecibidosSiguiente.setBackground(Color.decode("#5A4FF3"));
        botonConsultaRecibidosSiguiente.setForeground(Color.white);
        
                //--------------------------------------------------------------------
        //----------------------------------------------------------------------
        //----------------------- Eventos ---------------------------------------
        botonConsultaRecibidosSiguiente.addActionListener((ActionEvent e) -> {
            menuAdminConsultaRecibidos2.setVisible(true);
            menuAdminConsultaRecibidos1.setVisible(false);
        });  
        
        menuAdminConsultaRecibidos1.add(tituloAdminConsultaRecibidos);
        menuAdminConsultaRecibidos1.add(tituloAdminFecha);
        menuAdminConsultaRecibidos1.add(ConsultaNombreRecibidos);
        menuAdminConsultaRecibidos1.add(botonConsultaRecibidosSiguiente);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Recibidos 2-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminListaRecibidos = new JLabel("Lista de Entregables");
        tituloAdminListaRecibidos.setSize(305, 45);
        tituloAdminListaRecibidos.setLocation(424, 99);
        
        JLabel tituloAdminIdentificardor = new JLabel("Identificador");
        tituloAdminIdentificardor.setSize(138, 16);
        tituloAdminIdentificardor.setLocation(114, 185);
        
        JLabel tituloAdminRemitente= new JLabel("Remitente");
        tituloAdminRemitente.setSize(99, 16);
        tituloAdminRemitente.setLocation(303, 185);
        
        JLabel tituloAdminPeso = new JLabel("Peso");
        tituloAdminPeso.setSize(46, 16);
        tituloAdminPeso.setLocation(492, 185);
        
        JLabel tituloAdminDescripcion= new JLabel("Descripcion");
        tituloAdminDescripcion.setSize(120, 16);
        tituloAdminDescripcion.setLocation(681, 185);
        
        JLabel tituloAdminPrecio = new JLabel("Precio");
        tituloAdminPrecio.setSize(65, 16);
        tituloAdminPrecio.setLocation(964, 185);
        
        JTextField IdentificadorRecibidos1 = new JTextField("Identificador");
        IdentificadorRecibidos1.setSize(169, 45);
        IdentificadorRecibidos1.setLocation(114, 217);
        
        JTextField IdentificadorRecibidos2 = new JTextField("Identificador");
        IdentificadorRecibidos2.setSize(169, 45);
        IdentificadorRecibidos2.setLocation(303, 217);
        
        JTextField IdentificadorRecibidos3 = new JTextField("Identificador");
        IdentificadorRecibidos3.setSize(169, 45);
        IdentificadorRecibidos3.setLocation(492, 217);
        
        JTextField IdentificadorRecibidos4 = new JTextField("Identificador");
        IdentificadorRecibidos4.setSize(263, 45);
        IdentificadorRecibidos4.setLocation(681, 217);
        
        JTextField IdentificadorRecibidos5 = new JTextField("Identificador");
        IdentificadorRecibidos5.setSize(169, 45);
        IdentificadorRecibidos5.setLocation(964, 217);
        
        JTextField IdentificadorRecibidos1a = new JTextField("Identificador");
        IdentificadorRecibidos1a.setSize(169, 45);
        IdentificadorRecibidos1a.setLocation(114, 282);
        
        JTextField IdentificadorRecibidos2a = new JTextField("Identificador");
        IdentificadorRecibidos2a.setSize(169, 45);
        IdentificadorRecibidos2a.setLocation(303, 282);
        
        JTextField IdentificadorRecibidos3a = new JTextField("Identificador");
        IdentificadorRecibidos3a.setSize(169, 45);
        IdentificadorRecibidos3a.setLocation(492, 282);
        
        JTextField IdentificadorRecibidos4a = new JTextField("Identificador");
        IdentificadorRecibidos4a.setSize(263, 45);
        IdentificadorRecibidos4a.setLocation(681, 282);
        
        JTextField IdentificadorRecibidos5a = new JTextField("Identificador");
        IdentificadorRecibidos5a.setSize(169, 45);
        IdentificadorRecibidos5a.setLocation(964, 282);
        
      
//--------------------------------------------------------------------
        
        
        menuAdminConsultaRecibidos2.add(tituloAdminListaRecibidos);
        menuAdminConsultaRecibidos2.add(tituloAdminIdentificardor);
        menuAdminConsultaRecibidos2.add(tituloAdminRemitente);
        menuAdminConsultaRecibidos2.add(tituloAdminPeso);
        menuAdminConsultaRecibidos2.add(tituloAdminDescripcion);
        menuAdminConsultaRecibidos2.add(tituloAdminPrecio);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos1);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos2);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos3);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos4);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos5);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos1a);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos2a);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos3a);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos4a);
        menuAdminConsultaRecibidos2.add(IdentificadorRecibidos5a);
       
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Entregados 1-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsultaEntregados = new JLabel("Consulta de Articulos Entregados");
        tituloAdminConsultaEntregados.setSize(456, 45);
        tituloAdminConsultaEntregados.setLocation(380, -82);
        
        JLabel tituloAdminCliente = new JLabel("Cliente");
        tituloAdminCliente.setSize(56, 16);
        tituloAdminCliente.setLocation(398, 181);
        
        JTextField ConsultaNombreEntregados = new JTextField("nombre");
        ConsultaNombreEntregados.setSize(357, 45);
        ConsultaNombreEntregados.setLocation(398, 217);
        
        JButton botonConsultaEntregadosSiguiente = new JButton("Siguiente");
        botonConsultaEntregadosSiguiente.setSize(169, 46);
        botonConsultaEntregadosSiguiente.setLocation(492,741);
        botonConsultaEntregadosSiguiente.setBackground(Color.decode("#5A4FF3"));
        botonConsultaEntregadosSiguiente.setForeground(Color.white);
        
        menuAdminConsultaEntregados1.add(tituloAdminConsultaEntregados);
        menuAdminConsultaEntregados1.add(tituloAdminCliente);
        menuAdminConsultaEntregados1.add(ConsultaNombreEntregados);
        menuAdminConsultaEntregados1.add(botonConsultaEntregadosSiguiente);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //----------------------- Eventos ---------------------------------------
        botonConsultaEntregadosSiguiente.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregados2.setVisible(true);
            menuAdminConsultaEntregados1.setVisible(false);
        });  
   
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Entregados 2-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminListaEntregados = new JLabel("Lista de Entregables");
        tituloAdminListaEntregados.setSize(305, 45);
        tituloAdminListaEntregados.setLocation(424, 99);
        
        JLabel tituloAdminIdentificardorEntregados = new JLabel("Identificador");
        tituloAdminIdentificardorEntregados.setSize(138, 16);
        tituloAdminIdentificardorEntregados.setLocation(114, 185);
        
        JLabel tituloAdminRemitenteEntregados= new JLabel("Remitente");
        tituloAdminRemitenteEntregados.setSize(99, 16);
        tituloAdminRemitenteEntregados.setLocation(303, 185);
        
        JLabel tituloAdminPesoEntregados = new JLabel("Peso");
        tituloAdminPesoEntregados.setSize(46, 16);
        tituloAdminPesoEntregados.setLocation(492, 185);
        
        JLabel tituloAdminDescripcionEntregados= new JLabel("Descripcion");
        tituloAdminDescripcionEntregados.setSize(120, 16);
        tituloAdminDescripcionEntregados.setLocation(681, 185);
        
        JLabel tituloAdminPrecioEntregados = new JLabel("Precio");
        tituloAdminPrecioEntregados.setSize(65, 16);
        tituloAdminPrecioEntregados.setLocation(964, 185);
        
        JTextField IdentificadorEntregados1 = new JTextField("Identificador");
        IdentificadorEntregados1.setSize(169, 45);
        IdentificadorEntregados1.setLocation(114, 217);
        
        JTextField IdentificadorEntregados2 = new JTextField("Identificador");
        IdentificadorEntregados2.setSize(169, 45);
        IdentificadorEntregados2.setLocation(303, 217);
        
        JTextField IdentificadorEntregados3 = new JTextField("Identificador");
        IdentificadorEntregados3.setSize(169, 45);
        IdentificadorEntregados3.setLocation(492, 217);
        
        JTextField IdentificadorEntregados4 = new JTextField("Identificador");
        IdentificadorEntregados4.setSize(263, 45);
        IdentificadorEntregados4.setLocation(681, 217);
        
        JTextField IdentificadorEntregados5 = new JTextField("Identificador");
        IdentificadorEntregados5.setSize(169, 45);
        IdentificadorEntregados5.setLocation(964, 217);
        
        JTextField IdentificadorEntregados1a = new JTextField("Identificador");
        IdentificadorEntregados1a.setSize(169, 45);
        IdentificadorEntregados1a.setLocation(114, 282);
        
        JTextField IdentificadorEntregados2a = new JTextField("Identificador");
        IdentificadorEntregados2a.setSize(169, 45);
        IdentificadorEntregados2a.setLocation(303, 282);
        
        JTextField IdentificadorEntregados3a = new JTextField("Identificador");
        IdentificadorEntregados3a.setSize(169, 45);
        IdentificadorEntregados3a.setLocation(492, 282);
        
        JTextField IdentificadorEntregados4a = new JTextField("Identificador");
        IdentificadorEntregados4a.setSize(263, 45);
        IdentificadorEntregados4a.setLocation(681, 282);
        
        JTextField IdentificadorEntregados5a = new JTextField("Identificador");
        IdentificadorEntregados5a.setSize(169, 45);
        IdentificadorEntregados5a.setLocation(964, 282);
        
        menuAdminConsultaEntregados2.add(tituloAdminListaEntregados);
        menuAdminConsultaEntregados2.add(tituloAdminIdentificardorEntregados);
        menuAdminConsultaEntregados2.add(tituloAdminRemitenteEntregados);
        menuAdminConsultaEntregados2.add(tituloAdminPesoEntregados);
        menuAdminConsultaEntregados2.add(tituloAdminDescripcionEntregados);
        menuAdminConsultaEntregados2.add(tituloAdminPrecioEntregados);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados1);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados2);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados3);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados4);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados5);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados1a);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados2a);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados3a);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados4a);
        menuAdminConsultaEntregados2.add(IdentificadorEntregados5a);
       
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Pendientes 1-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsultaPendientes = new JLabel("Consulta de Articulos Entregados");
        tituloAdminConsultaPendientes.setSize(456, 45);
        tituloAdminConsultaPendientes.setLocation(380, -82);
        
        JLabel tituloAdminFechaPendientes = new JLabel("Fecha");
        tituloAdminFechaPendientes.setSize(56, 16);
        tituloAdminFechaPendientes.setLocation(398, 181);
        
        JTextField ConsultaNombrePendientes = new JTextField("nombre");
        ConsultaNombrePendientes.setSize(357, 45);
        ConsultaNombrePendientes.setLocation(398, 217);
        
        JButton botonConsultaPendientesSiguiente = new JButton("Siguiente");
        botonConsultaPendientesSiguiente.setSize(169, 46);
        botonConsultaPendientesSiguiente.setLocation(492,741);
        botonConsultaPendientesSiguiente.setBackground(Color.decode("#5A4FF3"));
        botonConsultaPendientesSiguiente.setForeground(Color.white);
        
        menuAdminConsultaPendientes1.add(tituloAdminConsultaPendientes);
        menuAdminConsultaPendientes1.add(tituloAdminFechaPendientes);
        menuAdminConsultaPendientes1.add(ConsultaNombrePendientes);
        menuAdminConsultaPendientes1.add(botonConsultaPendientesSiguiente);
        
        //---------------------------------------------------------------------
        //-------------------------- Eventos ----------------------------------
        botonConsultaEntregadosSiguiente.addActionListener((ActionEvent e) -> {
            menuAdminConsultaEntregados2.setVisible(true);
            menuAdminConsultaEntregados1.setVisible(false);
        });  
        
        botonConsultaPendientesSiguiente.addActionListener((ActionEvent e) -> {
            menuAdminConsultaPendientes1.setVisible(false);
            menuAdminConsultaPendientes2.setVisible(true);
        });
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Pendientes 2-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminListaPendientes = new JLabel("Lista de Entregables");
        tituloAdminListaPendientes.setSize(305, 45);
        tituloAdminListaPendientes.setLocation(424, 99);
        
        JLabel tituloAdminIdentificardorPendientes = new JLabel("Identificador");
        tituloAdminIdentificardorPendientes.setSize(138, 16);
        tituloAdminIdentificardorPendientes.setLocation(114, 185);
        
        JLabel tituloAdminRemitentePendientes= new JLabel("Remitente");
        tituloAdminRemitentePendientes.setSize(99, 16);
        tituloAdminRemitentePendientes.setLocation(303, 185);
        
        JLabel tituloAdminPesoPendientes = new JLabel("Peso");
        tituloAdminPesoPendientes.setSize(46, 16);
        tituloAdminPesoPendientes.setLocation(492, 185);
        
        JLabel tituloAdminDescripcionPendientes= new JLabel("Descripcion");
        tituloAdminDescripcionPendientes.setSize(120, 16);
        tituloAdminDescripcionPendientes.setLocation(681, 185);
        
        JLabel tituloAdminPrecioPendientes = new JLabel("Precio");
        tituloAdminPrecioPendientes.setSize(65, 16);
        tituloAdminPrecioPendientes.setLocation(964, 185);
        
        JTextField IdentificadorPendientes1 = new JTextField("Identificador");
        IdentificadorPendientes1.setSize(169, 45);
        IdentificadorPendientes1.setLocation(114, 217);
        
        JTextField IdentificadorPendientes2 = new JTextField("Identificador");
        IdentificadorPendientes2.setSize(169, 45);
        IdentificadorPendientes2.setLocation(303, 217);
        
        JTextField IdentificadorPendientes3 = new JTextField("Identificador");
        IdentificadorPendientes3.setSize(169, 45);
        IdentificadorPendientes3.setLocation(492, 217);
        
        JTextField IdentificadorPendientes4 = new JTextField("Identificador");
        IdentificadorPendientes4.setSize(263, 45);
        IdentificadorPendientes4.setLocation(681, 217);
        
        JTextField IdentificadorPendientes5 = new JTextField("Identificador");
        IdentificadorPendientes5.setSize(169, 45);
        IdentificadorPendientes5.setLocation(964, 217);
        
        JTextField IdentificadorPendientes1a = new JTextField("Identificador");
        IdentificadorPendientes1a.setSize(169, 45);
        IdentificadorPendientes1a.setLocation(114, 282);
        
        JTextField IdentificadorPendientes2a = new JTextField("Identificador");
        IdentificadorPendientes2a.setSize(169, 45);
        IdentificadorPendientes2a.setLocation(303, 282);
        
        JTextField IdentificadorPendientes3a = new JTextField("Identificador");
        IdentificadorPendientes3a.setSize(169, 45);
        IdentificadorPendientes3a.setLocation(492, 282);
        
        JTextField IdentificadorPendientes4a = new JTextField("Identificador");
        IdentificadorPendientes4a.setSize(263, 45);
        IdentificadorPendientes4a.setLocation(681, 282);
        
        JTextField IdentificadorPendientes5a = new JTextField("Identificador");
        IdentificadorPendientes5a.setSize(169, 45);
        IdentificadorPendientes5a.setLocation(964, 282);
        
        JButton botonConsultaPendienteCorreo = new JButton("Enviar Correo");
        botonConsultaPendienteCorreo.setSize(169, 46);
        botonConsultaPendienteCorreo.setLocation(492,741);
        botonConsultaPendienteCorreo.setBackground(Color.decode("#5A4FF3"));
        botonConsultaPendienteCorreo.setForeground(Color.white);
        
        menuAdminConsultaPendientes2.add(tituloAdminListaPendientes);
        menuAdminConsultaPendientes2.add(tituloAdminIdentificardorPendientes);
        menuAdminConsultaPendientes2.add(tituloAdminRemitentePendientes);
        menuAdminConsultaPendientes2.add(tituloAdminPesoPendientes);
        menuAdminConsultaPendientes2.add(tituloAdminDescripcionPendientes);
        menuAdminConsultaPendientes2.add(tituloAdminPrecioPendientes);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes1);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes2);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes3);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes4);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes5);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes1a);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes2a);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes3a);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes4a);
        menuAdminConsultaPendientes2.add(IdentificadorPendientes5a);
        menuAdminConsultaPendientes2.add(botonConsultaPendienteCorreo);
       
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Tipo Cambio 1-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsultaTipoCambio = new JLabel("Consultar Tipo de Cambio");
        tituloAdminConsultaTipoCambio.setSize(451, 45);
        tituloAdminConsultaTipoCambio.setLocation(379, 86);
        
        JButton botonConsultaCompraDivisa = new JButton("Consultar Tipo de Cambio De Compra de Divisa Extranjera");
        botonConsultaCompraDivisa.setSize(452, 46);
        botonConsultaCompraDivisa.setLocation(349,217);
        botonConsultaCompraDivisa.setBackground(Color.decode("#00C04D"));
        botonConsultaCompraDivisa.setForeground(Color.white);
        
        JButton botonConsultaVentaDivisa= new JButton("Consultar Tipo de Cambio De Venta de Divisa Extranjera");
        botonConsultaVentaDivisa.setSize(452, 46);
        botonConsultaVentaDivisa.setLocation(349,348);
        botonConsultaVentaDivisa.setBackground(Color.decode("#00C04D"));
        botonConsultaVentaDivisa.setForeground(Color.white);
        
        menuAdminConsultaTipoCambio1.add(tituloAdminConsultaTipoCambio);
        menuAdminConsultaTipoCambio1.add(botonConsultaCompraDivisa);
        menuAdminConsultaTipoCambio1.add(botonConsultaVentaDivisa);
        
        botonConsultaCompraDivisa.addActionListener((ActionEvent e) -> {
            menuAdminConsultaTipoCambio1.setVisible(false);
            menuAdminConsultaTipoCambio2.setVisible(true);
        });
        
        botonConsultaVentaDivisa.addActionListener((ActionEvent e) -> {
            menuAdminConsultaTipoCambio1.setVisible(false);
            menuAdminConsultaTipoCambio3.setVisible(true);
        });
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Tipo Cambio 2-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsultaTipoCambio2 = new JLabel("Consultar Tipo de Cambio");
        tituloAdminConsultaTipoCambio2.setSize(451, 45);
        tituloAdminConsultaTipoCambio2.setLocation(379, 86);
        
        JButton botonConsultaCompraDivisa2 = new JButton("Consultar Tipo de Cambio De Compra de Divisa Extranjera");
        botonConsultaCompraDivisa2.setSize(452, 46);
        botonConsultaCompraDivisa2.setLocation(349,217);
        botonConsultaCompraDivisa2.setBackground(Color.decode("#00C04D"));
        botonConsultaCompraDivisa2.setForeground(Color.white);
        
        JLabel tituloAdminTipoCambio = new JLabel("Tipo de Cambio: ");
        tituloAdminTipoCambio.setSize(451, 45);
        tituloAdminTipoCambio.setLocation(349, 349);
        
        menuAdminConsultaTipoCambio2.add(tituloAdminConsultaTipoCambio2);
        menuAdminConsultaTipoCambio2.add(botonConsultaCompraDivisa2);
        menuAdminConsultaTipoCambio2.add(tituloAdminTipoCambio);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #####################################################
        *  #####################################################
        *  ## Componentes menu Consulta Tipo Cambio 3-----------##
        *  #####################################################
        *  #####################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminConsultaTipoCambio3 = new JLabel("Consultar Tipo de Cambio");
        tituloAdminConsultaTipoCambio3.setSize(451, 45);
        tituloAdminConsultaTipoCambio3.setLocation(379, 86);
        
        JButton botonConsultaVentaDivisa2 = new JButton("Consultar Tipo de Cambio De Venta de Divisa Extranjera");
        botonConsultaVentaDivisa2.setSize(452, 46);
        botonConsultaVentaDivisa2.setLocation(349,217);
        botonConsultaVentaDivisa2.setBackground(Color.decode("#00C04D"));
        botonConsultaVentaDivisa2.setForeground(Color.white);
        
        JLabel tituloAdminTipoCambio2 = new JLabel("Tipo de Cambio: ");
        tituloAdminTipoCambio2.setSize(451, 45);
        tituloAdminTipoCambio2.setLocation(349, 349);
        
        menuAdminConsultaTipoCambio3.add(tituloAdminConsultaTipoCambio3);
        menuAdminConsultaTipoCambio3.add(botonConsultaVentaDivisa2);
        menuAdminConsultaTipoCambio3.add(tituloAdminTipoCambio2);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  ##########################################################
        *  ##########################################################
        *  ## Componentes menu Lista Clientes Pendientes-----------##
        *  ##########################################################
        *  ##########################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminListaClientesPendientes = new JLabel("Lista de clientes con paquetes pendientes");
        tituloAdminListaClientesPendientes.setSize(630, 45);
        tituloAdminListaClientesPendientes.setLocation(24, 77);
        
        JLabel tituloAdminIdentificadorClientesPendientes = new JLabel("Identificador");
        tituloAdminIdentificadorClientesPendientes.setSize(138, 16);
        tituloAdminIdentificadorClientesPendientes.setLocation(24, 185);
        
        JLabel tituloAdminNombreClientesPendientes  = new JLabel("Nombre");
        tituloAdminNombreClientesPendientes.setSize(74, 16);
        tituloAdminNombreClientesPendientes.setLocation(209, 185);
        
        JLabel tituloAdminCorreoClientesPendientes = new JLabel("Correo");
        tituloAdminCorreoClientesPendientes.setSize(72, 16);
        tituloAdminCorreoClientesPendientes.setLocation(398, 185);
        
        JLabel tituloAdminTelefonoClientesPendientes = new JLabel("Teléfono");
        tituloAdminTelefonoClientesPendientes.setSize(91, 16);
        tituloAdminTelefonoClientesPendientes.setLocation(681, 185);
        
        JLabel tituloAdminCantidadPaquetesClientesPendientes = new JLabel("Cantidad de Paquetes");
        tituloAdminCantidadPaquetesClientesPendientes.setSize(188, 16);
        tituloAdminCantidadPaquetesClientesPendientes.setLocation(870, 185);
        
        JTextField IdentificadorPaquetesPendientes1 = new JTextField("Identificador");
        IdentificadorPaquetesPendientes1.setSize(169, 45);
        IdentificadorPaquetesPendientes1.setLocation(20, 217);
        
        JTextField IdentificadorPaquetesPendientes2 = new JTextField("Identificador");
        IdentificadorPaquetesPendientes2.setSize(169, 45);
        IdentificadorPaquetesPendientes2.setLocation(209, 217);
        
        JTextField IdentificadorPaquetesPendientes3 = new JTextField("Identificador");
        IdentificadorPaquetesPendientes3.setSize(169, 45);
        IdentificadorPaquetesPendientes3.setLocation(398, 217);
        
        JTextField IdentificadorPaquetesPendientes4 = new JTextField("Identificador");
        IdentificadorPaquetesPendientes4.setSize(75, 45);
        IdentificadorPaquetesPendientes4.setLocation(681, 217);
        
        JTextField IdentificadorPaquetesPendientes5 = new JTextField("Identificador");
        IdentificadorPaquetesPendientes5.setSize(75, 45);
        IdentificadorPaquetesPendientes5.setLocation(870, 217);
        
        menuAdminListaClientesPendientes.add(tituloAdminListaClientesPendientes);
        menuAdminListaClientesPendientes.add(tituloAdminIdentificadorClientesPendientes);
        menuAdminListaClientesPendientes.add(tituloAdminNombreClientesPendientes);
        menuAdminListaClientesPendientes.add(tituloAdminCorreoClientesPendientes);
        menuAdminListaClientesPendientes.add(tituloAdminTelefonoClientesPendientes);
        menuAdminListaClientesPendientes.add(tituloAdminCantidadPaquetesClientesPendientes);
        menuAdminListaClientesPendientes.add(IdentificadorPaquetesPendientes1);
        menuAdminListaClientesPendientes.add(IdentificadorPaquetesPendientes2);
        menuAdminListaClientesPendientes.add(IdentificadorPaquetesPendientes3);
        menuAdminListaClientesPendientes.add(IdentificadorPaquetesPendientes4);
        menuAdminListaClientesPendientes.add(IdentificadorPaquetesPendientes5);
        
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------

        /*
        *  #################################################
        *  #################################################
        *  ## Componentes menu Resumen Contable-----------##
        *  #################################################
        *  #################################################
        */                      
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        
        JLabel tituloAdminResumenContable = new JLabel("Recepción de Resumen Contable");
        tituloAdminResumenContable.setSize(490, 45);
        tituloAdminResumenContable.setLocation(396, 99);
        
        JLabel tituloAdminResumenContableFecha = new JLabel("Fecha");
        tituloAdminResumenContableFecha.setSize(58, 16);
        tituloAdminResumenContableFecha.setLocation(398, 181);
        
        JTextField ResumenContableTexto = new JTextField("Nombre");
        ResumenContableTexto.setSize(357, 45);
        ResumenContableTexto.setLocation(398, 217);
        
        JButton botonResumenContableSiguiente = new JButton("Siguiente");
        botonResumenContableSiguiente.setSize(169, 46);
        botonResumenContableSiguiente.setLocation(492,741);
        botonResumenContableSiguiente.setBackground(Color.decode("#5A4FF3"));
        botonResumenContableSiguiente.setForeground(Color.white);
        
        menuAdminResumenContable.add(tituloAdminResumenContable);
        menuAdminResumenContable.add(tituloAdminResumenContableFecha);
        menuAdminResumenContable.add(ResumenContableTexto);
        menuAdminResumenContable.add(botonResumenContableSiguiente);

    }
}




