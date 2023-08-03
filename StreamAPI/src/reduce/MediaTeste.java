package reduce;

public class MediaTeste {
	public static void main(String[] args) {
		Media m1 = new Media().adicionar(8.7).adicionar(5.5).adicionar(9.4).adicionar(4.3).adicionar(6.4);
		Media m2 = new Media().adicionar(5.7).adicionar(9.5).adicionar(5.4).adicionar(8.3).adicionar(9.4);

		System.out.println(m1.getValor());
		System.out.println(m2.getValor());

		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
