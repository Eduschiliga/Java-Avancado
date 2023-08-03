package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/*
 * 1. Criar duas Funções Lambdas
 * 2. Usar 2 filters
 * 3. Usar Map
 * */

public class DesafioFilter {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto("Mouse", 45.0, 10458, 0.0));
		produtos.add(new Produto("Teclado", 195.0, 10568, 10.0));
		produtos.add(new Produto("Cabo HDMI", 24.99, 4558, 10.0));
		produtos.add(new Produto("Pendrive", 50.0, 858, 5.0));
		produtos.add(new Produto("Fone", 75.0, 458, 0.0));
		produtos.add(new Produto("Monitor", 1399.99, 16489, 0.0));
		produtos.add(new Produto("Mousepad", 100.0, 5658, 0.0));

		Predicate<Produto> produtoRelevante = (prod) -> {
			return prod.getPreco() > 100.0;
		};

		Predicate<Produto> freteGratis = (prod) -> prod.getValorFrete() == 0.0;

		Function<Produto, String> produtoDestaque = (prod) -> {
			return "> > > Produto Destaque < < <\n" + prod.toString() + "\n";
		};

		produtos.stream().filter(produtoRelevante).filter(freteGratis).map(produtoDestaque)
				.forEach(System.out::println);
	}
}