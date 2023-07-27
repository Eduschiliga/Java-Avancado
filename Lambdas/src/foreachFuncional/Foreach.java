package foreachFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Lia", "Edu", "Gui");

		System.out.println(">>> Forma Tradicional <<<");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\n>>> Lambda #01 <<<");
		aprovados.forEach((nome) -> {
			System.out.println(nome);
		});

		System.out.println("\n>>> Lambda #02 <<<");
		aprovados.forEach((nome) -> imprimir(nome));

		System.out.println("\n>>> Method Reference #1 <<<");
		aprovados.forEach(System.out::println);

		System.out.println("\n>>> Method Reference #2 <<<");
		aprovados.forEach(Foreach::imprimir);

	}

	public static void imprimir(String nome) {
		System.out.println("Ola, Meu nome eh " + nome);
	}
}
