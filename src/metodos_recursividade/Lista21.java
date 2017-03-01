package metodos_recursividade;
import javax.swing.JOptionPane;

public class Lista21 {

	public static void main(String args[]){
		
		int numero = Fatorial(4);
		JOptionPane.showMessageDialog(null, "4 fatorial é "+ numero);
		
	
	System.exit(0);
	
	}
	
	public static int Fatorial(int in){
		
		if(in<=1) return 1;
		else return in* Fatorial(in-1);
	
		
	}
	
}
