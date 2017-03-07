package e_metodos_recursividade;

import javax.swing.JOptionPane;

/*
 * 
Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
capaz de receber, via teclado, dois números inteiros e positivos, calculando a
multiplicação entre esses dois números, porém, não se utilizando a multiplicação para
realizar o cálculo e sim a operação de soma sucessiva.
Exemplo: 4 * 3 é igual a 3 + 3 + 3 + 3.

*/
public class Lista28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 =4, n2=3, resultado=0;
		
		JOptionPane.showMessageDialog(null, n1+"X"+n2+"="+ somaN2N1Vezes(n1, n2, resultado));
		
	}
	
	
	public static int somaN2N1Vezes(int n1, int n2, int resultado){
	
	/*int resultado = 0;
	
		for (int i = n1; i > 0 ; i--) {
		
			resultado = resultado + n2;
			
		}
		
		return resultado;
	*/
		
		if(n1 > 0){
			
			resultado = resultado +n2;
			return somaN2N1Vezes(n1-1, n2, resultado);
		}
		else{
			
			return resultado;
		}
		
	}

}
