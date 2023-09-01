package arq;

import java.nio.file.*;

public class SeExiste {
	public static void main(String[] args) {
		Path arquivo = Paths.get("C://Users//Eduardo//OneDrive//Documentos//arquivos//texto.txt");

		Path diretorio = Paths.get("C://Users//Eduardo//OneDrive//Documentos//arquivos");

		if (Files.isDirectory(diretorio)) {
			System.out.println("Diretorio existente :D");
		} else {
			System.out.println("Diretorio nao existente :(");
		}

		if (Files.exists(arquivo)) {
			System.out.println("Arquivo existente :D");
		} else {
			System.out.println("Arquivo nao existente :(");
		}
	}
}
