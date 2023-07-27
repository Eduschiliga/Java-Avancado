package set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Seus elementos são iterados na ordem em que foram inseridos.
 *
 * @author Eduschiliga
 */
public class ExemploLinkedHashSet {

	public static void main(String args[]) {
		exemploListaSimples();
	}

	private static void exemploListaSimples() {
		System.out.println(">>> Lista Simples <<<");
		Set<String> lista = new LinkedHashSet<String>();
		lista.add("João da Silva");
		lista.add("Antonio Sousa");
		lista.add("Lúcia Ferreira");
		System.out.println(lista);
		System.out.println("");
	}
}