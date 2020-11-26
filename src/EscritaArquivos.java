package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException{
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i=0; i<3 ; i++) {
			System.out.print("Nome "+(i+1)+" : ");
			String nome = leia.nextLine();
			
			linhas.add(nome);
			
		}
		
		
//		linhas.add("Primeira Linha");
//		linhas.add("Segunda Linha");
		
		Path arquivo = Paths.get("C:/Users/Eliana-Pc/Desktop/arquivo.txt");
		
	
		Files.write(arquivo, linhas);
		System.out.println("Fim..");

	}

}
