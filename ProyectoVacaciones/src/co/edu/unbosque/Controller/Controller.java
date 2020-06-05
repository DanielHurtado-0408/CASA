package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.View;

public class Controller implements ActionListener{
	
	private View view;
	private Mundo mundo;

	public Controller() {
		
		view = new View(this);
		mundo = new Mundo();
		this.setActionListener();
	}
	
	public void setActionListener() {
		
		view.getVentanaPrincipal().getPanelLogin().getBtnSignUp().addActionListener(this);
		view.getVentanaPrincipal().getPanelLogin().getBtnSignIn().addActionListener(this);		
		
		view.getVentanaPrincipal().getPanelSignUpUsuario().getBtnSignUp().addActionListener(this);
		view.getVentanaPrincipal().getPanelSignUpUsuario().getBtnRegresar().addActionListener(this);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getVentanaPrincipal().getPanelLogin().getBtnSignUp()) {
			registroUsuario();
		}
		if(e.getSource() == view.getVentanaPrincipal().getPanelLogin().getBtnSignIn()) {
			loginUsuario();
		}
		if(e.getActionCommand().equals(view.getVentanaPrincipal().getPanelSignUpUsuario().SAVE)) {
			registrarUsuario();
		}
		if(e.getSource() == view.getVentanaPrincipal().getPanelSignUpUsuario().getBtnRegresar()) {
			view.getVentanaPrincipal().getPanelLogin().setVisible(true);
			view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelSignUpUsuario());
			view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().getPanelLogin());
			view.getVentanaPrincipal().repaint();
		}
	}
	
	public void loginUsuario() {
		String usuario = view.getVentanaPrincipal().getPanelLogin().getTxtUsuario().getText();
		String contraseñaLogin = view.getVentanaPrincipal().getPanelLogin().getTxtContraseña().getText();
		boolean validarLogin = true;
		boolean validarLlenaCamposLogin = true;
		
		for(int i=0; i< mundo.getUsuarioDAO().getUsuarios().size(); i++) {
		if((usuario.equals(mundo.getUsuarioDAO().getUsuarios().get(i).getCorreo())) && (contraseñaLogin.equals(mundo.getUsuarioDAO().getUsuarios().get(i).getContraseña()))){
			validarLogin = true;
		  }
		else {
			validarLogin = false;
		}
		}
		if(usuario.isEmpty() || contraseñaLogin.isEmpty()) {
			validarLlenaCamposLogin = false;
		}
		else {
			validarLlenaCamposLogin = true;
		}

			
			if((validarLogin == true) && (validarLlenaCamposLogin == true)) {
				JOptionPane.showMessageDialog(null, "Usuario ingreso correctamente");
				/*
				 * view.getVentanaPrincipal().getPanelSignUpUsuario().setVisible(true);
				 * view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelLogin())
				 * ; view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().
				 * getPanelSignUpUsuario()); view.getVentanaPrincipal().repaint();
				 */
			}
			else {
				
			}
			if((validarLogin == false)) {
				JOptionPane.showMessageDialog(null, "ERROR, Usuario o Contraseña incorrectos");
				view.getVentanaPrincipal().getPanelLogin().getTxtUsuario().setText("");
				view.getVentanaPrincipal().getPanelLogin().getTxtContraseña().setText("");
			}
			else {
				
			}
			if(validarLlenaCamposLogin == false) {
				JOptionPane.showMessageDialog(null, "ERROR, Llenar todos los campos");
			}
			else {
				
			}

	}
	
	public void registrarUsuario() {

		String nombre = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtNombre().getText();
		String correo = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtCorreo().getText();
		String contraseña = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContraseña().getText();
		String contraseñaConfirmacion = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtConfirmarContraseña().getText();
		boolean llenarCampos = true;
		boolean validar = true;
		boolean validarCorreo = true;
		
		for(int i=0; i<mundo.getUsuarioDAO().getUsuarios().size(); i++) {
			if(correo.equals(mundo.getUsuarioDAO().getUsuarios().get(i).getCorreo())) {
				validarCorreo = false;
			}
		}
		
		if(contraseña.equals(contraseñaConfirmacion)) {
			validar = true;
		}else {
			validar = false;
		}
		
		if((nombre.isEmpty()) || (correo.isEmpty()) || ( contraseña.isEmpty()) || contraseñaConfirmacion.isEmpty()) {
		llenarCampos = false;
		}else {
		llenarCampos = true;
		}

		if(llenarCampos == false) {
		JOptionPane.showMessageDialog(null, "Error, llenar todos los campos");
		}
		else {
			
		}
		if(validar == false) {
			JOptionPane.showMessageDialog(null, "Contraseña y contraseña de confirmacion diferentes");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContraseña().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtConfirmarContraseña().setText("");
		}
		else {
			
		}
		if(validarCorreo == false) {
			JOptionPane.showMessageDialog(null, "Correo ya registrado");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtCorreo().setText("");
		}
		else {
			
		}
		if((validar == true) && (llenarCampos == true) && (validarCorreo==true)) {
			mundo.getUsuarioDAO().agregarUsuario(nombre, correo, contraseña);
			JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
			mundo.getBd().leerArchivo(mundo.getUsuarioDAO().getUsuarios()).forEach(System.out::println);
			
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtNombre().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtCorreo().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContraseña().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtConfirmarContraseña().setText("");
		}

	}
	
	public void registroUsuario() {
		
		  view.getVentanaPrincipal().getPanelSignUpUsuario().setVisible(true);
		  view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelLogin());
		  view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().getPanelSignUpUsuario()); view.getVentanaPrincipal().repaint();
		 
	}

}

