package com.tix.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;
import com.tix.vista.analista.DashboardAnalista;
import com.tix.vista.analista.ListadoJustificacionesAnalista;
import com.tix.vista.analista.ListadoReclamosAnalista;
import com.tix.vista.analista.ListadoUsuariosAnalista;

import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;
	JPanel panel;
	
	//Paneles de login y registro
	private Login loginPanel = new Login();
	private Registro registroPanel = new Registro();
	private ModificarDatosPropios modificarDatosPropiosPanel = new ModificarDatosPropios();
	
	//Dashboards
	private DashboardAnalista dashboardAnalista = new DashboardAnalista();
	
	//Paneles principales
	private ListadoUsuariosAnalista listadoUsuarios = new ListadoUsuariosAnalista();
	private ListadoJustificacionesAnalista listadoJustificaciones = new ListadoJustificacionesAnalista();
	private ListadoReclamosAnalista listadoReclamos = new ListadoReclamosAnalista();
	
	//EmptyPanel
	private EmptyPanel emptyPanel = new EmptyPanel();

	private static Principal vista = new Principal();

	public Principal() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		getContentPane().setLayout(null);
	}

	public static Principal getVista() {
		return vista;
	}

	public Login getLoginPanel() {
		return loginPanel;
	}

	public Registro getRegistroPanel() {
		return registroPanel;
	}
	
	public DashboardAnalista getDashboardAnalista() {
		return dashboardAnalista;
	}
	
	public ListadoUsuariosAnalista getListadoUsuarios() {
		return listadoUsuarios;
	}
	
	public ListadoJustificacionesAnalista getListadoJustificaciones() {
		return listadoJustificaciones;
	}
	
	public ListadoReclamosAnalista getListadoReclamos() {
		return listadoReclamos;
	}
	
	public ModificarDatosPropios getModificarDatosPropios() {
		return modificarDatosPropiosPanel;
	}
	
	public EmptyPanel getEmptyPanel() {
		return emptyPanel;
	}
	
	
}
