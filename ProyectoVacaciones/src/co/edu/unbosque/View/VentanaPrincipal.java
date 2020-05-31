package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controller;



public class VentanaPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private PanelLogin panelLogin;
	private PanelSignUpUsuario panelSignUpUsuario;
	private PanelFondoLogin jContentPane = null;
	
	public VentanaPrincipal(Controller controller) {
		
		// Definición de los parámetros básicos de la ventana principal

		setSize(500, 600); // tamaño en ancho y alto en pixeles
		setResizable(true); // Se puede cambiar el tamaño de la ventana?
		setTitle("MyApp"); // tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la
												// ventana

		getContentPane().setLayout(null);
		inicializarComponentes();
		setVisible(true);
		setLocationRelativeTo(null); // coloca la ventana al centro de la
		// pantalla
	}
	private void inicializarComponentes() {

		this.setContentPane(getJContentPane());
				
		panelLogin = new PanelLogin();
		panelLogin.setBounds(20, 20, 450, 450);
		
		
		panelSignUpUsuario = new PanelSignUpUsuario();
		panelSignUpUsuario.setBounds(20, 20, 450, 550);
		
		
		add(panelLogin);

		
	}
	
	private PanelFondoLogin getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new PanelFondoLogin();
			jContentPane.setLayout(new GridLayout());
		}
		return (PanelFondoLogin) jContentPane;
	}
	
	
	
	public PanelLogin getPanelLogin() {
		return panelLogin;
	}
	public void setPanelLogin(PanelLogin panelLogin) {
		this.panelLogin = panelLogin;
	}
	public PanelSignUpUsuario getPanelSignUpUsuario() {
		return panelSignUpUsuario;
	}
	public void setPanelSignUpUsuario(PanelSignUpUsuario panelSignUpUsuario) {
		this.panelSignUpUsuario = panelSignUpUsuario;
	}
	public PanelFondoLogin getjContentPane() {
		return jContentPane;
	}
	public void setjContentPane(PanelFondoLogin jContentPane) {
		this.jContentPane = jContentPane;
	}
	
	
	
	
	

	
	
	
	
}