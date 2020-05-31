package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.View.View;

public class Controller implements ActionListener{
	

	private View view;

	public Controller() {
		
		view = new View(this);
		this.setActionListener();
	}
	
	public void setActionListener() {
		
		view.getVentanaPrincipal().getPanelLogin().getBtnSignUp().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getVentanaPrincipal().getPanelLogin().getBtnSignUp()) {
			
			view.getVentanaPrincipal().getPanelSignUpUsuario().setVisible(true);
			view.getVentanaPrincipal().remove(view.getVentanaPrincipal().getPanelLogin());
			view.getVentanaPrincipal().getContentPane().add(view.getVentanaPrincipal().getPanelSignUpUsuario());
			view.getVentanaPrincipal().repaint();
			
		}
		
	}

}
