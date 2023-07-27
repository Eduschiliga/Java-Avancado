package exemploFuncaoLambda;

import java.util.function.BinaryOperator;

public class CalculoTesteBinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.apply(5.7, 4.3));
	}
}
