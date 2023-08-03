package filter;

public class Produto {
	private String nome;
	private double preco;
	private int codigo;
	private double valorFrete;

	public Produto(String nome, double preco, int codigo, double valorFrete) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		this.valorFrete = valorFrete;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Preco: " + preco + ", Codigo: " + codigo;
	}

	public int getCodigo() {
		return codigo;
	}

}
