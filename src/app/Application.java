package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Chamado;
import entities.Computador;
import entities.Tecnico;
import entities.TecnicoHardware;
import entities.TecnicoSoftware;

public class Application {

	public static void main(String[] args) {

		/*------------ Missão 1 ------------*/
		
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
		
		System.out.println();
		
		/*------------ Missão 2 ------------*/
		
		Computador pc1 = new Computador();
		Computador pc2 = new Computador();
		
		pc1.setCliente("João silva");
		pc1.setPatrimonio("PC-01");
		pc1.setModelo("Notebook Samsung Intel Celeron");
		pc1.setSistemaOperacional("Windowns 10");
		
		pc2.setCliente("Maria Ferreira");
		pc2.setPatrimonio("PC-02");
		pc2.setModelo("Computador Gamer I7");
		pc2.setSistemaOperacional("Windows 11");
		
		System.out.println(pc1);
		pc1.ligar();
		System.out.println();
		System.out.println(pc2);
		pc2.desligar();
		
		System.out.println();
		
		/*------------ Missão 3 ------------*/
		
		Computador pc = new Computador("João Silva", "PC-001", "Notebook Samsung Intel Celeron", "Windowns 10");
		
		Tecnico tecnico = new Tecnico("Daniel Menezes", "Hardware");
		
		Chamado chamado = new Chamado(123, "Limpeza da placa", "Em manutenção", pc, tecnico);
		System.out.println(chamado);
		
		System.out.println();
		
		/*------------ Missão 4 ------------*/
		
		Tecnico tec1 = new TecnicoHardware("Daniel Menezes", "Hardware");
		Tecnico tec2 = new TecnicoSoftware("João Silva", "Software");

		System.out.println(tec1);
		tec1.realizarAtendimento();
		System.out.println(tec2);
		tec2.realizarAtendimento();
		
		System.out.println();
		
		/*------------ Missão 5 ------------*/
		
		Scanner sc = new Scanner(System.in);
		
		Chamado c1 = new Chamado(123, "Limpeza da placa", "Aguardando", pc, tecnico);
		Chamado c2 = new Chamado(456, "Troca de memoria RAM", "Em manutenção", pc, tecnico);
		Chamado c3 = new Chamado(789, "Troca de placa de video", "Finalizado", pc, tecnico);
		
		try {
            System.out.println("Digite o numero do chamado que deseja buscar:");
            int buscarChamado = sc.nextInt();

            if (buscarChamado == c1.getNumero()) {
                System.out.println(c1);

            } else if (buscarChamado == c2.getNumero()) {
                System.out.println(c2);

            } else if (buscarChamado == c3.getNumero()) {
                System.out.println(c3);

            } else {
                System.out.println("Chamado não encontrado!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro válido!");
        }

        System.out.println("Total de chamados cadastrados: "
                + Chamado.getTotalChamados());

        sc.close();
	}
}
