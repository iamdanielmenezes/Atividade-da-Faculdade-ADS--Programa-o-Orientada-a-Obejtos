package entities;

public class TecnicoHardware extends Tecnico {
	
	public TecnicoHardware(String nome, String especialidade) {
		super(nome, especialidade);
	}

	@Override
	public void realizarAtendimento() {
		System.out.println("Verifico e realizo manutenções nos componentes físicos do computador");
	}
	
	@Override
	public String toString() {
		return "Tecnico: " + super.getNome()
				+ "\nEspecialidade: " + super.getEspecialidade();
	}

}
