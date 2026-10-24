package entities;

public class Chamado {

	private int numeroChamado;
	private String descricao;
	private String status;
	private Computador computador;
	private Tecnico tecnico;
	
	private static int totalChamados = 0;
	
	public Chamado() {
		totalChamados++;
	}
	
	public Chamado(int numeroChamado, String descricao, String status, Computador computador, Tecnico tecnico) {
		this.numeroChamado = numeroChamado;
		this.descricao = descricao;
		this.status = status;
		this.computador = computador;
		this.tecnico = tecnico;
		totalChamados++;
	}

	public int getNumero() {
		return numeroChamado;
	}
	
	public void setNumero(int numero) {
		this.numeroChamado = numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Computador getComputador() {
		return computador;
	}
	
	public void setComputador(Computador computador) {
		this.computador = computador;
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}
	
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	public static int getTotalChamados() {
		return totalChamados;
	}

	@Override
	public String toString() {
		return "Chamado: " + numeroChamado
				+ "\nDescrição: " + descricao
				+ "\nStatus: " + status
				+ "\nCliente: " + computador.getCliente()
				+ "\nComputador: " + computador.getPatrimonio()
				+ "\nTécnico: " + tecnico.getNome() + ", Especialidade: " + tecnico.getEspecialidade();
	}
}
