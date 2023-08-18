/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaChaveValor;

import java.util.Objects;

/**
 *
 * @author Eduardo
 * @param <C>
 * @param <V>
 */
public class Par<C, V> {
	private C chave;
	private V valor;
	
	public Par() {
		
	}
	
	public Par(C chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public C getChave() {
		return chave;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 59 * hash + Objects.hashCode(this.chave);
		hash = 59 * hash + Objects.hashCode(this.valor);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(this.chave, other.chave);
	}


	
}
