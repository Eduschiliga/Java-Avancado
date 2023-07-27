package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Eduschiliga
 */
public class ExemploLinkedList {

	public static void main(String args[]) {
		listaSimples();
		listaSimples1();
	}

	private static void listaSimples() {
		System.out.println("****** Lista Simples #1 ******");
		Deque<String> lista = new LinkedList<>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		System.out.println(lista);
		System.out.println("");
	}

	private static void listaSimples1() {
		System.out.println("****** Lista Simples #2 ******");
		Deque<String> lista = new LinkedList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		lista.addFirst("Rodrigo");
		System.out.println(lista);
		System.out.println("");
	}
}