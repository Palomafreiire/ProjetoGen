package ModuloUm;

import java.util.Scanner;

public class Humanas extends Inscricao {
	
	Scanner diz =new Scanner (System.in);
	int op;
	
	public Humanas(String nome) {
		super(nome);
	}

	@Override
	void area(String curso) {	
		
		System.out.println("\nEscolha seu curso: ");
		System.out.println("[1] História"+ "\t"+ "[2] Artes"+ "\n[3] Letras"+ "\t"+ "[4] Direito");
		op = diz.nextInt();
		
		switch (op) {
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
			
		
		} 
	}
	

