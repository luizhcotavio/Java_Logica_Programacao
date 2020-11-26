package listaDeTarefasComArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MainListaDeTarefas {

	public static void main(String[] args) throws IOException {

		
		int i=1;
		String respostaUsuario ="";
		String condicaoParaSair ="x";
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		System.out.print("Digite x para encerrar ou Entre com o nome da atividade["+i+"]: ");
		respostaUsuario = leia.next();
		linhas.add("Atividade ["+i+"] :"+respostaUsuario);
		while(!(respostaUsuario.equals(condicaoParaSair))) {		
		i++;
		System.out.print("Digite x para encerrar ou Entre com o nome da atividade["+i+"]: ");
		respostaUsuario = leia.next();
		
		linhas.add("Atividade ["+i+"] :"+respostaUsuario);
		}
		
		
		
		Path arquivo = Paths.get("C:/Users/Eliana-Pc/Desktop/listaDeTarefas.txt");
		
		Files.write(arquivo, linhas);
		
		System.out.println("Fim do programa.");
		
		leia.close();

	}

}
