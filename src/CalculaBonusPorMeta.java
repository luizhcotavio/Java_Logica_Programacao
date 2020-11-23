import java.util.Scanner;

public class CalculaBonusPorMeta {

	public static void main(String[] args) {
		
		
		
		
		Scanner leia = new Scanner(System.in);
		
		
		Double metaFaturamentoAnoPassado = null;
		Double valorFaturamentoReal = null;
		Double mediaSalarialAnoPassado = null;
		Double calculaPorcentagemDaMeta = null;
		
		System.out.print("Informe o valor da Meta de Faturamento do ano passado: ");
		metaFaturamentoAnoPassado = leia.nextDouble();
		
		System.out.print("Informe o valor do Faturamento Real do Último Ano: ");
		valorFaturamentoReal = leia.nextDouble();
		
		System.out.print("Informe a Media Salarial do Último Ano: ");
		mediaSalarialAnoPassado = leia.nextDouble();
		
		calculaPorcentagemDaMeta = 80* (metaFaturamentoAnoPassado/100);
		boolean faturamentoRealMaiorQueMeta = valorFaturamentoReal >= metaFaturamentoAnoPassado;
		boolean faturamentoMenorQueMetaMasAtingiuPorcentagem = (valorFaturamentoReal < metaFaturamentoAnoPassado) && (valorFaturamentoReal >= calculaPorcentagemDaMeta);
		
		if(faturamentoRealMaiorQueMeta) {
			System.out.println("Os funcionários receberão um bonus salarial no valor de R$"+ mediaSalarialAnoPassado+" Reais.");
		}else if (faturamentoMenorQueMetaMasAtingiuPorcentagem) {
			System.out.println("Os funcionários receberão uma media salarial no valor de R$"+ calculaPorcentagemDaMeta +" Reais.");
		}else {
			System.out.println("Os funcionários não receberão bonus.");
		}
		
		
		leia.close();
		
	}

}
