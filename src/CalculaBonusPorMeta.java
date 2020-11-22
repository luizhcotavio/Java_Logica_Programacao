import java.util.Scanner;

public class CalculaBonusPorMeta {

	public static void main(String[] args) {
		
		// Informar Valor da Meta de faturamento do ano passado
		// Informar valor do faturamento real do ultimo ano
		// Informar Media Salarial do ano anterior
		
		
		
		Scanner leia = new Scanner(System.in);
		
		
		Double META_FATURAMENTO_ANO_PASSADO = null;
		Double VALOR_FATURAMENTO_REAL = null;
		Double MEDIA_SALARIAL_ANO_PASSADO = null;
		Double CALCULA_PORCENTAGEM_DA_META = null;
		
		System.out.print("Informe o valor da Meta de Faturamento do ano passado: ");
		META_FATURAMENTO_ANO_PASSADO = leia.nextDouble();
		
		System.out.print("Informe o valor do Faturamento Real do Último Ano: ");
		VALOR_FATURAMENTO_REAL = leia.nextDouble();
		
		System.out.print("Informe a Media Salarial do Último Ano: ");
		MEDIA_SALARIAL_ANO_PASSADO = leia.nextDouble();
		
		CALCULA_PORCENTAGEM_DA_META = 80* (META_FATURAMENTO_ANO_PASSADO/100);
		boolean FATURAMENTO_REAL_MAIOR_QUE_META = VALOR_FATURAMENTO_REAL >= META_FATURAMENTO_ANO_PASSADO;
		boolean FATURAMENTO_MENOR_QUE_META_MAS_ATINGIU_PORCENTAGEM = (VALOR_FATURAMENTO_REAL < META_FATURAMENTO_ANO_PASSADO) && (VALOR_FATURAMENTO_REAL >= CALCULA_PORCENTAGEM_DA_META);
		
		if(FATURAMENTO_REAL_MAIOR_QUE_META) {
			System.out.println("Os funcionários receberão um bonus salarial no valor de R$"+ MEDIA_SALARIAL_ANO_PASSADO+" Reais.");
		}else if (FATURAMENTO_MENOR_QUE_META_MAS_ATINGIU_PORCENTAGEM) {
			System.out.println("Os funcionários receberão uma media salarial no valor de R$"+ CALCULA_PORCENTAGEM_DA_META +" Reais.");
		}else {
			System.out.println("Os funcionários não receberão bonus.");
		}
		
		
		leia.close();
		
	}

}
