package ModuloUm;


public class Usuario {

	public static void main(String[] args) {
		
		Humanas usuario1 = new Humanas("Paloma");
		Exata usuario2 = new Exata ("aluno");
		
		
		usuario1.area("curso");
		usuario1.setDataNasc("09/06/1994");
		usuario1.setCPF("123.123.123-12");
		usuario1.setConcluida(true);
		usuario1.InscricaoConcluida();
		System.out.println();
		usuario1.formulario();
		
		usuario2.area("curso");
		usuario2.setDataNasc("09/06/1994");
		usuario2.setConcluida(false);
		usuario2.InscricaoConcluida();
		System.out.println();
		
		
		
	
	}

}
