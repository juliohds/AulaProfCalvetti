/*

Da linha de produ��o de uma metal�rgica ser�o pegos, aleatoriamente, no decorrer
de um dia, pelo controle de qualidade da empresa, 10 pregos sem cabe�a para an�lise.
Para cada amostra de prego pego, ser�o medidos seu comprimento e di�metro, ambos
em mil�metros. Durante a medi��o, esses dados ser�o inseridos, um a um, em um
programa de computador desenvolvido especialmente para isso. Ap�s a digita��o dos 10
pares de valores (comprimento e di�metro), o programa dever� fornecer:
a) Comprimento e Di�metro M�dios das amostras verificadas;
b) O n�mero e o comprimento da amostra mais longa (comprimento maior);
c) O n�mero e o di�metro da amostra mais fina (di�metro menor).  
  
*/

package c_metodos_e_chamadas;

import javax.swing.JOptionPane;

public class Lista13 {

	public static void main(String[] args) {
		
		int pregos;
		
		double comprimento[] = new double[4];
		double diametro[]    = new double[4];
		double maiorComprimento = 0, menorDiametro = 9999;
		
			for (pregos = 0; pregos < comprimento.length; pregos++) {
		
				comprimento[pregos] = Double.parseDouble(JOptionPane.showInputDialog("Comprimento do prego " + pregos));
				diametro[pregos] = Double.parseDouble(JOptionPane.showInputDialog("Diametro do prego " + pregos));
			
			}
		
		for (int j = 0; j < diametro.length; j++) {
			
			if(comprimento[j]>maiorComprimento)
				maiorComprimento = comprimento[j];
			
			if(diametro[j]<menorDiametro)
				menorDiametro = diametro[j];
			
			JOptionPane.showMessageDialog(null,j + " comprimento e diametro dos pregos: " +comprimento[j] + " - " + diametro[j]);
			JOptionPane.showMessageDialog(null, "por enquanto: maior comprimento"+maiorComprimento+" e o menor diametro "+ menorDiametro);
		}
		
		//b) O n�mero e o comprimento da amostra mais longa (comprimento maior);
		//c) O n�mero e o di�metro da amostra mais fina (di�metro menor). 
		
		

	}

}
