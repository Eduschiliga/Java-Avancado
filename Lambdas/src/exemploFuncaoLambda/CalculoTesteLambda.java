package exemploFuncaoLambda;

public class CalculoTesteLambda {
	public static void main(String[] args) {
		Calculo soma = (x, y) -> {
			return x + y;
		};
		
		Calculo multiplicar = (x, y) -> x * y;

		System.out.println(soma.executar(5, 5));
		System.out.println(multiplicar.executar(5, 5));

	}
}
