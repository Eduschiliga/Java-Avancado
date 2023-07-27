package exercicio;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import domain.Produto;

public class Desafio {
	public static void main(String[] args) {

		/**
		 * 
		 * 1. A partir do produto calcular o preco real (com desconto) 2. Importo
		 * Municipal: >= 2500 (8,5%) / < 2500 (Isento) 3. Frete: >= 3000 (100) / <
		 * 3000(50) 4. Arredondar: Deixar duas casas decimais 5. Formatar: R$1234,56
		 * 
		 */

		Function<Produto, Double> precoReal = (produto) -> {
			return produto.getPreco() * (1 - produto.getDesconto());
		};

		UnaryOperator<Double> impostoMunicipal = (valor) -> {
			if (valor >= 2500) {
				return valor * 1.085;
			}
			return valor;
		};

		UnaryOperator<Double> calcFrete = (valor) -> {
			if (valor >= 3000) {
				return valor + 100.0;
			}
			return valor + 50.0;
		};

		Function<Double, String> arredondar = (valor) -> {
			DecimalFormat df = new DecimalFormat("#.00");
			return df.format(valor);
		};

		UnaryOperator<String> formatar = (valor) -> {
			return ("R$" + valor).replace(".", ",");
		};

		Produto p1 = new Produto("Notebook", 3875.98, 0.35);

		String result = precoReal.andThen(impostoMunicipal).andThen(calcFrete).andThen(arredondar).andThen(formatar)
				.apply(p1);

		System.out.println(result);

	}
}
