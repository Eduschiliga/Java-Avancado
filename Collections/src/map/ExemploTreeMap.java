package map;

import java.util.*;

public class ExemploTreeMap {

	public static void main(String args[]) {
		listaSimples();
		listaSimplesIterandoValores();
		listaSimplesIterandoChaves();
		listaSimplesIterandoChaveValor();
		listaSimplesPegandoPelaChave();
	}

	private static void listaSimplesPegandoPelaChave() {
		System.out.println("****** Exemplo Lista Simples Pegando Pela Chave ******");
		Map<Integer, String> lista = new TreeMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(3, "Lúcia Ferreira");
		lista.put(4, "João da Silva");

		String nome = lista.get(3);
		System.out.println("Nome com chave 3: " + nome);
		System.out.println();
	}

	private static void listaSimplesIterandoChaveValor() {
		System.out.println("****** Exemplo Lista Simples Iterando Chave-Valor ******");
		Map<Integer, String> lista = new TreeMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(3, "Lúcia Ferreira");
		lista.put(4, "João da Silva");

		System.out.println("***** for comum *****");
		Set<Map.Entry<Integer, String>> entry = lista.entrySet();
		for (Map.Entry<Integer, String> e : entry) {
			System.out.println("Chave: " + e.getKey());
			System.out.println("Valor: " + e.getValue());
		}

		System.out.println("***** forEach stream *****");
		lista.entrySet().forEach(e -> {
			System.out.println("Chave: " + e.getKey());
			System.out.println("Valor: " + e.getValue());
		});

		System.out.println("***** forEach stream 1 *****");
		lista.keySet().stream().forEach(System.out::println);

		System.out.println("***** forEach stream 2 *****");
		lista.values().stream().forEach(System.out::println);

		System.out.println("***** forEach stream 3 *****");
		lista.forEach((key, value) -> System.out.println(key + " " + value));

		System.out.println("***** iterator *****");
		Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry1 = it.next();
			System.out.println("Chave: " + entry1.getKey());
			System.out.println("Valor: " + entry1.getValue());
		}
		System.out.println();
	}

	private static void listaSimplesIterandoChaves() {
		System.out.println("****** Exemplo Lista Simples Iterando Chaves ******");
		Map<Integer, String> lista = new TreeMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(3, "Lúcia Ferreira");
		lista.put(4, "João da Silva");

		for (Integer value : lista.keySet()) {
			System.out.println(value);
		}
		System.out.println();
	}

	private static void listaSimplesIterandoValores() {
		System.out.println("****** Exemplo Lista Simples Iterando Valores ******");
		Map<Integer, String> lista = new TreeMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(3, "Lúcia Ferreira");
		lista.put(4, "João da Silva");

		for (String value : lista.values()) {
			System.out.println(value);
		}
		System.out.println();
	}

	/**
	 * Chave nunca se repete Garante que as chaves estarão em ordem ascendente. pode
	 * ser retirado do mapa por chave
	 */
	private static void listaSimples() {
		System.out.println("****** Exemplo Lista Simples ******");
		Map<Integer, String> lista = new TreeMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(4, "João da Silva");
		lista.put(3, "Lúcia Ferreira");

		System.out.println(lista);
		System.out.println();
	}

}
