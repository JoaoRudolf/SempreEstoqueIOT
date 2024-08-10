import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Para fins de protótipo será hard code. Na prática teria uma tela de cadastro.
		Insumo caixaParafuso40mm = new Insumo("Caixa de Parafuso 40mm");
		Insumo parCorredica450mm = new Insumo("Par de corrediças telescópicas 450mm");
		Insumo dobradicaPadrao = new Insumo("Unidade de Dobradiça padrão");
		List<Insumo> insumos = new ArrayList<Insumo>();
		insumos.add(caixaParafuso40mm);
		insumos.add(parCorredica450mm);
		insumos.add(dobradicaPadrao);
		
		Timer timer = new Timer();
		
		// Método que vai executar periodicamente.
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Conferência do sensor de estoque mínimo: " + LocalDateTime.now());
				for (Insumo insumo : insumos) {
					insumo = questionaReposicaoEstoque(insumo);
				}
				for (Insumo insumo : insumos) {
					fazLeituraSensorDeReserva(insumo);
				}
			}
		};

		// Agendamento para execução a cada cinco segundos
		timer.schedule(task, 5_000, 5_000);

	}

	public static Insumo questionaReposicaoEstoque(Insumo insumo) {
		if (insumo.estoqueNaReserva == true) {			
			if (JOptionPane.showConfirmDialog(null, "Reposição de " + insumo.nome + " já foi encomendada?", "WARNING",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				insumo.estoqueNaReserva = false;
				System.out.println("sim");
			} else {
				insumo.estoqueNaReserva = true;
				System.out.println("não");
			}
		}
		return insumo;
	}
	
	public static Insumo fazLeituraSensorDeReserva(Insumo insumo) {
		int random = new Random().nextInt(11);
		if (random >= 9) {
			System.out.println("É necessário encomendar " + insumo.nome);
			insumo.estoqueNaReserva = true;
		} else if (random < 9 && insumo.estoqueNaReserva == false) {
			System.out.println("OK - " + insumo.nome);
		}
		return insumo;
	}

}
