package b_matrizes;

import javax.swing.JOptionPane;

/*

9) Determinar se uma matriz é identidade (ou unidade), através de um programa em
linguagem Java. A matriz deverá ser global e todos os seus elementos digitados. Uma
matriz é dita identidade (ou unidade) quando ela for quadrada (no. de linhas igual ao no.
de colunas), tiver todos os elementos de sua diagonal principal (no. da linha igual ao no.
da coluna) iguais a 1 (um) e todos os demais elementos iguais a 0 (zero).


*/
public class Lista09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				
				if(i==j)
					matriz[i][j] = 1;
				
				else
					matriz[i][j] = 0;
				
				JOptionPane.showMessageDialog(null, "VALOR DE ["+i+"]["+j+"] "+ matriz[i][j] );
				
			}
			
		}
				

	}

}
