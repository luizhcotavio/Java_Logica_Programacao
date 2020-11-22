import java.util.Scanner;

public class CalculaMediaConcursoPublico {

		static final Double NOTA_MINIMA_PARA_APROVACAO_TOTAL = 150.0;
		static final Double NOTA_MINIMA_PARA_APROVACAO_DE_CADA_MATERIA = 60.0;

			
	public static void main(String[] args) {
		
	
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Nota da Matéria de Português: ");
		Double NOTA_MATERIA_PORTUGUES = leia.nextDouble();
		
		System.out.println("Nota da Matéria de Matemática: ");
		Double NOTA_MATERIA_MATEMATICA = leia.nextDouble();
		
				
		Double SOMA_DAS_NOTAS = NOTA_MATERIA_MATEMATICA + NOTA_MATERIA_PORTUGUES;
		boolean APROVADO_NA_PONTUACAO_MINIMA_DE_CADA_MATERIA = (NOTA_MATERIA_MATEMATICA >= NOTA_MINIMA_PARA_APROVACAO_DE_CADA_MATERIA) && (NOTA_MATERIA_PORTUGUES >= NOTA_MINIMA_PARA_APROVACAO_DE_CADA_MATERIA);
		boolean APROVADO_NA_PONTUACAO_TOTAL = (SOMA_DAS_NOTAS >= NOTA_MINIMA_PARA_APROVACAO_TOTAL);
		
		
		if(APROVADO_NA_PONTUACAO_MINIMA_DE_CADA_MATERIA && APROVADO_NA_PONTUACAO_TOTAL) {
			System.out.println("Parabéns, você passou no concurso.");
		}else {
			System.out.println("Infelizmente você não passou no concurso.");
		}
		leia.close();
	}

}
