package e_metodos_recursividade;

import javax.swing.JOptionPane;

/*
 * 
Elaborar um programa, em linguagem Java, que utilize apenas m�todos recursivos,
capaz de receber, via teclado, dois n�meros inteiros e positivos, calculando a
multiplica��o entre esses dois n�meros, por�m, n�o se utilizando a multiplica��o para
realizar o c�lculo e sim a opera��o de soma sucessiva.
Exemplo: 4 * 3 � igual a 3 + 3 + 3 + 3.

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
