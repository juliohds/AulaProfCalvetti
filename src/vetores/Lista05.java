package vetores;
import javax.swing.JOptionPane;

/*
 
5o) Dado um vetor do tipo int de 16 elementos, a serem digitados aleatoriamente,
elaborar um programa, em linguagem Java, capaz de apresentar a quantidade de
capicuas de 4 elementos existentes ao longo desse vetor (capicua: número que
representa o mesmo valor quando lido da esquerda para a direita e vice-versa).
Exemplo: Vetor digitado

*/

public class Lista05 {

	public static void main(String[] args) {
		
		int capicua = 0;
		
		int vetor[] = new int[16];
		
		for(int i=0; i<16; i++)
		{
		
			int convert = Integer.parseInt(JOptionPane.showInputDialog("entre com um valor:"));
			vetor[i]= convert;
		
		}
		
		for(int i=0; i<16; i++){
						
			try {
				
				if(vetor[i]==vetor[i+3]){
				
				}
				
			} catch (Exception e) {
				break;
			}	
			
				if(vetor[i+1]==vetor[i+2]){
				
				capicua += 1;
				
				}
			
		}
		
		JOptionPane.showMessageDialog(null, "Quantia: " + capicua);
		

	}

}

