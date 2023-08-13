package exemplo.comgenerics;

/**
 *
 * @author Eduardo
 * @param <T>
 */
public class Caixa<T> {

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	/**
	 *
	 * @return
	 */
	public T abrir() {
		return coisa;
	}	
}
