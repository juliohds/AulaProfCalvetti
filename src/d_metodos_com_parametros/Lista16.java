/*

Elaborar um m�todo, em linguagem Java, com passagem de par�metros, dentro de
um programa teste, capaz de informar se o n�mero digitado � par ou impar. A digita��o
do valor e a apresenta��o do resultado dever� acontecer externamente a este m�todo;
   
 */

package d_metodos_com_parametros;

import javax.swing.JOptionPane;

public class Lista16 {

	public static void main(String[] args) {
		
		int n = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("insira um numero: "));
		JOptionPane.showMessageDialog(null, n + " este numero � " + parOuImpar(n));
	}
	
	public static String parOuImpar(int n){
		if(n%2==0)
			return "par";
		else
			return "impar";
	}
}
