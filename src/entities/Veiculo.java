package entities;

import java.util.Date;

public class Veiculo {
	
	private int id;
	private String placa;
	private String modelo;
	private Date dataEntrada;
	private Date dataSaida;
	private float tempo;
	private float valorPago;
	
	public Veiculo (int id, String placa, String modelo, Date dataEntrada, Date dataSaida, float tempo, float valorPago) {
		
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.tempo = tempo;
		this.valorPago = valorPago;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public float getTempo() {
		return tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString() {
		return "Veículo "
				+ modelo
				+ ", Placa: "
				+ placa;
	}
	
	
}
