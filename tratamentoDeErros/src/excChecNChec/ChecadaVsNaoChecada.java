package excChecNChec;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}

	// Não checada ou não verifica
	public static void geraErro1() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro bem legal! #1");
	}

	// Excessão checada ou verificada
	public static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal! #02");
	}
}
