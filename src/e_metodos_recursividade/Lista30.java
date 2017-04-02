/*

Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
capaz de receber, via teclado, um número inteiro, positivo, que represente o termo da
série abaixo. Calcular o valor da série, ou seja, a soma de todos os valores calculados,
do 1º termo até o termo digitado.

S = (1/20) + (1/21) + (1/22) + (1/23) + (1/24) + ... + (1/2N-1) + (1/2N)
Exemplo: Digitado o termo: 4 => S = 1 + 1/2 + 1/4 + 1/8 => S = 1.875

*/
package e_metodos_recursividade;

import javax.swing.JOptionPane;

/*
 JulioHDS
*/
public class Lista30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para calcular a soma personalizada"));
		int aux = 20;
		double soma = 1;
		
		JOptionPane.showMessageDialog(null, "Resultado é " + somaPersonalizada(n, aux, soma));
		
	}
	
	public static double somaPersonalizada(int n, int aux, double soma){
		
		if(aux-20 == n)
			return soma = soma /aux;
			
		else
			return somaPersonalizada(n, aux+1, soma);
		
	}

}
