package e_metodos_recursividade;
import javax.swing.JOptionPane;

public class Lista22 {

	public static void main(String args[]){
		
		int numero = Fibonacci(10);
		
		JOptionPane.showMessageDialog(null, "Este é o 21 termo da sequencia de fibo " + numero);
		
	}
	
	
	public static int Fibonacci(int n1){
		
		if(n1==0) return 0;
		else if(n1==1) return 1;
		else return Fibonacci(n1-1) + Fibonacci(n1-2);
		
		
	}
	
}
