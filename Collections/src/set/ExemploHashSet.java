package set;

import java.util.*;

/**
 * HashSet não tem ordem O acesso aos dados é mais rápido que em um TreeSet, mas
 * nada garante que os dados estaram ordenados. Não repete valores na lista
 *
 * @author Eduschiliga
 */
public class ExemploHashSet {

	public static void main(String args[]) {
		listaSimples();
		listaSimplesOrdemAscendente();
		exemploNovo();
	}

	private static void exemploNovo() {
		System.out.println(">>> Exemplo Novo <<<");
		Set<Integer> inteiros = new HashSet<>();
		inteiros.add(1);
		inteiros.add(2);
		System.out.println(inteiros);
	}

	/**
	 * Não repete valores na lista
	 */
	private static void listaSimples() {
		System.out.println(">>> Lista Simples <<<");
		Set<String> lista = new HashSet<>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		lista.add("João da Silva");
		System.out.println(lista);
		System.out.println("");
	}

	private static void listaSimplesOrdemAscendente() {
		System.out.println(">>> Lista Simples Ordem Ascendente <<<");
		Set<String> lista = new HashSet<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		// Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");
	}
}