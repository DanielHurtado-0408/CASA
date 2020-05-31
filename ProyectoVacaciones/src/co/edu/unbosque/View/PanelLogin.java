package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import utils.RoundedBorder;
import utils.TextPrompt;

public class PanelLogin extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel login;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	private JLabel msj1;
	private JLabel msj2;
	private JButton btnSignUp;

	
	public  PanelLogin() {		
	setLayout(null);
	inicializarComponentes();
	setVisible(true);//esta mierda es obligatoria
	}
	
	public void inicializarComponentes() {
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 100, 100, 100, 100 ), new TitledBorder("") ) );

		
		login = new JLabel("LOGIN");
		login.setForeground(Color.WHITE);// darle color a la etiqueta
		login.setBounds(200,100,100,100);
		login.setFont(new java.awt.Font("Calibri light",1,30));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(login); 
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(155, 210, 180, 30);
		TextPrompt nombrePt = new TextPrompt("Username", txtUsuario);
		nombrePt.changeAlpha(0.55f);
		nombrePt.changeStyle(Font.ROMAN_BASELINE);
		add(txtUsuario);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(155, 270, 180, 30);
		TextPrompt contraseñaPt = new TextPrompt("Pasword", txtContraseña);
		contraseñaPt.changeAlpha(0.55f);
		contraseñaPt.changeStyle(Font.ITALIC);
		add(txtContraseña);
		
		msj1 = new JLabel("Forgot Password?");
		msj1.setForeground(Color.WHITE);// darle color a la etiqueta
		msj1.setBounds(165,372,130,20);
		msj1.setFont(new java.awt.Font("Calibri light",Font.PLAIN,12));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(msj1); 
		
		
		msj2 = new JLabel("Click here");
		msj2.setForeground(Color.WHITE);// darle color a la etiqueta
		msj2.setBounds(265,370,130,20);
		msj2.setFont(new java.awt.Font("Arial",Font.BOLD,12));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(msj2); 
		
		
		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(155, 330,180,30);
		btnSignUp.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(btnSignUp);
	}

	public JLabel getLogin() {
		return login;
	}

	public void setLogin(JLabel login) {
		this.login = login;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtContraseña() {
		return txtContraseña;
	}

	public void setTxtContraseña(JTextField txtContraseña) {
		this.txtContraseña = txtContraseña;
	}

	public JLabel getMsj1() {
		return msj1;
	}

	public void setMsj1(JLabel msj1) {
		this.msj1 = msj1;
	}

	public JLabel getMsj2() {
		return msj2;
	}

	public void setMsj2(JLabel msj2) {
		this.msj2 = msj2;
	}

	public JButton getBtnSignUp() {
		return btnSignUp;
	}

	public void setBtnSignUp(JButton btnSignUp) {
		this.btnSignUp = btnSignUp;
	}
	
	
	

}
