package exemploFuncaoLambda;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo soma = new Somar();
		Calculo multiplicacao = new Multiplicar();
		
		System.out.println(soma.executar(3.8, 5.9));
		System.out.println(multiplicacao.executar(3, 5));

	}
}
