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
	}
}
