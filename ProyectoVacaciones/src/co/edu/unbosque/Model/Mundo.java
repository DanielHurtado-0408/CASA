package co.edu.unbosque.Model;

import co.edu.unbosque.Model.Persistence.BaseDatosFile;
import co.edu.unbosque.Model.Persistence.UsuarioDAO;

public class Mundo {
	
	private BaseDatosFile bd;
	private UsuarioDAO usuarioDAO;
	
	public Mundo() {
		
		bd = new BaseDatosFile();
		usuarioDAO = new UsuarioDAO();
		
	}

	public BaseDatosFile getBd() {
		return bd;
	}

	public void setBd(BaseDatosFile bd) {
		this.bd = bd;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	

}
