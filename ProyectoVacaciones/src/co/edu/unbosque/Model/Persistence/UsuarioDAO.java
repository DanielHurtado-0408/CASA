package co.edu.unbosque.Model.Persistence;

import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {

	List<UsuarioDTO> Usuarios;
	  BaseDatosFile archivos;
	
	public UsuarioDAO() {
		archivos = new BaseDatosFile();
		Usuarios = new ArrayList<>();
		UsuarioDTO usuario1 = new UsuarioDTO("Daniel Hurtado", "CAPO", "COD");
		UsuarioDTO usuario2 = new UsuarioDTO("Camilo Galindo", "JC", "COD");
		Usuarios.add(usuario1);
		Usuarios.add(usuario2);
		archivos.escribirArchivo(Usuarios);
	}
	
	public String eliminarUsuario(String correo) {
		String mensaje = null;
		for(int i = 0; i<Usuarios.size(); i++) {
			if(Usuarios.get(i).getCorreo().equals(correo)) {
				Usuarios.remove(Usuarios.get(i));
				mensaje = ("Usuario " + correo + " fue eliminado exitosamente");
			}
		}
		archivos.escribirArchivo(Usuarios);
      return mensaje;
	}
	
	public String ListaUsuarios(){
		String mensaje = "";
		
		for (int i = 0; i< Usuarios.size(); i++) {
				mensaje +=  " nombre: " + Usuarios.get(i).getNombre()
						+ " Correo: " + Usuarios.get(i).getCorreo()
						+ " Contraseña: " + Usuarios.get(i).getContraseña()
						+ "\n";
			}
		
		archivos.escribirArchivo(Usuarios);
		return mensaje;

	}
	
	
	public String obtenerUsuariosPorCorreoString(String correo) {
		
		String mensaje = null;
		for (int i = 0; i< Usuarios.size(); i++) {
			if(Usuarios.get(i).getCorreo().equals(correo)) {
				mensaje = correo  + " encontrado exitosamente "
						+ "\n nombre: " + Usuarios.get(i).getNombre()
						+ " Juego: " + Usuarios.get(i).getCorreo()
						+ " puntaje: " + Usuarios.get(i).getContraseña() + "\n";
			}
		}
		archivos.escribirArchivo(Usuarios);
		return mensaje;
	}

	public UsuarioDTO modificarUsuario(UsuarioDTO usuario) {
		UsuarioDTO cliente = null;
		for(int i = 0; i<Usuarios.size(); i++) {
			if(Usuarios.get(i).equals(usuario)) {
				Usuarios.get(i).setNombre(usuario.getNombre());
				Usuarios.get(i).setCorreo(usuario.getCorreo());
				Usuarios.get(i).setContraseña(usuario.getContraseña());
			cliente = Usuarios.get(i);
			}
		}
		archivos.escribirArchivo(Usuarios);
		return cliente;
	}
	
	public UsuarioDTO obtenerUsuario(String correo) {
		
		UsuarioDTO usuario = null;
		for (int i = 0; i< Usuarios.size(); i++) {
			if(Usuarios.get(i).getCorreo().equals(correo)) {
				usuario = Usuarios.get(i);
			}
		}
		archivos.escribirArchivo(Usuarios);
		return usuario;
	}
	
	public  String agregarUsuario (String nombre, String correo, String contraseña) {
		String mensaje = "";
			UsuarioDTO usuario= new UsuarioDTO(nombre, correo, contraseña);
			Usuarios.add(usuario);
			mensaje = "El usuario: " + usuario + "fue agregado";
			archivos.escribirArchivo(Usuarios);
			return mensaje;
		}
	
		/*
		 * public void ordenamientoBurbuja() { for(int i =0; i<Gamers.size()-1; i++) {
		 * for(int j = 0; j<Gamers.size();j++) {
		 * if(Gamers.get(i).getPuntaje()>Gamers.get(j).getPuntaje()) { GamerDTO gamer =
		 * new GamerDTO(Gamers.get(j).getNombre(), Gamers.get(j).getNickname(),
		 * Gamers.get(j).getJuego(), Gamers.get(j).getPuntaje()); Gamers.set(j,
		 * Gamers.get(i)); Gamers.set(i, gamer);
		 * 
		 * } } } System.out.println(Usuarios); archivos.escribirArchivo(Usuarios);
		 * 
		 * }
		 */

	
	public List<UsuarioDTO> getUsuarios() {
		return Usuarios;
	}

	public void setUsuarios(List<UsuarioDTO> usuarios) {
		Usuarios = usuarios;
	}
	public BaseDatosFile getArchivos() {
		return archivos;
	}
	public void setArchivos(BaseDatosFile archivos) {
		this.archivos = archivos;
	}
	

}
