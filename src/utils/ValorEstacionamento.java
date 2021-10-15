package utils;


public class ValorEstacionamento {
	
	private double valorPorHora;
	private double valorPrimeiraHora;
	private int tempoEstacionado;
		
	public ValorEstacionamento(double valorPorHora, double valorPrimeiraHora, int tempoEstacionado) {
		this.valorPorHora = valorPorHora;
		this.valorPrimeiraHora = valorPrimeiraHora;
		this.tempoEstacionado = tempoEstacionado;
	}
	
	public double Calcular () {
		return valorPrimeiraHora + tempoEstacionado * valorPorHora;
	}


	public double getValorPorHora() {
		return valorPorHora;
	}


	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}


	public double getValorPrimeiraHora() {
		return valorPrimeiraHora;
	}


	public void setValorPrimeiraHora(double valorPrimeiraHora) {
		this.valorPrimeiraHora = valorPrimeiraHora;
	}
	
	
	
}
