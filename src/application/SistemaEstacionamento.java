package application;


import statement.ConexaoBancoDeDados2;

public class SistemaEstacionamento {

	public static void main(String[] args) {

		ConexaoBancoDeDados2 conexaoBDD = new ConexaoBancoDeDados2();
		String login1 = "tallysson";
		String senha1 = "123";

		conexaoBDD.checkLogin(login1, senha1);
	}

}
