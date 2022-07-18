package ModuloUm;

import java.util.Scanner;

public class Saude extends Inscricao {
	int op;
	Scanner ler = new Scanner (System.in);

	public Saude(String nome) {
		super(nome);
		
	}

	@Override
	void area(String curso) {
		
		System.out.println("\nEscolha seu curso: ");
		System.out.println("[1] Medicina"+ "\t"+ "[2] Enfermagem"+ "\n[3] Veterinária"+ "\t"+ "[4] Psicologia");
		op = ler.nextInt();
		
		switch (op) {
		case 1:
			String curso1 = "Medicina";
			this.setCurso(curso1);
			break;
		case 2:
			String curso2 = "Enfermagem";
			this.setCurso(curso2);
			break;
		case 3:
			String curso3 = "Enfermagem";
			this.setCurso(curso3);
			break;
		case 4: 
			String curso4 = "Psicologia";
			this.setCurso(curso4);
			break;
		default:
			System.out.println("Opção incorreta!!");
			
		}
			
		
		
	}		
	}
	


