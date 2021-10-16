package application;
import entities.Usuario;
import entities.Veiculo;
import utils.ValorEstacionamento;

public class SistemaEstacionamento {
	
	private String modelo;
	private String placa;
	String nome, login, senha;

	Usuario usuario = new Usuario(nome, login, senha);
	Veiculo veiculo = new Veiculo(modelo, placa);
	
}
