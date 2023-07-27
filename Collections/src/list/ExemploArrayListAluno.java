package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.Aluno;
import domain.ComparaNotaAluno;

public class ExemploArrayListAluno {

	public static void main(String args[]) {
		listaSimplesOrdenadaComparatorAluno();
		listaSimplesOrdenadaClasseExterna();
	}

	private static void listaSimplesOrdenadaClasseExterna() {
		System.out.println(">>> Lista Simples Ordenada Classe Externa ");
		List<Aluno> lista = new ArrayList<Aluno>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 0);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);

		lista.add(a);
		lista.add(b);
		lista.add(c);

		System.out.println("Lista sem ordenação: " + lista);
		Collections.sort(lista);
		System.out.println("Lista com ordenação: " + lista);
		System.out.println();
	}

	private static void listaSimplesOrdenadaComparatorAluno() {
		System.out.println(">>> Lista Simples Ordenada Comparator Aluno <<<");
		List<Aluno> lista = new ArrayList<Aluno>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 20);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		System.out.println("Lista sem ordenação: " + lista);
		Collections.sort(lista);
		System.out.println("Lista com ordenação: " + lista);

		ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
		Collections.sort(lista, comparaNotaAluno);
		System.out.println("Lista com ordenação por nota: " + lista);

		System.out.println();
	}
}
