/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaChaveValor;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author Eduardo
 * @param <C>
 * @param <V>
 */
public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new HashSet<>();

	public void adicionar(C chave, V valor) {
		if (chave == null) {
			return;
		}

		Par<C, V> novoPar = new Par<>(chave, valor);

		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}

		itens.add(novoPar);
	}

	public V getValor(C chave) {
		if (chave == null) {
			return null;
		}

		Optional<Par<C, V>> parOpcional = itens.stream().filter(p -> chave.equals(p.getChave())).findFirst();

		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
