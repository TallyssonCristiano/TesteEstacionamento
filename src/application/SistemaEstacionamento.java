package application;


import statement.ConexaoBancoDeDados2;

public class SistemaEstacionamento {

	public static void main(String[] args) {

		ConexaoBancoDeDados2 conexaoBDD = new ConexaoBancoDeDados2();
		
		String login = "admin";
		String senha = "123456";

		if (conexaoBDD.checkLogin2(login, senha) == true) {
			System.out.println("retorno verdadeiro");
		}
		else {
			System.out.println("retorno falso");
		}
		System.out.println();
	}

}
