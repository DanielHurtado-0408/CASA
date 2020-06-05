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
	private JButton btnClickHere;
	private JLabel msj3;
	private JButton btnSignUp;
	private JButton btnSignIn;

	
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
		msj1.setForeground(Color.white);// darle color a la letra 
		msj1.setBounds(165,372,130,20);
		msj1.setFont(new java.awt.Font("Calibri light",Font.PLAIN,12));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(msj1); 
		
		
		msj3 = new JLabel("Click Here");
		msj3.setForeground(Color.WHITE);// darle color a la etiqueta
		msj3.setBounds(266,370,130,20);
		msj3.setFont(new java.awt.Font("Arial",Font.BOLD,12));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(msj3); 
		
		btnClickHere = new JButton("");
		btnClickHere.setBounds(245,370,100,20);
		btnClickHere.setOpaque(false);
		btnClickHere.setBorderPainted(false);
		btnClickHere.setBackground(Color.white);
		btnClickHere.setFont(new java.awt.Font("Arial",Font.BOLD,12));
		add(btnClickHere);
		
		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(155, 330,90,30);
		btnSignUp.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(btnSignUp);
	
	    btnSignIn = new JButton("SIGN IN");
	    btnSignIn.setBounds(245, 330,90,30);
	    btnSignIn.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
	    add(btnSignIn);
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

	public JButton getBtnClickHere() {
		return btnClickHere;
	}

	public void setBtnClickHere(JButton btnClickHere) {
		this.btnClickHere = btnClickHere;
	}

	public JLabel getMsj3() {
		return msj3;
	}

	public void setMsj3(JLabel msj3) {
		this.msj3 = msj3;
	}

	public JButton getBtnSignUp() {
		return btnSignUp;
	}

	public void setBtnSignUp(JButton btnSignUp) {
		this.btnSignUp = btnSignUp;
	}

	public JButton getBtnSignIn() {
		return btnSignIn;
	}

	public void setBtnSignIn(JButton btnSignIn) {
		this.btnSignIn = btnSignIn;
	}
	
	
	
	

}
