import java.util.Scanner;

public class RetornaDiaDaSemana {

	
	
		public static void main(String[] args) {
			
					
			Scanner leia = new Scanner(System.in);
			
			byte DIA_DA_SEMANA = 0;
			String RESULTADO_DIA_DA_SEMANA = "";	
			
			System.out.print("Programa que retorna o dia da Semana conforme o numero. \n\nEntre com um numero de 1 a 7: ");
			DIA_DA_SEMANA = leia.nextByte();
			
			switch(DIA_DA_SEMANA) {
			case 1: RESULTADO_DIA_DA_SEMANA = "Segunda"; break;
			case 2: RESULTADO_DIA_DA_SEMANA = "Terça"; break;
			case 3: RESULTADO_DIA_DA_SEMANA = "Quarta"; break;
			case 4: RESULTADO_DIA_DA_SEMANA = "Quinta"; break;
			case 5: RESULTADO_DIA_DA_SEMANA = "Sexta"; break;
			case 6: RESULTADO_DIA_DA_SEMANA = "Sábado"; break;
			case 7: RESULTADO_DIA_DA_SEMANA = "Domingo"; break;
			default: System.err.print("Opção Inválida. Digite um numero de 1 a 7");
			System.exit(1);
			}
			
			System.out.println("O numero "+DIA_DA_SEMANA+" equivale ao dia da Semana de nome: "+RESULTADO_DIA_DA_SEMANA+".");
			
			leia.close();
		}
		

	

}
