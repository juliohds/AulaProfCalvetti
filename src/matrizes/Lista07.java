package matrizes;
import javax.swing.JOptionPane;

/*
  
 7o) Determinar a matriz transposta de uma matriz global qualquer e digitada, através de
um programa em linguagem Java. Uma matriz é dita transposta quando a matriz original
tiver suas linhas transformadas em colunas e suas colunas transformadas em linhas. 
  
  
 */
public class Lista07 {

	public static void main(String[] args) {
		
	int matriz1[][] = new int[3][3];
	int matriz2[][] = new int[3][3];
	int numeros;
	
	for (int i = 0; i < matriz1.length; i++) {
		
		for (int j = 0; j < matriz1.length; j++) {
		
		numeros = Integer.parseInt(JOptionPane.showInputDialog("numero da coluna " + i + " e linha " + j));
		matriz1[i][j] = numeros;
		
		}
	}
		
	for (int i = 0; i < matriz1.length; i++) {
			
			for (int j = 0; j < matriz1.length; j++) {
							
			matriz2[i][j] = matriz1[j][i]; 
			
			}
			
	}
		
	for (int i = 0; i < matriz2.length; i++) {
		
		for (int j = 0; j < matriz2.length; j++) {
		
		JOptionPane.showMessageDialog(null, "matriz Transposta: Coluna: "+i+" linha " +j+" :" +matriz2[i][j] );
	
		}
		
	}
	
	
		
		
	}

}
