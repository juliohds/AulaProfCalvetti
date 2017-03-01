/*
  
Criar um m�todo, que se utilize de malhas, capaz de informar se o n�mero inteiro e
maior que zero digitado pelo operador � ou n�o primo. Este m�todo dever� ser utilizado
por um programa em linguagem Java, que pedir� ao operador a digita��o do n�mero,
verificar� se o mesmo � ou n�o primo e apresentar� a conclus�o em tela;

*/

package c_metodos_e_chamadas;

import javax.swing.JOptionPane;

public class Lista12 {

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
				JOptionPane.showMessageDialog(null, n + " � primo? " + ehPrimo(n));			
				
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
