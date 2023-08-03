package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
	public static void main(String[] args) {
		Consumer<String> println = System.out::println;

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

		marcas.stream().map(Utilitarios.maiscula).map(Utilitarios.primeiraLetra).map(Utilitarios.grito)
				.forEach(println);
	}
}
