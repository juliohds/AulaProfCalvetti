/*
  
Rescrever o exercício no. 12 desta lista, utilizando métodos com passagem de
parâmetros; 

*/
package d_metodos_com_parametros;

import javax.swing.JOptionPane;

/*
 JulioHDS
*/
public class Lista18 {

	public static void main(String[] args) {
		
int matriz[][] = new int[2][2];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
			
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("preencha a malha: "));
				
			}
		}
				
		int n = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				
				n = matriz[i][j];
				JOptionPane.showMessageDialog(null, n + " é primo? " + ehPrimo(n));			
				
			}
		}
		
		
		
	}
	
	
	public static boolean ehPrimo(int n){
		
		if(n<=1)
			return false;
		
		if(n==2)
			return true;
		
		if(n>2){
			
			int cont = 0;
			
				for (int i = 1; i <= n; i++) {
					
					if(n%i==0){
						cont+=1;						
					}
						
				}
				
				if(cont==2)
					return true;
				else
					return false;
		}else{
		
			return false;
		
		}
	}
	

}
