package co.edu.unbosque.View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondoLogin extends JPanel{

	private static final long serialVersionUID = 1L;
	private ImageIcon imagen;
	
	public PanelFondoLogin() {
		
		imagen = new ImageIcon(getClass().getResource("Fondo.jpg"));
		setSize(imagen.getIconWidth(), imagen.getIconHeight());
	}
	
	public void paintComponent (Graphics g) {
		Dimension d = getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
	
	
	public void inicalizarComponentes() {
		
		this.setSize(300, 200);
		this.setLayout(new GridLayout());
	}
}
