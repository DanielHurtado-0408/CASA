package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import utils.TextPrompt;

public class PanelSignUpUsuario extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel signUp;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JTextField txtContraseña;
	private JTextField txtConfirmarContraseña;
	private JButton btnSignUp;
	
	public static final String SAVE = "SAVE";
	
	
	
	
	public PanelSignUpUsuario()  {		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);//esta mierda es obligatoria
		}
	
	
	public void inicializarComponentes() {
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 60, 60, 80, 80 ), new TitledBorder("") ) );
		
		signUp = new JLabel("SIGN UP");
		signUp.setForeground(Color.WHITE);// darle color a la etiqueta
		signUp.setBounds(155,80,200,100);
		signUp.setFont(new java.awt.Font("Calibri light",1,35));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(signUp); 
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(125, 150, 180, 30);
		TextPrompt nombreCompletoPt = new TextPrompt("Name", txtNombre);
		nombreCompletoPt.changeAlpha(0.55f);
		nombreCompletoPt.changeStyle(Font.ITALIC);
		add(txtNombre);
		
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(125,210,180,30);
		TextPrompt correoPt = new TextPrompt("Email", txtCorreo);
		correoPt.changeAlpha(0.55f);
		correoPt.changeStyle(Font.ROMAN_BASELINE);
		add(txtCorreo);
		
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(125, 270, 180, 30);
		TextPrompt contraseñaRegistroPt = new TextPrompt("Pasword", txtContraseña);
		contraseñaRegistroPt.changeAlpha(0.55f);
		contraseñaRegistroPt.changeStyle(Font.ROMAN_BASELINE);
		add(txtContraseña);	
		

		txtConfirmarContraseña = new JTextField();
		txtConfirmarContraseña.setBounds(125, 330, 180, 30);
		TextPrompt confirmarcontraseñaRegistroPt = new TextPrompt("Comfirm Pasword", txtConfirmarContraseña);
		confirmarcontraseñaRegistroPt.changeAlpha(0.55f);
		confirmarcontraseñaRegistroPt.changeStyle(Font.ROMAN_BASELINE);
		add(txtConfirmarContraseña);	
		
		
		btnSignUp = new JButton("SAVE");
		btnSignUp.setBounds(125, 390,180,30);
		btnSignUp.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		btnSignUp.setActionCommand(SAVE);
		add(btnSignUp);
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtCorreo() {
		return txtCorreo;
	}


	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}


	public JTextField getTxtContraseña() {
		return txtContraseña;
	}


	public void setTxtContraseña(JTextField txtContraseña) {
		this.txtContraseña = txtContraseña;
	}


	public JTextField getTxtConfirmarContraseña() {
		return txtConfirmarContraseña;
	}


	public void setTxtConfirmarContraseña(JTextField txtConfirmarContraseña) {
		this.txtConfirmarContraseña = txtConfirmarContraseña;
	}


	public JLabel getSignUpLabel() {
		return signUp;
	}


	public void setSignUp(JLabel signUp) {
		this.signUp = signUp;
	}


	public JButton getBtnSignUp() {
		return btnSignUp;
	}


	public void setBtnSignUp(JButton btnSignUp) {
		this.btnSignUp = btnSignUp;
	}


	public static String getSignUp() {
		return SAVE;
	}


	public static String getSave() {
		return SAVE;
	}
	

	
	
		

}
