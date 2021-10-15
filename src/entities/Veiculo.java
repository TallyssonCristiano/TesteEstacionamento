package entities;
import java.util.Date;

public class Veiculo {
	private String placa;
	private String modelo;
	private Date horaEntrada = new Date();
	
	public Veiculo (String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
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
	
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	public String toString() {
		return "Veículo "
				+ modelo
				+ ", Placa: "
				+ placa +
				", Entrada: " 
				+ horaEntrada;
	}
	
	
}
