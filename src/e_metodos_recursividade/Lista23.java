package e_metodos_recursividade;
import javax.swing.JOptionPane;

/*
  
Utilizando recursividade, criar um programa, em linguagem Java, que calcule e
apresente a soma de todos os elementos de um vetor, inteiro, de tamanho 10, o qual
dever� ser preenchido, anteriormente ao c�lculo, pelo operador; 
  
*/
public class Lista23 {

	public static void main(String[] args) {
	
		int vetor[] = new int[10];
		int soma = 0;
		int c=0;
		
		for(int i = 0; i<10; i++){
			
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Preencha o vetor: "));
			
		}
		
		JOptionPane.showMessageDialog(null, "meu m�todo "+ calculaSomaElementosVetor(vetor, soma, c));
		
		JOptionPane.showMessageDialog(null, "metodo professor  "+ somaVetor(vetor, soma));
		
	}
	
	public static int calculaSomaElementosVetor(int vetor[], int soma, int c){
	
		if(c == vetor.length){
			
			return soma;
		}	
		else{
			soma += vetor[c];
			c+=1;
			return calculaSomaElementosVetor(vetor, soma, c);
		}
		
	
	}
	
	
	public static int somaVetor(int v [], int i){
		
		if(i<v.length-1)
			return v[i]+somaVetor(v, i+1);
		else 
			return v[i];
	}

}
