
public class EncontraSemanaMaiorFaturamento {

	public static void main(String[] args) {
		
		
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		
		Double somaValorTotalDaSemana = 0.0;
		Double aux = 0.0;
		Integer guardaSemanaComMaiorFaturamento = 0;
		String nomeDaSemana = "";
	
		for (int i = 0; i <mes.length ; i++) {
		
			for(int y= 0 ; y<7;y++) {
				
				somaValorTotalDaSemana = somaValorTotalDaSemana + mes[i][y];
				
			}
			System.out.println(somaValorTotalDaSemana+ "\n");
			
			if (somaValorTotalDaSemana > aux) {
				aux = somaValorTotalDaSemana;
				guardaSemanaComMaiorFaturamento = i;
				
			}
			somaValorTotalDaSemana =0.0;
		}
		switch(guardaSemanaComMaiorFaturamento) {
		case 0: nomeDaSemana = " 1ª Semana \n"; break;
		case 1: nomeDaSemana = " 2ª Semana \n"; break;
		case 2: nomeDaSemana = " 3ª Semana \n"; break;
		case 3: nomeDaSemana = " 4ª Semana \n "; break;
		default: System.err.println("Erro na lógica.");
		System.exit(1);
		}
		System.out.println("A semana com maior faturamento foi a : " + nomeDaSemana + "Com pontuação de: "+aux);
		
	}

}
