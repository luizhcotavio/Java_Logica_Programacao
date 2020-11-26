package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class leituraDeArquivo {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:/Users/Eliana-Pc/Desktop/listaDeTarefas.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for(int i=0; i<linhas.size(); i++) {
			String nome = linhas.get(i);
			System.out.println(nome);
		}

	}

}
