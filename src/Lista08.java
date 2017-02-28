import javax.swing.JOptionPane;

/*
  
8) Elaborar um programa, em linguagem Java, capaz de informar quando uma matriz
qualquer é simétrica. Essa matriz deverá ser global e todos os seus elementos digitados.
Uma matriz é dita simétrica quando ela for igual à sua transposta. 
  
  
  
 */
public class Lista08 {

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
		
		//Preenche a matriz transposta
		for (int i = 0; i < matriz1.length; i++) {
			
			for (int j = 0; j < matriz1.length; j++) {
				
			matriz2[i][j] = matriz1[j][i];
				
			}
		}
		
		JOptionPane.showMessageDialog(null, VerificaSeEhSimetrica(matriz1, matriz2));

	}
	
	public static String VerificaSeEhSimetrica(int[][] vetor, int[][]vetor2){
	
		for (int i = 0; i < vetor.length; i++) {
			
			for (int j = 0; j < vetor.length; j++) {
				
				//JOptionPane.showMessageDialog(null, "matriz1 " +vetor[i][j]+" matriz2 " +vetor2[i][j]);
				if(vetor[i][j] != vetor2[i][j]){
				
					return "Não é simetrica";
				
				}
				
			}
		}
		
		return "É Simetrica";
	}

}
