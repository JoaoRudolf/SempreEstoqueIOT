
public class Principal {

	public static void main(String[] args) {
		Insumo caixaParafuso40mm = new Insumo("Caixa de Parafuso 40mm", 10);
		caixaParafuso40mm = compraDeEstoque(caixaParafuso40mm, 30);
		System.out.println("Saldo estoque " + caixaParafuso40mm.quantidadeAtual);
		


	}

	public void avisa() {

	}
	
	public void retiraCaixa(int quantidadeRetirada) {

	}
	
	static public Insumo compraDeEstoque(Insumo insumo, int quantidadeAdquirida) {
		insumo.quantidadeAtual += quantidadeAdquirida;
		return insumo;
	}
}
