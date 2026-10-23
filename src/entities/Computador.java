package entities;

public class Computador {

	private String cliente;
	private String patrimonio;
	private String modelo;
	private String sistemaOperacional;
	
	public Computador() {
	}

	public Computador(String cliente, String patrimonio, String modelo, String sistemaOperacional) {
		super();
		this.cliente = cliente;
		this.patrimonio = patrimonio;
		this.modelo = modelo;
		this.sistemaOperacional = sistemaOperacional;
	}

	public void ligar() {
		System.out.println("Ligando Computador");
	}
	
	public void desligar() {
		System.out.println("Desligando Computador");
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public String toString() {
		return "Cliente: " + cliente
				+ "\nComputador: " + patrimonio
				+ "\nModelo: " + modelo
				+ "\nSistema Operacional: " + sistemaOperacional;
	}
}
