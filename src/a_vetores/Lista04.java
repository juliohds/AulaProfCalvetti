package a_vetores;
import javax.swing.JOptionPane;

/*
4o) Dado o vetor gerado pelo exercício 3 ( [ ‘A’, ‘B’, ‘C’, ‘D’, ... , ‘W’, ‘X’, ‘Y’, ‘Z’ ] ),
elaborar um programa em linguagem Java capaz de trocar a ordem de seus elementos,
de dois em dois, até o final do mesmo ( [ ‘B’, ‘A’, ‘D’, ‘C’, ... , ‘X’, ‘W’, ‘Z’, ‘Y’ ] ),
utilizando malhas;
 */

public class Lista04 {

	public static void main(String args[]){
				
		char vetor[] = new char[26];
		char aux;
					
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			
		vetor[ch] = ch;
		
	    }

		for(int i = 0; i<25; i+=2){
				
		aux = vetor[i+1];
		vetor[i+1] = vetor[i];
		vetor[i] = aux;
		
			
		}
		
		
		for (int i = 0; i < vetor.length; i++) {
			JOptionPane.showMessageDialog(null, "vetor " + vetor[i]);
		}
		
	}
	
}
