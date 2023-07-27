package binaryOperatorEBiFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (num1, num2) -> {
			return (num1 + num2) / 2;
		};

		BiFunction<Double, Double, String> resultado = (num1, num2) -> {
			Double med = (num1 + num2) / 2;
			if (med >= 6)
				return "Aprovado";
			return "Reprovado";
		};

		Function<Double, String> conceito = m -> m >= 6 ? "Aprovado" : "Reprovado";

		System.out.println(media.apply(3.98, 7.72));
		System.out.println(resultado.apply(9.7, 8.8));
		System.out.println(media.andThen(conceito).apply(9.8, 5.4));
	}
}
