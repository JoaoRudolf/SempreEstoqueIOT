import java.util.Timer;
import java.util.TimerTask;

public class Principal {

	public static void main(String[] args) {
		Timer timer = new Timer();

		Insumo caixaParafuso40mm = new Insumo("Caixa de Parafuso 40mm", 10);
		caixaParafuso40mm = compraDeEstoque(caixaParafuso40mm, 30);
		System.out.println("Saldo estoque " + caixaParafuso40mm.quantidadeAtual);

		// Create a task to be scheduled
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Scheduled task is running.");
			}
		};

		// Schedule the task to run repeatedly after an interval of 10 seconds
		timer.schedule(task, 10000, 10000);

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
