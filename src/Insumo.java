
public class Insumo {

	String nome;
	boolean estoqueNaReserva;


	public Insumo() {
	}

	public Insumo(String nome) {
		super();
		this.nome = nome;
		this.estoqueNaReserva = false;
		System.out.println(
				"Foi criado um insumo com o nome de " + nome);
	}

}
