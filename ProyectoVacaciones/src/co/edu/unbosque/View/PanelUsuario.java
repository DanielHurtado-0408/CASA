package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JPanel{
	
	private JTextArea enunciado1;
	private JLabel enunciado2;
	private JLabel logotipo1;
	public ImageIcon imagenLogotipo1;
	public Icon imagen2Logotipo1;
	private JLabel logotipo2;
	private JComboBox<String> categorias;
	private JComboBox subcategoria;
	private JComboBox tiendas;
	private JComboBox productos;
	private JLabel imagenCategorias;
	private JLabel imagenSubcategorias;
	private JLabel imagenAlmacen;
	private JTextField infoProducto;
	
	public PanelUsuario()  {		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);//esta mierda es obligatoria
		}
	
	public void inicializarComponentes() {
		
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 40, 40, 60, 45 ), new TitledBorder("") ) );
		
		enunciado1 = new JTextArea("COMPRAS ONLINE" + "\n" + "        MY APP");
		enunciado1.setForeground(Color.WHITE);// darle color a la etiqueta
		enunciado1.setBounds(50,80,200,100);
		enunciado1.setOpaque(false);
		enunciado1.setEditable(false);
		enunciado1.setFont(new java.awt.Font("Calibri light",1,20));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(enunciado1); 
		
		logotipo1 = new JLabel();
		logotipo1.setBounds(250,60,130,80);
		imagenLogotipo1=new ImageIcon(getClass().getResource("logotipo1.jpg"));
		imagen2Logotipo1 = new ImageIcon(imagenLogotipo1.getImage().getScaledInstance(130, 80, Image.SCALE_DEFAULT));
		logotipo1.setIcon(imagen2Logotipo1);
		add(logotipo1);
		
		categorias = new  JComboBox<String>();
		categorias.setBounds(80, 170, 100,30);
		categorias.setOpaque(false);
		categorias.addItem("Categoria");
		categorias.addItem("Tecnologia");
		categorias.addItem("Casa");
		categorias.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(categorias);
	}

}
