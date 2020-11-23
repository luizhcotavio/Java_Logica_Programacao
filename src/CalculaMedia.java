import java.util.Scanner;

public class CalculaMedia {

		static final Double VALOR_MEDIA = 70.0;
		
	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com a nota: ");
		double valorDaNota = leia.nextDouble();
		
		boolean verificaNotaMaiorQueMedia = valorDaNota> VALOR_MEDIA;
		
		if(verificaNotaMaiorQueMedia) {
			System.out.println("Aluno Aprovado.");
		}else {
			System.out.println("Aluno Reprovado");
		}
		
		leia.close();
	}

}
