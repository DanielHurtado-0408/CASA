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
		String contrase�aLogin = view.getVentanaPrincipal().getPanelLogin().getTxtContrase�a().getText();
		boolean validarLogin = true;
		boolean validarLlenaCamposLogin = true;
		
		for(int i=0; i< mundo.getUsuarioDAO().getUsuarios().size(); i++) {
		if((usuario.equals(mundo.getUsuarioDAO().getUsuarios().get(i).getCorreo())) && (contrase�aLogin.equals(mundo.getUsuarioDAO().getUsuarios().get(i).getContrase�a()))){
			validarLogin = true;
		  }
		else {
			validarLogin = false;
		}
		}
		if(usuario.isEmpty() || contrase�aLogin.isEmpty()) {
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
				JOptionPane.showMessageDialog(null, "ERROR, Usuario o Contrase�a incorrectos");
				view.getVentanaPrincipal().getPanelLogin().getTxtUsuario().setText("");
				view.getVentanaPrincipal().getPanelLogin().getTxtContrase�a().setText("");
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
		String contrase�a = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContrase�a().getText();
		String contrase�aConfirmacion = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtConfirmarContrase�a().getText();
		boolean llenarCampos = true;
		boolean validar = true;
		boolean validarCorreo = true;
		
		for(int i=0; i<mundo.getUsuarioDAO().getUsuarios().size(); i++) {
			if(correo.equals(mundo.getUsuarioDAO().getUsuarios().get(i).getCorreo())) {
				validarCorreo = false;
			}
		}
		
		if(contrase�a.equals(contrase�aConfirmacion)) {
			validar = true;
		}else {
			validar = false;
		}
		
		if((nombre.isEmpty()) || (correo.isEmpty()) || ( contrase�a.isEmpty()) || contrase�aConfirmacion.isEmpty()) {
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
			JOptionPane.showMessageDialog(null, "Contrase�a y contrase�a de confirmacion diferentes");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContrase�a().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtConfirmarContrase�a().setText("");
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
			mundo.getUsuarioDAO().agregarUsuario(nombre, correo, contrase�a);
			JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
			mundo.getBd().leerArchivo(mundo.getUsuarioDAO().getUsuarios()).forEach(System.out::println);
			
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtNombre().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtCorreo().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContrase�a().setText("");
			view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtConfirmarContrase�a().setText("");
		}

	}
	
	public void registroUsuario() {
		
		  view.getVentanaPrincipal().getPanelSignUpUsuario().setVisible(true);
		  view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelLogin());
		  view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().getPanelSignUpUsuario()); view.getVentanaPrincipal().repaint();
		 
	}

}

