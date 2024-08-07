
public class Insumo {

	String nome;
	int quantidadeMinima;
	int quantidadeAtual;

	public Insumo() {
	}

	public Insumo(String nome, int quantidadeMinima) {
		super();
		this.nome = nome;
		this.quantidadeMinima = quantidadeMinima;
		System.out.println(
				"Foi criado um insumo com o nome de " + nome + " contendo a quantidade mínima de " + quantidadeMinima);
	}

}
