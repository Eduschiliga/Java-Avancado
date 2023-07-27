package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import domain.Aluno;
import domain.ComparaNotaAluno;

public class ExemploLinkedListAluno {

	public static void main(String args[]) {
		listaSimplesOrdenadaComparatorAluno();
		listaSimplesOrdenadaClasseExterna();
	}

	private static void listaSimplesOrdenadaClasseExterna() {
		System.out.println(">>> Lista Simples Aluno <<<\n");
		List<Aluno> lista = new LinkedList<>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 0);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		System.out.println("Lista inicial: " + lista);
		Collections.sort(lista);
		System.out.println("Lista após tentativa de ordenação: " + lista);
		System.out.println();
	}

	private static void listaSimplesOrdenadaComparatorAluno() {
		System.out.println(">>> Lista Simples Ordenada com Comparator Aluno <<<\n");
		List<Aluno> lista = new LinkedList<Aluno>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 30);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 20);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		System.out.println("Lista sem ordenação: " + lista + "\n");
		Collections.sort(lista);
		System.out.println("Lista após tentativa de ordenação: " + lista + "\n");

		ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
		Collections.sort(lista, comparaNotaAluno);
		System.out.println("Lista ordenada por nota: " + lista + "\n");

		System.out.println();
	}
}
