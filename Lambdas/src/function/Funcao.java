package function;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = (x) -> {
			if (x % 2 == 0)
				return "Par";
			return "Impar";
		};

		Function<String, String> oResultadoE = (valor) -> {
			return "O resultado e: " + valor;
		};

		// composição de função
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(13);
		System.out.println(resultadoFinal);
	}
}
