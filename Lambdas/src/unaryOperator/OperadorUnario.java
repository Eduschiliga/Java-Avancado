package unaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		// Recebe um Integer e retorna um Integer
		UnaryOperator<Integer> maisDois = (numero) -> numero + 2;
		UnaryOperator<Integer> vezesDois = (numero) -> numero * 2;
		UnaryOperator<Integer> aoQuadrado = (numero) -> numero * numero;

		Integer result1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
		System.out.println(result1);

		Integer result2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
		System.out.println(result2);
	}
}
