package consumer;

import domain.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = (prod) -> {
			System.out.println("Nome: " + prod.getNome() + "\nPreco: " + prod.getPreco() + "\nDesconto: "
					+ prod.getPreco() + "\n");
		};

		Produto p1 = new Produto("Monitos", 2169.65, 0.45);
		imprimir.accept(p1);

		List<Produto> produtos = Arrays.asList(new Produto("Computador", 2225.65, 0.2),
				new Produto("Impressora", 4500.65, 0.15), new Produto("Celular", 1225.65, 0.1),
				new Produto("Fonte", 825.65, 0.05));

		produtos.forEach(imprimir);

		produtos.forEach(prod -> System.out.println(prod.getPreco() + "\n"));

		produtos.forEach(System.out::println);
	}
}
