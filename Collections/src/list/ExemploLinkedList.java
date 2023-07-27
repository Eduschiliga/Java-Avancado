package list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

	public static void main(String args[]) {
		listaSimples();
		listaSimplesOrdemAscendente();
		listaSimplesOrdemDescendente();
	}

	private static void listaSimples() {
		System.out.println(">>> Exemplo Lista Simples <<<\n");
		List<String> lista = new LinkedList<>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		System.out.println("Lista inicial: " + lista);

		lista.remove(0);
		System.out.println("Lista após remover o primeiro elemento: " + lista);

		boolean contem = lista.contains("Antonio Sousa");
		System.out.println("A lista contém 'Antonio Sousa'? " + contem);

		System.out.println("Primeiro elemento da lista: " + lista.get(0));
		System.out.println();
	}

	private static void listaSimplesOrdemAscendente() {
		System.out.println(">>> Exemplo Lista Simples em Ordem Ascendente <<<\n");
		List<String> lista = new LinkedList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		Collections.sort(lista);
		System.out.println("Lista ordenada: " + lista);
		System.out.println();
	}

	private static void listaSimplesOrdemDescendente() {
		System.out.println(">>> Exemplo Lista Simples em Ordem Descendente <<<\n");
		List<String> lista = new LinkedList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");

		// Ordenar em ordem descendente usando um comparador personalizado
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		System.out.println("Lista ordenada em ordem descendente: " + lista);
		System.out.println();
	}
}
