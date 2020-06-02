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
	private JTextField txtContrase�a;
	private JTextField txtConfirmarContrase�a;
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
		signUp.setFont(new java.awt.Font("Calibri light",1,35));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tama�o
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
		
		
		txtContrase�a = new JTextField();
		txtContrase�a.setBounds(125, 270, 180, 30);
		TextPrompt contrase�aRegistroPt = new TextPrompt("Pasword", txtContrase�a);
		contrase�aRegistroPt.changeAlpha(0.55f);
		contrase�aRegistroPt.changeStyle(Font.ROMAN_BASELINE);
		add(txtContrase�a);	
		

		txtConfirmarContrase�a = new JTextField();
		txtConfirmarContrase�a.setBounds(125, 330, 180, 30);
		TextPrompt confirmarcontrase�aRegistroPt = new TextPrompt("Comfirm Pasword", txtConfirmarContrase�a);
		confirmarcontrase�aRegistroPt.changeAlpha(0.55f);
		confirmarcontrase�aRegistroPt.changeStyle(Font.ROMAN_BASELINE);
		add(txtConfirmarContrase�a);	
		
		
		btnSignUp = new JButton("SAVE");
		btnSignUp.setBounds(125, 390,180,30);
		btnSignUp.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tama�o
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


	public JTextField getTxtContrase�a() {
		return txtContrase�a;
	}


	public void setTxtContrase�a(JTextField txtContrase�a) {
		this.txtContrase�a = txtContrase�a;
	}


	public JTextField getTxtConfirmarContrase�a() {
		return txtConfirmarContrase�a;
	}


	public void setTxtConfirmarContrase�a(JTextField txtConfirmarContrase�a) {
		this.txtConfirmarContrase�a = txtConfirmarContrase�a;
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
