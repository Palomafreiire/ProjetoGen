package ProjetoNovo;

import java.util.ArrayList;
import java.util.Scanner;

public class aluno extends Vestibular {

	@Override
	void menuVestibular() { 
		int op;
		Scanner ler = new Scanner (System.in);
		ArrayList<String> lista = new ArrayList<>();{
		
		do {
			System.out.println("\n=======================LISTA VESTIBULAR===================");
			System.out.println(" [1] Para se inscrever no vestibular");
			System.out.println(" [2] Para concluir a inscrição no vestibular");
			System.out.println(" [3] Para saber as opções de curso ");
			System.out.println(" [0] Digite ZERO para sair da inscrição!");
			System.out.println("==========================================================");
			op = ler.nextInt();
		switch (op) {
		case 1: 
			String inscricao = "inscrição";
			this.areaCurso();
			this.fichaInscricao();
			this.concluida(true);
			lista.add(inscricao);	
			break;
		case 2:
			
			String finalizarInscricao = "finalizar";
			this.areaCurso();
			this.fichaInscricao();
			this.concluida(true);
			lista.add(finalizarInscricao);
			break;
		case 3:
			String curso = "curso";
			System.out.println("Cursos disponiveis no momento: ");
			System.out.println("Exatas: [1] Matematica [2] Engenharia [3] Contábeis [4] Estatiscas");
			System.out.println("Saúde: [1] Medicina [2] Enfermagem [3] Veterinária [4] Psicologia ");
			System.out.println("Humanas: [1] História [2] Artes [3] Letras [4] Direito ");
			break;
		case 0:
			this.concluida(false);
			System.out.println("Saindo da inscrição.......");
			break;
		default:
			System.out.println("ATENÇÃO!!!!!!!");
			System.out.println("Número errado, digite outro número....");								
		}
			
		} while (op!=0);
				
		}
	}	
	@Override
	void areaCurso() {
		System.out.println("Escolha a area do seu curso: ");
		System.out.println("[1] EXATAS");
		System.out.println("[2] SAÚDE");
		System.out.println("[3] HUMANAS");
		int op = ler.nextInt();
		switch (op) {
		case 1: 
			String area1 = "EXATAS";
			this.setAreaCurso(area1);
			
			System.out.println("\nEscolha seu curso: ");
			System.out.println("[1] Matematica"+ "\t"+ "[2] Engenharia"+ "\n[3] Contábeis"+ "\t"+ "[4] Estatiscas");
			int op1 = ler.nextInt();
			switch (op1) {
			case 1:
				String curso1 = "Matematica";
				this.setCurso(curso1);
				break;
			case 2:
				String curso2 = "Engenharia";
				this.setCurso(curso2);
				break;
			case 3:
				String curso3 = "Contabeis";
				this.setCurso(curso3);
				break;
			case 4: 
				String curso4 = "Estatistica";
				this.setCurso(curso4);
				break;
			default:
				System.out.println("Opção incorreta!!");	
			}
			break;
			
		case 2:
			String area2 = "SAÚDE";
			this.setAreaCurso(area2);
			System.out.println("\nEscolha seu curso: ");
			System.out.println("[1] Medicina"+ "\t"+ "[2] Enfermagem"+ "\n[3] Veterinária"+ "\t"+ "[4] Psicologia");
			int op3 = ler.nextInt();
			switch (op3) {
			case 1:
				String curso1 = "Medicina";
				this.setCurso(curso1);
				break;
			case 2:
				String curso2 = "Enfermagem";
				this.setCurso(curso2);
				break;
			case 3:
				String curso3 = "Veterinária";
				this.setCurso(curso3);
				break;
			case 4: 
				String curso4 = "Psicologia";
				this.setCurso(curso4);
				break;
			default:
				System.out.println("Opção incorreta!!");
			}
			break;
		case 3:
			String area3 = "HUMANAS";
			this.setAreaCurso(area3);
			System.out.println("\nEscolha seu curso: ");
			System.out.println("[1] História"+ "\t"+ "[2] Artes"+ "\n[3] Letras"+ "\t"+ "[4] Direito");
			int op4 = ler.nextInt();
			switch (op4) {
			case 1:
				String curso1 = "História";
				this.setCurso(curso1);
				break;
			case 2:
				String curso2 = "Artes";
				this.setCurso(curso2);
				break;
			case 3:
				String curso3 = "Letras";
				this.setCurso(curso3);
				break;
			case 4: 
				String curso4 = "Direito";
				this.setCurso(curso4);
				break;
			default:
				System.out.println("Opção incorreta!!");
				
			}
			break;
		default:
			System.out.println("Opção incorreta!!!");
		
			
		}
	}	
}
