package imprimindo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Luana Matos", "Liinus Travolts", "Lucas Moura", "Ana Maura",
				"Eduardo Schiliga");

		System.out.println(" > > > Usando o foreach < < < \n");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\n > > > Usando o Iterator < < < \n");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n > > > Usando Stream < < < \n");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); // laço interno 
		
	}
}
