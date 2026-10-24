package entities;

public class TecnicoSoftware extends Tecnico {
	
	public TecnicoSoftware(String nome, String especialidade) {
		super(nome, especialidade);
	}

	@Override
	public void realizarAtendimento() {
		System.out.println("Verifico e realizo manutenções no sistema do computador");
	}

	@Override
	public String toString() {
		return "Tecnico: " + super.getNome()
				+ "\nEspecialidade: " + super.getEspecialidade();
	}
}
