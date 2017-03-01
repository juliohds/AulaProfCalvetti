package vetores;
import javax.swing.JOptionPane;

public class Lista01 {

	public static void main(String agrs[]){
		
		int nro = 1;
		int aux = 1;
		int vetor[] = new int[100];
				
		while (nro!=0) {
			
			nro = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero de inicio"));
			
		}
		
		for (int j = 0; j < 100; j++) {
			
			vetor[j] = aux;
			aux++;
			
			JOptionPane.showMessageDialog(null, vetor[j]);
			
		}
			
	}
		
	
}
