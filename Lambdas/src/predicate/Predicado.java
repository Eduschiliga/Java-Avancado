package predicate;

import domain.Produto;
import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = (produto) -> {
			if (produto.getPreco() * (1 - produto.getDesconto()) >= 775)
				return true;
			return false;
		};
		
		Produto p1 = new Produto("Notebook", 3549.99, 0.15);
		System.out.println(isCaro.test(p1));
	}
}
