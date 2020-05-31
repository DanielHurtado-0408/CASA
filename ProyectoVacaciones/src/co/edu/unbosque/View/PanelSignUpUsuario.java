package co.edu.unbosque.View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import utils.CircleBorder;

public class PanelSignUpUsuario extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel imagen;
	
	
	
	
	public PanelSignUpUsuario()  {		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);//esta mierda es obligatoria
		}
	
	
	public void inicializarComponentes() {
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 60, 60, 80, 80 ), new TitledBorder("") ) );
		
		imagen =  new JLabel();
		CircleBorder circleBorder = new CircleBorder();
		imagen.setBounds(20,20,20,20);
		imagen.setBorder(circleBorder);
		add(imagen);
		
		
	}
		

}
