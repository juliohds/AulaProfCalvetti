package j_ordena��o_por_trocas;

import javax.swing.JOptionPane;

/*
 * 
 60�) Elaborar um programa, em linguagem Java, capaz de receber, via teclado e em
ordem aleat�ria, o conte�do de cada um dos elementos de um vetor do tipo int, de
tamanho vari�vel, tamb�m digitado, executar a ordena��o crescente do mesmo e
apresentar o vetor ordenado em tela. Utilizar um m�todo de ordena��o por trocas.

 JulioHDS
 */

public class Ex60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			//int vetor[] = new int[4];
			int vetor[] =  {5, 2, 8, 6, 1, 7, 3, 6, 4, 2, 0};	
			int rasc = 0;
			
			vetor = ordenacaoBolha(vetor, rasc);
			
			for (int i = 0; i < vetor.length; i++) {
					
				JOptionPane.showMessageDialog(null, "vetor ordenado["+i+"] "+ vetor[i]);
				
			}
			
			
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
			


