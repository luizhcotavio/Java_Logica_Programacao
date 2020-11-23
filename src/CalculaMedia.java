import java.util.Scanner;

public class CalculaMedia {

		static final Double VALOR_MEDIA = 70.0;
		
	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com a nota: ");
		double valorDaNota = leia.nextDouble();
		
		boolean VERIFICA_NOTA_MAIOR_QUE_MEDIA = valorDaNota> VALOR_MEDIA;
		
		if(VERIFICA_NOTA_MAIOR_QUE_MEDIA) {
			System.out.println("Aluno Aprovado.");
		}else {
			System.out.println("Aluno Reprovado");
		}
		
		leia.close();
	}

}
