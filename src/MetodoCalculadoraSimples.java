import java.util.Scanner;

public class MetodoCalculadoraSimples {
	
	static Double soma(double numero1, double numero2) {
		return numero1+numero2;
	}
	
	static Double subtracao(double numero1, double numero2) {
		return numero1-numero2;
	}
	
	static Double divisao(double numero1, double numero2) {
		return numero1/numero2;
	}
	
	static Double multiplicacao(double numero1, double numero2) {
		return numero1*numero2;
	}
	
	
public static void main(String[] args) {

	
	Scanner leia = new Scanner(System.in);
	
	Double primeiroNumero = 0.0;
	Double segundoNumero = 0.0;
	byte operacaoEscolhida = 0;
	
	while(operacaoEscolhida !=5 ) {
	System.out.print("\n\nEntre com o primeiro numero: ");
	primeiroNumero = leia.nextDouble();
	
	System.out.print("Entre com o segundo numero: ");
	segundoNumero = leia.nextDouble();
	
	System.out.println("\nSelecione o numero que condiz com a  opera��o que deseja realizar: "
			+ "\n 1) Soma \n 2) Subtra��o \n 3) Divis�o \n 4) Multiplica��o \n 5) Sair ");
	operacaoEscolhida = leia.nextByte();
	
		
			switch(operacaoEscolhida) {
			
			case 1: System.out.println("O resultado da soma ser�: " + soma(primeiroNumero, segundoNumero)); break;
			case 2: System.out.println("O resultado da subtra��o ser�: " + subtracao(primeiroNumero, segundoNumero)); break;
			case 3: System.out.println("O resultado da divis�o ser�: " + divisao(primeiroNumero, segundoNumero)); break;
			case 4: System.out.println("O resultado da multiplica��o ser�: " + multiplicacao(primeiroNumero, segundoNumero)); break;
			case 5: System.out.println("Obrigado, volte sempre"); break;
			default:System.err.println("Op��o inv�lida. Digite um n�mero entre 1 e 5. ");
					System.exit(1);	
			
				
	}
		
		}
		leia.close();
}
}
