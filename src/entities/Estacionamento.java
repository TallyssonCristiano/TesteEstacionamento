package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import entities.Usuario;
import entities.Veiculo;

public class Estacionamento {
	
	private int idMovimencao;
	private Veiculo veiculo = new Veiculo(null, null);
	private Date entrada;
	private Date saida;
	
	
	SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
    String timeStamp = date.format(new Date());
    System.out.println ("Current Time Stamp: "+ timeStamp);
	
	
	
}
