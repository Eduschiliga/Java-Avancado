package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> umLista = () -> {
			return Arrays.asList("Ana", "Bia", "Lia", "Edu", "Gui");
		};

		System.out.println(umLista.get());
	}
}
