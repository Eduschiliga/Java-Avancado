package map;

import java.util.*;

public class ExemploHashMap {

	public static void main(String args[]) {
		listaSimples();
		listaSimplesIterandoValores();
		listaSimplesIterandoChaves();
		listaSimplesIterandoChaveValor();
	}

	private static void listaSimplesIterandoChaveValor() {
		System.out.println(">>> Lista Simples Iterando Chave-Valor <<<\n");
		Map<Integer, String> lista = new HashMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(3, "Lúcia Ferreira");
		lista.put(4, "João da Silva");

		System.out.println("\n>>> for comum <<<\n");
		Set<Map.Entry<Integer, String>> entry = lista.entrySet();
		for (Map.Entry<Integer, String> e : entry) {
			System.out.println("Chave: " + e.getKey());
			System.out.println("Valor: " + e.getValue());
		}

		System.out.println("\n>>> forEach stream <<<\n");
		lista.entrySet().forEach(e -> {
			System.out.println("Chave: " + e.getKey());
			System.out.println("Valor: " + e.getValue());
		});

		System.out.println("\n>>> forEach stream 1 <<<\n");
		lista.keySet().stream().forEach(System.out::println);

		System.out.println("\n>>> forEach stream 2 <<<");
		lista.values().stream().forEach(System.out::println);

		System.out.println("\n>>> forEach stream 3 <<<\n");
		lista.forEach((key, value) -> System.out.println(key + " " + value));

		System.out.println("\n>>> iterator <<<\n");
		Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry1 = it.next();
			System.out.println("Chave: " + entry1.getKey());
			System.out.println("Valor: " + entry1.getValue());
		}

		System.out.println();
	}

	private static void listaSimplesIterandoChaves() {
		System.out.println(">>> Lista Simples Iterando Chaves <<<\n");
		Map<Integer, String> lista = new HashMap<>();
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
		System.out.println(">>> Lista Simples Iterando Valores <<<\n");
		Map<Integer, String> lista = new HashMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(3, "Lúcia Ferreira");
		lista.put(4, "João da Silva");

		for (String value : lista.values()) {
			System.out.println(value);
		}

		System.out.println();
	}

	private static void listaSimples() {
		System.out.println(">>> Lista Simples <<<\n");
		Map<Integer, String> lista = new HashMap<>();
		lista.put(1, "João da Silva");
		lista.put(2, "Antonio Sousa");
		lista.put(4, "João da Silva");
		lista.put(3, "Lúcia Ferreira");

		System.out.println(lista);
		System.out.println();
	}
}