import java.util.Scanner;

public class ImprimeTabuadaRecursivo {
	

	static void calculaTabuada(Integer numeroDaTabuada, Integer i) {				
		System.out.println("\n"+numeroDaTabuada +" x "+ i +" = "+(numeroDaTabuada*i)+"\n");
		i++;
		if(i <= 10) {			
			calculaTabuada(numeroDaTabuada,i );
		}
	
	}

	public static void main(String[] args) {
				
		Integer numeroTabuada = 0;				
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o numero que deseja calcular a tabuada: ");
		numeroTabuada=leia.nextInt();
			
		while(numeroTabuada<0) {
			System.out.print("\n\nDigite Apenas valores positivos. \nEntre com o numero que deseja calcular a tabuada: ");
			numeroTabuada=leia.nextInt();
		}
						
		calculaTabuada(numeroTabuada, 0); 

		leia.close();
	}
	

}
