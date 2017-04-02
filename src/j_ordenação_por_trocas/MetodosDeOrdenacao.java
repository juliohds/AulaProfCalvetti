package j_ordenação_por_trocas;

import javax.swing.JOptionPane;

public class MetodosDeOrdenacao {

	public static void main(String[] args) {
	
	//int vetor[] = new int[4];
	int vetor[] =  {5, 2, 8, 6, 1, 7, 3, 6, 4, 2, 0};	
	int rasc = 0;
	
	vetor = ordenacaoBolha(vetor, rasc);
	
	for (int i = 0; i < vetor.length; i++) {
			
		JOptionPane.showMessageDialog(null, "vetor ordenado["+i+"] "+ vetor[i]);
		
	}
		
	}
	
	public static int[] ordenacaoSelect(int v[]){
		
		return v;
		
	}
	
	public static int[] ordenacaoBolha(int v[], int rasc){
		
		for(int i = 0; i < v.length; i++){
			
			for(int j = 0; j < v.length-1; j++){
				
				if(v[j] > v[j+1]){
					
					rasc = v[j];
					v[j] = v[j+1];
					v[j+1] = rasc;
				}
			}
		}
		return v;
	}
	

}
