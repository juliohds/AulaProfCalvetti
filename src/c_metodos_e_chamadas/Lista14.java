/*
Utilizando programação por chamadas de métodos, elaborar um programa, em
linguagem Java, capaz de carregar, via teclado, os 10 elementos de um vetor do tipo
double. Após isto, apresentar ao operador um menu contendo 3 opções e aguardar a
digitação da opção por ele escolhida: Digitar ‘+’ para apresentar o próximo elemento do
vetor; Digitar ‘-‘ para apresentar o elemento anterior do vetor; Digitar ‘. ‘ para sair.
Dependendo da opção digitada, apresentar o respectivo elemento do vetor carregado.
Obs.: O 1º elemento a ser apontado é o de índice 0;
*/
package c_metodos_e_chamadas;

import javax.swing.JOptionPane;

public class Lista14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vetor[] = new double[4];
		
		for (int i = 0; i < vetor.length; i++) {
		
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Preencha o vetor double"));
			
		}
		int aux = 0;
		
		String opcao = ",";
		
		while(!opcao.equals(".")){
		
		opcao = JOptionPane.showInputDialog(vetor[aux] + "   [.] exit [+] proximo [-] anterior");
		
		if(opcao.equals("+")){
			aux = proximo(aux, vetor);
		}
		else if(opcao.equals("-")){
			aux = anterior(aux, vetor);
		}
		//else JOptionPane.showMessageDialog(null, "BIG error ALERT404");
	
		}
		System.exit(0);	
	}
	
	public static int proximo(int aux, double vetor[]){
		
		//int v = vetor.length;
		if(aux >= vetor.length - 1){
			return aux;
		}
		return aux+1;		
	}
	
	public static int anterior(int aux, double vetor[]){
		
		if(aux <= 0)
			return aux;
		else
			return aux-1;
		
	}

}
