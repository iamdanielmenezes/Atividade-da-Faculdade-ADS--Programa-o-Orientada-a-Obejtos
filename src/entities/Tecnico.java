package entities;

public class Tecnico {

	private String nome;
	private String especialidade;
	
	public Tecnico() {
	}
	
	public Tecnico(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
