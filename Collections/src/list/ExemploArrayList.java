package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {
	public static void main(String args[]) {
		exemploListaSimples();
		exemploListaSimplesOrdemAscendente();
		exemploNumeros();
	}

	private static void exemploNumeros() {
		System.out.println("****** Exemplo Numeros ******");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(3);
		System.out.println("Números: " + numeros);
		System.out.println();
	}

	private static void exemploListaSimples() {
		System.out.println("****** Exemplo Lista Simples ******");
		List<String> lista = new ArrayList<>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		System.out.println("Lista de Nomes: " + lista);
		System.out.println();
	}

	private static void exemploListaSimplesOrdemAscendente() {
		System.out.println("****** Exemplo Lista Simples em Ordem Ascendente ******");
		List<String> lista = new ArrayList<>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		Collections.sort(lista);
		System.out.println("Lista de Nomes Ordenada: " + lista);
		System.out.println();
	}
}
