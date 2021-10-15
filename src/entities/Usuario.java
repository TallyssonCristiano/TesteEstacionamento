package entities;

public class Usuario {
	
	private int idUsuario;
	private String nome;
	private String login;
	private String senha;
	
	int id = 0;
	
	public Usuario (String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	public void GerarId() {
		this.idUsuario = id + 1;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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

	public int getId() {
		return idUsuario;
	}

	public void setId(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
