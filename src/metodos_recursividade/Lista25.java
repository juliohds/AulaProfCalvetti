package metodos_recursividade;
import javax.swing.JOptionPane;

/*

Elaborar um programa, em linguagem Java, que utilize apenas m�todos recursivos,
capaz de receber, via teclado, 10 elementos tipo float, formando um vetor, e um outro
elemento tipo float, o qual dever� ser comparado � cada elemento do vetor. O programa
dever� informar o valor do primeiro �ndice do vetor, a partir do 0, que cont�m um
elemento igual ao valor digitado. Ex.:
�ndice: 0 1 2 3 4 5 6 7 8 9
Elementos Digitados: 1 2 3 4 5 6 7 8 9 10
N�mero Digitado: 4  Resposta: O n�mero 4 est� localizado no �ndice 3 do vetor.

*/

public class Lista25 {

	p8ublic static void main(String[] args) {
		// TODO 
		//O retorno do vetor tipo float vem todo esquecito
		//Pedir ajuda para o professor
	
		float vetor[] = new float[1];
		float vetor2[] = new float[1];
		int contadorVetor = 0;
		
		
		vetor2 =  preencheVetor(vetor, contadorVetor);
		
		JOptionPane.showMessageDialog(null, "vetor preenchido"+ vetor2);	

	}
	
	
	public static float[] preencheVetor(float vetor[], int contadorVetor){
		
		if(contadorVetor>=vetor.length){
			return vetor;
		}
				
		vetor[contadorVetor] = Float.parseFloat(JOptionPane.showInputDialog("insira um float no vetor:"));		
		return preencheVetor(vetor, contadorVetor+=1);
	
	}

}
