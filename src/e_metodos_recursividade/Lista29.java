/*
 
Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
capaz de receber, via teclado, dois números inteiros e positivos, calculando a subtração
do segundo no primeiro, porém, não se utilizando da subtração para realizar o cálculo e
sim a operação de comparação sucessivamente.
Exemplo: 5 – 3 => 3+1 = 4; 3+2=5. Portanto 5 – 3 = 2.
 
*/
package e_metodos_recursividade;

import javax.swing.JOptionPane;

/*
 JulioHDS
*/
public class Lista29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1, n2, c;
			
		n1 = Integer.parseInt(JOptionPane.showInputDialog("informe o valor de n1"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("informe o valor de n2"));
		c = 0;
		
		JOptionPane.showMessageDialog(null, "n1 - n2 =" + subtracao(n1, n2, c));
	}

	
	public static int subtracao(int n1, int n2, int c){
		
		if(n1==n2)
			return 0;
		if(c+n2==n1)
			return c;
		else
			return subtracao(n1, n2, c+=1);
	}
}
