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

public class PanelUsuario extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String imagenCategoriasString;
	private String imagenSubcategoriasString;
	private String imagenAlmacenesString;
	
	private JTextArea enunciado1;
	
	private JLabel logotipo1;
	public ImageIcon imagenLogotipo1;
	public Icon imagen2Logotipo1;
		
	private JComboBox<String> categorias;
	private JLabel imagenCategorias;
	private ImageIcon imagenCategorias1;
	private Icon imagen2Categorias;
	
	private JComboBox<String> subcategorias;
	private JLabel imagenSubcategorias;
	private ImageIcon imagenSubcategorias1;
	private Icon imagen2Subcategorias;

	private JComboBox<String> tiendas;
	private JLabel imagenAlmacen;
	private ImageIcon imagenAlmacenes1;
	private Icon imagen2Almacenes;

	private JComboBox<String>productos;

	private JTextArea infoProducto;
	
	private JButton btnComprar;
	
	public PanelUsuario()  {
		imagenCategoriasString = "";
		imagenSubcategoriasString = "";
		imagenAlmacenesString = "";
		
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
		enunciado1.setFont(new java.awt.Font("Arial Rounded MT Bold",1,20));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(enunciado1); 
		
		logotipo1 = new JLabel();
		logotipo1.setBounds(250,60,130,80);
		imagenLogotipo1=new ImageIcon(getClass().getResource("logotipo1.jpg"));
		imagen2Logotipo1 = new ImageIcon(imagenLogotipo1.getImage().getScaledInstance(130, 80, Image.SCALE_DEFAULT));
		logotipo1.setIcon(imagen2Logotipo1);
		add(logotipo1);
		
		
		categorias = new  JComboBox<String>();
		categorias.setBounds(80, 190, 100,30);
		categorias.setOpaque(false);
		categorias.addItem("Categoria");
		categorias.addItem("Tecnologia");
		categorias.addItem("Casa");
		categorias.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(categorias);
		
		
		subcategorias = new  JComboBox<String>();
		subcategorias.setBounds(80, 260, 100,30);
		subcategorias.setOpaque(false);
		subcategorias.addItem("Subcategoria");
		subcategorias.addItem("Celulares");
		subcategorias.addItem("Computadores");
		subcategorias.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(subcategorias);
		
		
		tiendas = new  JComboBox<String>();
		tiendas.setBounds(80, 330, 100,30);
		tiendas.setOpaque(false);
		tiendas.addItem("Tienda");
		tiendas.addItem("Samgsung");
		tiendas.addItem("Apple");
		tiendas.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(tiendas);
		

		productos = new  JComboBox<String>();
		productos.setBounds(80, 400, 100,30);
		productos.setOpaque(false);
		productos.addItem("Producto");
		productos.addItem("IPHONE 11");
		productos.addItem("IPHONE 11 PRO");
		productos.setFont(new java.awt.Font("Calibri light",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(productos);
		
		imagenCategorias = new JLabel();
		imagenCategorias.setBounds(265,170,100,60);
		imagenCategorias1=new ImageIcon(getClass().getResource(imagenCategoriasString));
		imagen2Categorias = new ImageIcon(imagenCategorias1.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
		imagenCategorias.setIcon(imagen2Categorias);
		add(imagenCategorias);	
		
		
		imagenSubcategorias = new JLabel();
		imagenSubcategorias.setBounds(265,245,100,60);
		imagenSubcategorias1=new ImageIcon(getClass().getResource(imagenSubcategoriasString));
		imagen2Subcategorias = new ImageIcon(imagenSubcategorias1.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
		imagenSubcategorias.setIcon(imagen2Subcategorias);
		add(imagenSubcategorias);
		
		
		imagenAlmacen = new JLabel();
		imagenAlmacen.setBounds(265,320,100,60);
		imagenAlmacenes1=new ImageIcon(getClass().getResource(imagenAlmacenesString));
		imagen2Almacenes = new ImageIcon(imagenAlmacenes1.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT));
		imagenAlmacen.setIcon(imagen2Almacenes);
		add(imagenAlmacen);
		
		
	    infoProducto = new JTextArea("Informacion del producto: ");//se puede meter dos numeros (1: filas y 2:columnas) y si pongo un texto entre comillas es un texto predeterminado
	    infoProducto.setBounds(255,390,120,70);
	    infoProducto.setForeground(Color.WHITE);
	    infoProducto.setOpaque(false);
	    infoProducto.setFont(new java.awt.Font("Arial",1,9));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
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

	public ImageIcon getImagenCategorias1() {
		return imagenCategorias1;
	}

	public void setImagenCategorias1(ImageIcon imagenCategorias1) {
		this.imagenCategorias1 = imagenCategorias1;
	}

	public Icon getImagen2Categorias() {
		return imagen2Categorias;
	}

	public void setImagen2Categorias(Icon imagen2Categorias) {
		this.imagen2Categorias = imagen2Categorias;
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

	public ImageIcon getImagenSubcategorias1() {
		return imagenSubcategorias1;
	}

	public void setImagenSubcategorias1(ImageIcon imagenSubcategorias1) {
		this.imagenSubcategorias1 = imagenSubcategorias1;
	}

	public Icon getImagen2Subcategorias() {
		return imagen2Subcategorias;
	}

	public void setImagen2Subcategorias(Icon imagen2Subcategorias) {
		this.imagen2Subcategorias = imagen2Subcategorias;
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

	public ImageIcon getImagenAlmacenes1() {
		return imagenAlmacenes1;
	}

	public void setImagenAlmacenes1(ImageIcon imagenAlmacenes1) {
		this.imagenAlmacenes1 = imagenAlmacenes1;
	}

	public Icon getImagen2Almacenes() {
		return imagen2Almacenes;
	}

	public void setImagen2Almacenes(Icon imagen2Almacenes) {
		this.imagen2Almacenes = imagen2Almacenes;
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
	
	

}
