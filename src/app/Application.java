package app;

public class Application {

	public static void main(String[] args) {

		String nomeSistema = "IT Solutions System";
		double versao = 2.0;
		String nomeTecnico = "Daniel Menezes";
		int chamadosAbertos = 0;
		boolean statusSistema = true;
		
		System.out.println("Nome do Sistema: " + nomeSistema);
		System.out.println("Versão: " + versao);
		System.out.println("Técnico: " + nomeTecnico);
		
		if (chamadosAbertos > 0) {
			System.out.println("Existem chamados aguardando atendimento");
		}
		else {
			System.out.println("Nenhum chamado pendente");
		}
		
		if (statusSistema) {
			System.out.println("Sistema ativo");
		}
		else {
			System.out.println("Sistema não ativo");
		}
		
		Computador pc1 = new Computador();
		Computador pc2 = new Computador();
		
		pc1.cliente = "João silva";
		pc1.patrimonio = "PC-01";
		pc1.modelo = "Notebook Samsung Intel Celeron";
		pc1.sistemaOperacional = "Windows 10";
		
		pc2.cliente = "Maria Ferreira";
		pc2.patrimonio = "PC-02";
		pc2.modelo = "Computador Gamer I7";
		pc2.sistemaOperacional = "Windows 11";
		
		System.out.println(pc1);
		pc1.ligar();
		System.out.println();
		System.out.println(pc2);
		pc2.desligar();
	}
}
