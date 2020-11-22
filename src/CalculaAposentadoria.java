import java.util.Scanner;

public class CalculaAposentadoria {
	static final Double IDADE_MINIMA_PARA_APOSENTAR = 55.0;
	static final Double TEMPO_MINIMO_CONTRIBUICAO_PARA_APOSENTAR = 25.0;
	
	public static void main(String[] args) {
		// idadePessoa >= 55 && contribuicao >25
		
		Scanner leia = new Scanner (System.in);
		Double IDADE_PESSOA = null;
		Double TEMPO_DE_CONTRIBUICAO = null;
		
		
		System.out.println("Entre com a sua idade: ");
		IDADE_PESSOA = leia.nextDouble();
		
		System.out.println("Entre com o tempo de contribuição: ");
		TEMPO_DE_CONTRIBUICAO = leia.nextDouble();
		
		if(IDADE_PESSOA >= IDADE_MINIMA_PARA_APOSENTAR && TEMPO_DE_CONTRIBUICAO >= TEMPO_MINIMO_CONTRIBUICAO_PARA_APOSENTAR) {
			System.out.println("Pode Aposentar");
		}else {
			System.out.println("Não pode aposentar");
		}
		leia.close();
		

	}

}
