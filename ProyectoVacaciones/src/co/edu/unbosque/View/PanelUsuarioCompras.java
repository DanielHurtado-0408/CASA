package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.Model.Mundo;

public class PanelUsuarioCompras extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Mundo mundo;

	private String imagenCategoriasString;
	private String imagenSubcategoriasString;
	private String imagenAlmacenesString;
	
	private JTextArea enunciado1;
	
	private JLabel logotipo1;
	public ImageIcon imagenLogotipo1;
	public Icon imagen2Logotipo1;
		
	private JComboBox<String> categorias;
	private JLabel imagenCategorias;
	
	private JComboBox<String> subcategorias;
	private JLabel imagenSubcategorias;

	private JComboBox<String> tiendas;
	private JLabel imagenAlmacen;

	private JComboBox<String>productos;

	private JTextArea infoProducto;
	
	private JButton btnComprar;
	
	public PanelUsuarioCompras()  {
		imagenCategoriasString = "";
		imagenSubcategoriasString = "";
		imagenAlmacenesString = "";
		
		mundo = new Mundo();
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);//esta mierda es obligatoria
		}
	
	@SuppressWarnings("unchecked")
	public void inicializarComponentes() {
		
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 40, 40, 60, 45 ), new TitledBorder("") ) );
		
		enunciado1 = new JTextArea("EXPERIENCIAS ONLINE" + "\n" + "        MY APP");
		enunciado1.setForeground(Color.WHITE);// darle color a la etiqueta
		enunciado1.setBounds(50,80,250,100);
		enunciado1.setOpaque(false);
		enunciado1.setEditable(false);
		enunciado1.setFont(new java.awt.Font("Arial Rounded MT Bold",1,20));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(enunciado1); 
		
		logotipo1 = new JLabel();
		logotipo1.setBounds(285,60,130,80);
		imagenLogotipo1=new ImageIcon(("src/imagenes/logotipo.jpg"));
		imagen2Logotipo1 = new ImageIcon(imagenLogotipo1.getImage().getScaledInstance(130, 80, Image.SCALE_DEFAULT));
		logotipo1.setIcon(imagen2Logotipo1);
		add(logotipo1);
		

		categorias = new  JComboBox<String>();
		categorias.setBounds(80, 190, 120,30);
		categorias.setOpaque(false);
		categorias.addItem("Categorias");
		categorias.addItem("Juegos");
		categorias.addItem("Audiovisuales");
		categorias.addItem("Musica");
		/*
		 * for(int i = 0; i<mundo.getUsuarioDAO().getUsuarios().size(); i++) {
		 * categorias.addItem(mundo.getUsuarioDAO().getUsuarios().get(i).getNombre()); }
		 */
		categorias.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(categorias);
		
		
		subcategorias = new  JComboBox<String>();
		subcategorias.setBounds(415, 190, 120,30);
		subcategorias.setOpaque(false);
		subcategorias.addItem("Subcategoria");
		subcategorias.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(subcategorias);
		
		
		tiendas = new  JComboBox<String>();
		tiendas.setBounds(765, 190, 120,30);
		tiendas.setOpaque(false);
		tiendas.addItem("Tienda");
		tiendas.addItem("Samgsung");
		tiendas.addItem("Apple");
		tiendas.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(tiendas);
		

		productos = new  JComboBox<String>();
		productos.setBounds(1130, 190, 120,30);
		productos.setOpaque(false);
		productos.addItem("Producto");
		productos.addItem("IPHONE 11");
		productos.addItem("IPHONE 11 PRO");
		productos.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(productos);
		
		imagenCategorias = new JLabel();
		imagenCategorias.setBounds(80,280,200,150);
		add(imagenCategorias);	
		
		
		imagenSubcategorias = new JLabel();
		imagenSubcategorias.setBounds(415,280,200,150);
		add(imagenSubcategorias);
		
		
		imagenAlmacen = new JLabel();
		imagenAlmacen.setBounds(765,280,200,150);
		add(imagenAlmacen);
		
		
	    infoProducto = new JTextArea("Informacion del producto: ");//se puede meter dos numeros (1: filas y 2:columnas) y si pongo un texto entre comillas es un texto predeterminado
	    infoProducto.setBounds(1100,260,200,70);
	    infoProducto.setForeground(Color.WHITE);
	    infoProducto.setOpaque(false);
	    infoProducto.setFont(new java.awt.Font("Arial",1,12));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(infoProducto);
		
		
		btnComprar = new JButton("COMPRAR");
		btnComprar.setBounds(80,460,100,20);
		add(btnComprar);
			
	}
	
	public JTextArea getEnunciado1() {
		return enunciado1;
	}

	public void setEnunciado1(JTextArea enunciado1) {
		this.enunciado1 = enunciado1;
	}

	public JLabel getLogotipo1() {
		return logotipo1;
	}

	public void setLogotipo1(JLabel logotipo1) {
		this.logotipo1 = logotipo1;
	}

	public ImageIcon getImagenLogotipo1() {
		return imagenLogotipo1;
	}

	public void setImagenLogotipo1(ImageIcon imagenLogotipo1) {
		this.imagenLogotipo1 = imagenLogotipo1;
	}

	public Icon getImagen2Logotipo1() {
		return imagen2Logotipo1;
	}

	public void setImagen2Logotipo1(Icon imagen2Logotipo1) {
		this.imagen2Logotipo1 = imagen2Logotipo1;
	}

	public JComboBox<String> getCategorias() {
		return categorias;
	}

	public void setCategorias(JComboBox<String> categorias) {
		this.categorias = categorias;
	}

	public JLabel getImagenCategorias() {
		return imagenCategorias;
	}

	public void setImagenCategorias(JLabel imagenCategorias) {
		this.imagenCategorias = imagenCategorias;
	}

	public JComboBox<String> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(JComboBox<String> subcategorias) {
		this.subcategorias = subcategorias;
	}

	public JLabel getImagenSubcategorias() {
		return imagenSubcategorias;
	}

	public void setImagenSubcategorias(JLabel imagenSubcategorias) {
		this.imagenSubcategorias = imagenSubcategorias;
	}

	public JComboBox<String> getTiendas() {
		return tiendas;
	}

	public void setTiendas(JComboBox<String> tiendas) {
		this.tiendas = tiendas;
	}

	public JLabel getImagenAlmacen() {
		return imagenAlmacen;
	}

	public void setImagenAlmacen(JLabel imagenAlmacen) {
		this.imagenAlmacen = imagenAlmacen;
	}

	public JComboBox<String> getProductos() {
		return productos;
	}

	public void setProductos(JComboBox<String> productos) {
		this.productos = productos;
	}

	public JTextArea getInfoProducto() {
		return infoProducto;
	}

	public void setInfoProducto(JTextArea infoProducto) {
		this.infoProducto = infoProducto;
	}

	public String getImagenCategoriasString() {
		return imagenCategoriasString;
	}

	public void setImagenCategoriasString(String imagenCategoriasString) {
		this.imagenCategoriasString = imagenCategoriasString;
	}

	public String getImagenSubcategoriasString() {
		return imagenSubcategoriasString;
	}

	public void setImagenSubcategoriasString(String imagenSubcategoriasString) {
		this.imagenSubcategoriasString = imagenSubcategoriasString;
	}

	public String getImagenAlmacenesString() {
		return imagenAlmacenesString;
	}

	public void setImagenAlmacenesString(String imagenAlmacenesString) {
		this.imagenAlmacenesString = imagenAlmacenesString;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}

	public Mundo getMundo() {
		return mundo;
	}

	public void setMundo(Mundo mundo) {
		this.mundo = mundo;
	}
	
	

}
