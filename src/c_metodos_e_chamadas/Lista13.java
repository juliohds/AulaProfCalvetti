/*

Da linha de produção de uma metalúrgica serão pegos, aleatoriamente, no decorrer
de um dia, pelo controle de qualidade da empresa, 10 pregos sem cabeça para análise.
Para cada amostra de prego pego, serão medidos seu comprimento e diâmetro, ambos
em milímetros. Durante a medição, esses dados serão inseridos, um a um, em um
programa de computador desenvolvido especialmente para isso. Após a digitação dos 10
pares de valores (comprimento e diâmetro), o programa deverá fornecer:
a) Comprimento e Diâmetro Médios das amostras verificadas;
b) O número e o comprimento da amostra mais longa (comprimento maior);
c) O número e o diâmetro da amostra mais fina (diâmetro menor).  
  
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
		
		//b) O número e o comprimento da amostra mais longa (comprimento maior);
		//c) O número e o diâmetro da amostra mais fina (diâmetro menor). 
		
		

	}

}
