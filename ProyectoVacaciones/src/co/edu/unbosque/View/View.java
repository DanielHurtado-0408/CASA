package co.edu.unbosque.View;

import co.edu.unbosque.Controller.Controller;

public class View {
	
	private VentanaPrincipal ventanaPrincipal;
	
	public View (Controller controller) {
		
		ventanaPrincipal = new VentanaPrincipal(controller);
	}

	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
	
	

}
