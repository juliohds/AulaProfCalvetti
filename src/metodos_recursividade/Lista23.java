package metodos_recursividade;
import javax.swing.JOptionPane;

/*
  
Utilizando recursividade, criar um programa, em linguagem Java, que calcule e
apresente a soma de todos os elementos de um vetor, inteiro, de tamanho 10, o qual
deverá ser preenchido, anteriormente ao cálculo, pelo operador; 
  
*/
public class Lista23 {

	public static void main(String[] args) {
	
		int vetor[] = new int[10];
		int soma = 0;
		int c=0;
		
		for(int i = 0; i<10; i++){
			
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Preencha o vetor: "));
			
		}
		
		JOptionPane.showMessageDialog(null, "soma de seus elementos= "+ calculaSomaElementosVetor(vetor, soma, c));
		
	}
	
	public static int calculaSomaElementosVetor(int vetor[], int soma, int c){
	
		if(c == 10){
			
			return soma;
		}	
		else{
			soma += vetor[c];
			c+=1;
			return calculaSomaElementosVetor(vetor, soma, c);
		}
	
	}

}
