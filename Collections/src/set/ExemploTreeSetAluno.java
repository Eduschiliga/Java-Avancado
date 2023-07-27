package set;

import domain.Aluno;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Eduschiliga
 */
public class ExemploTreeSetAluno {

	public static void main(String args[]) {
		listaSimples();
	}

	/**
	 * Para não repetir objetos na lista de alunos é necessário que a classe Aluno
	 * implemente a classe Comparable Tem ordem natural dos objetos
	 */
	private static void listaSimples() {
		Set<Aluno> conjunto = new TreeSet<>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 0);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
		Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		System.out.println(conjunto);
	}
}