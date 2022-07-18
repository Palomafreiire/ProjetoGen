package ModuloUm;

import java.util.Scanner;

public class Exata extends Inscricao {
	int op;
	Scanner pegar = new Scanner (System.in);
	

	public Exata(String nome) {
		super(nome);
		
	}
	
	@Override
	void area(String curso) {
		
		System.out.println("\nEscolha seu curso: ");
		System.out.println("[1] Matematica"+ "\t"+ "[2] Engenharia"+ "\n[3] Contábeis"+ "\t"+ "[4] Estatiscas");
		op = pegar.nextInt();	
		switch (op) {
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
			
		
		}
		
	
}
	
	
	


