package app;

public class Computador {

	String cliente;
	String patrimonio;
	String modelo;
	String sistemaOperacional;
	
	public void ligar() {
		System.out.println("Ligando Computador");
	}
	
	public void desligar() {
		System.out.println("Desligando Computador");
	}

	@Override
	public String toString() {
		return "Cliente: " + cliente
				+ "\nComputador: " + patrimonio
				+ "\nModelo: " + modelo
				+ "\nSistema Operacional: " + sistemaOperacional;
	}
}
