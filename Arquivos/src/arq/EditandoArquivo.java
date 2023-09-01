package arq;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EditandoArquivo {
	public static void main(String[] args) {
		
		Path publiNova = Paths.get("C://Users//Eduardo//OneDrive//Documentos//arquivos//publicacaoNova.jpg");
		Path publiAntiga = Paths.get("C://Users//Eduardo//OneDrive//Documentos//arquivos//publicacaoAntiga.jpg");

		try {
			byte[] bytesPubliNova = Files.readAllBytes(publiNova);
			Files.write(publiAntiga, bytesPubliNova);
			System.out.println("Executado com sucesso!");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
