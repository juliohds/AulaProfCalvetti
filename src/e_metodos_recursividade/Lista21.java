package e_metodos_recursividade;
import javax.swing.JOptionPane;

public class Lista21 {

	public static void main(String args[]){
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para fatorial: "));
		int numero = Fatorial(n);
		JOptionPane.showMessageDialog(null, n+" fatorial é "+ numero);
		
	
	System.exit(0);
	
	}
	
	public static int Fatorial(int in){
		
		if(in<=1) return 1;
		else return in* Fatorial(in-1);	
		
	}
	
}
