import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Para fins de protótipo será hard code. Na prática teria uma tela de cadastro.
		Insumo caixaParafuso40mm = new Insumo("Caixa de Parafuso 40mm");
		Insumo parCorredica450mm = new Insumo("Par de corrediças telescópicas 450mm");
		
		reporEstoque(caixaParafuso40mm);

		
		Timer timer = new Timer();
		
		// Método que vai executar periodicamente.
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Conferência do sensor de estoque mínimo: " + LocalDateTime.now());
				int r = new Random().nextInt(11);
				System.out.println("r " + r);
				if (r == 10) {
					System.out.println("precisa comprar mais");
				}
			}
		};

		


		

		
		
		
		// Agendamento para execução a cada uma hora
		timer.schedule(task, 1_000, 1_000);



	}

	public static Insumo reporEstoque(Insumo insumo) {

		
		if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		    // yes option
			System.out.println("sim");
		} else {
		    // no option
			System.out.println("não");
		}
		
		return insumo;
	}


}
