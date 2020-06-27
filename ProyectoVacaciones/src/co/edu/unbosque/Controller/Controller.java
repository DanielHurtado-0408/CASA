package co.edu.unbosque.Controller;

import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.View;

public class Controller implements ActionListener, ItemListener{
	
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
		
		view.getVentanaPrincipal().getPanelUsuario().getBtnComprar().addActionListener(this);
		
		view.getVentanaPrincipal().getPanelUsuario().getCategorias().addItemListener(this);
		view.getVentanaPrincipal().getPanelUsuario().getSubcategorias().addItemListener(this);
		view.getVentanaPrincipal().getPanelUsuario().getProductos().addItemListener(this);
	}

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
		if(e.getSource() == view.getVentanaPrincipal().getPanelUsuario().getBtnComprar()) {
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.getVentanaPrincipal().getPanelUsuario().getCategorias()) {
			seleccionarCategorias();
		}
	}
	
	public void seleccionarCategorias() {

		ImageIcon imagenCategorias;
		Icon imagen2Categorias;
		
		String[] subcategoriasJuegos = {"PC", "XBOX", "PS", "NINTENDO"};
		String[] subcategoriasAudiovisuales = {"Drama", "Accion", "Niños", "Ficcion", "Terror", "Comedia"};
		String[] subcategoriasMusica = {"Pop", "Salsa", "Popular", "Merengue", "Reggaeton","Electronica" ,"Acustico"};


				
		if(view.getVentanaPrincipal().getPanelUsuario().getCategorias().getSelectedItem().toString() == "Juegos") {
			imagenCategorias = new ImageIcon("src/imagenes/videojuegos5.jpg");
			imagen2Categorias = new ImageIcon(imagenCategorias.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
			view.getVentanaPrincipal().getPanelUsuario().getImagenCategorias().setIcon(imagen2Categorias);
			for(int i= 0; i< subcategoriasJuegos.length; i++) {
			view.getVentanaPrincipal().getPanelUsuario().getSubcategorias().addItem(subcategoriasJuegos[i]);
			    }
		}
		if(view.getVentanaPrincipal().getPanelUsuario().getCategorias().getSelectedItem().toString() == "Audiovisuales") {
			imagenCategorias = new ImageIcon("src/imagenes/audiovisuales.jpg");
			imagen2Categorias = new ImageIcon(imagenCategorias.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT));
			view.getVentanaPrincipal().getPanelUsuario().getImagenCategorias().setIcon(imagen2Categorias);
			for(int i= 0; i< subcategoriasAudiovisuales.length; i++) {
				view.getVentanaPrincipal().getPanelUsuario().getSubcategorias().addItem(subcategoriasAudiovisuales[i]);
				JOptionPane.showMessageDialog(null, subcategoriasAudiovisuales);
				}
		}
		if(view.getVentanaPrincipal().getPanelUsuario().getCategorias().getSelectedItem().toString() == "Musica") {
			imagenCategorias = new ImageIcon("src/imagenes/viajes2.jpg");
			imagen2Categorias = new ImageIcon(imagenCategorias.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT));
			view.getVentanaPrincipal().getPanelUsuario().getImagenCategorias().setIcon(imagen2Categorias);
			for(int i= 0; i< subcategoriasMusica.length; i++) {
				view.getVentanaPrincipal().getPanelUsuario().getSubcategorias().addItem(subcategoriasMusica[i]);
				}
		}
	}
	
	public void seleccionarSubcategorias(){
		
		ImageIcon imagenSubcategorias;
		Icon imagen2Subcategorias;
		
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
				
				  view.getVentanaPrincipal().getPanelUsuario().setVisible(true);
				  view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelLogin());
				  view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().getPanelUsuario()); 
				  view.getVentanaPrincipal().repaint();
				 
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

