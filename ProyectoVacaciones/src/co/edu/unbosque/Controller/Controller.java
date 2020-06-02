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
		view.getVentanaPrincipal().getPanelSignUpUsuario().getBtnSignUp().addActionListener(this);
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getVentanaPrincipal().getPanelLogin().getBtnSignUp()) {
			
			view.getVentanaPrincipal().getPanelSignUpUsuario().setVisible(true);
			view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelLogin());
			view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().getPanelSignUpUsuario());
			view.getVentanaPrincipal().repaint();
			
		}
		if(e.getActionCommand().equals(view.getVentanaPrincipal().getPanelSignUpUsuario().SAVE)) {
			
			String nombre = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtNombre().getText();
			String correo = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtCorreo().getText();
			String contraseña = view.getVentanaPrincipal().getPanelSignUpUsuario().getTxtContraseña().getText();
			
			mundo.getUsuarioDAO().agregarUsuario(nombre, correo, contraseña);
			mundo.getBd().leerArchivo(mundo.getUsuarioDAO().getUsuarios()).forEach(System.out::println);
		}
	}

}
