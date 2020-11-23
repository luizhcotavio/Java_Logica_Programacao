import java.util.Scanner;

public class CalculaAposentadoria {
	static final Double IDADE_MINIMA_PARA_APOSENTAR = 55.0;
	static final Double TEMPO_MINIMO_CONTRIBUICAO_PARA_APOSENTAR = 25.0;
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		Double idadePessoa= null;
		Double tempoDeContribuicao = null; 
		
		
		System.out.println("Entre com a sua idade: ");
		idadePessoa = leia.nextDouble();
		
		System.out.println("Entre com o tempo de contribuição: ");
		tempoDeContribuicao = leia.nextDouble();
		
		if(idadePessoa >= IDADE_MINIMA_PARA_APOSENTAR && tempoDeContribuicao >= TEMPO_MINIMO_CONTRIBUICAO_PARA_APOSENTAR) {
			System.out.println("Pode Aposentar");
		}else {
			System.out.println("Não pode aposentar");
		}
		leia.close();
		

	}

}
