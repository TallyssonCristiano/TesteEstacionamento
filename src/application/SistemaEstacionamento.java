package application;


import statement.ConexaoBancoDeDados;

public class SistemaEstacionamento {

	public static void main(String[] args) {

		ConexaoBancoDeDados conexaoBDD = new ConexaoBancoDeDados();
		String login1 = "tallysson";
		String senha1 = "123";

		conexaoBDD.checkLogin(login1, senha1);
	}

}
