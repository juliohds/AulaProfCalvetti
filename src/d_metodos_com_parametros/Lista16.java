/*

Elaborar um método, em linguagem Java, com passagem de parâmetros, dentro de
um programa teste, capaz de informar se o número digitado é par ou impar. A digitação
do valor e a apresentação do resultado deverá acontecer externamente a este método;
   
 */

package d_metodos_com_parametros;

import javax.swing.JOptionPane;

public class Lista16 {

	public static void main(String[] args) {
		
		int n = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("insira um numero: "));
		JOptionPane.showMessageDialog(null, n + " este numero é " + parOuImpar(n));
	}
	
	public static String parOuImpar(int n){
		if(n%2==0)
			return "par";
		else
			return "impar";
	}
}
