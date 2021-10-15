package application;
import entities.Usuario;
import entities.Veiculo;
import utils.ValorEstacionamento;

public class SistemaEstacionamento {
	
	private String modelo;
	private String placa;
	String nome, login, senha, modelo, placa;
	
	int idEstacionamento = 0;
	int idValor = 0;
	
	Usuario usuario = new Usuario(nome, login, senha);
	Veiculo veiculo = new Veiculo(modelo, placa);
	ValorEstacionamento valorEstacionamento = new ValorEstacionamento(idEstacionamento, idEstacionamento, idEstacionamento);
	
}
