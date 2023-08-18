package comGenerics;

/**
 *
 * @author Eduardo
 */
public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Eduardo Schiliga");
		System.out.println(caixaA.abrir());

		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(9.9);
		System.out.println(caixaB.abrir());

	}

}
