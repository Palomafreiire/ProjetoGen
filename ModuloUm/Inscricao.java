package ModuloUm;

public abstract class Inscricao {

	private String nome;
	private String CPF;
	private String dataNasc;
	private String curso;
	private boolean concluida;
	
	//construtor
	public Inscricao(String nome) {
		this.nome  = nome;
		
	}
	
	//metodo abstrato
	abstract void area ( String curso); 
	
	// metodo
	
	public void formulario() { //nao precisa ter esse this
		
		System.out.println("================== FICHA DE INSCRIÇÃO - FACULDADE GEN============");
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.CPF);
		System.out.println("Curso: "+this.curso);
		System.out.println("Data de nascimento: "+this.dataNasc);
		System.out.println("=================================================================");

	}
	
	public void InscricaoConcluida() {
		if (concluida == true) 
			System.out.println("\nParabéns, "+nome+" Você está inscrito em "+curso+" do vestibular!");
		
		else 
			
			System.out.println("Infelizmente você não finalizou a inscrição e não está inscrito no vestibular.");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
