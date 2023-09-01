package arq;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LendoArquivo {
	public static void main(String[] args) {
		Path arquivo = Paths.get("C://Users//Eduardo//OneDrive//Documentos//arquivos//texto.txt");

		if(Files.exists(arquivo)) {
			System.out.println("O arquivo existe :D\n");
			try {
				List<String> linhas = Files.readAllLines(arquivo);
				/*
				 * for (String linha : linhas) { System.out.println(linha); }
				 */
				
				linhas.forEach(linha -> System.out.println(linha));
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("O arquivo nao existe :(");
		}
		

	}
}
