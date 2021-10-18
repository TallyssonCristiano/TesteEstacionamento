package entities;

public class Usuario {
	
	private int id;
	private String usuario;
	private String login;
	private String senha;
	
	public Usuario (int id, String usuario, String login, String senha) {
		this.id = id;
		this.usuario = usuario;
		this.login = login;
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString() {
		return "Id: "
				+ id
				+ " Usuário: "
				+ usuario
				+ " Login: "
				+ login;
		
	}
	
}
