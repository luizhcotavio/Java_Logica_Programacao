import java.util.Scanner;

public class CalculaMediaConcursoPublico {

		static final Double NOTA_MINIMA_PARA_APROVACAO_TOTAL = 150.0;
		static final Double NOTA_MINIMA_PARA_APROVACAO_DE_CADA_MATERIA = 60.0;

			
	public static void main(String[] args) {
		
		//Calcular Media entre duas provas. Portugues e Matem�tica.
		//Prova no total vale 200 pontos, sendo 100 para cada mat�ria.
		//Nota M�nima total >= 150
		//N�o pode tirar < 60 pontos em qualquer uma das 2 materias que
		//ele reprova
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Nota da Mat�ria de Portugu�s: ");
		Double NOTA_MATERIA_PORTUGUES = leia.nextDouble();
		
		System.out.println("Nota da Mat�ria de Matem�tica: ");
		Double NOTA_MATERIA_MATEMATICA = leia.nextDouble();
		
				
		Double SOMA_DAS_NOTAS = NOTA_MATERIA_MATEMATICA + NOTA_MATERIA_PORTUGUES;
		boolean APROVADO_NA_PONTUACAO_MINIMA_DE_CADA_MATERIA = (NOTA_MATERIA_MATEMATICA >= NOTA_MINIMA_PARA_APROVACAO_DE_CADA_MATERIA) && (NOTA_MATERIA_PORTUGUES >= NOTA_MINIMA_PARA_APROVACAO_DE_CADA_MATERIA);
		boolean APROVADO_NA_PONTUACAO_TOTAL = (SOMA_DAS_NOTAS >= NOTA_MINIMA_PARA_APROVACAO_TOTAL);
		
		
		if(APROVADO_NA_PONTUACAO_MINIMA_DE_CADA_MATERIA && APROVADO_NA_PONTUACAO_TOTAL) {
			System.out.println("Parab�ns, voc� passou no concurso.");
		}else {
			System.out.println("Infelizmente voc� n�o passou no concurso.");
		}
		leia.close();
	}

}
