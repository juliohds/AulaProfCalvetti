/*
49o) Elaborar um programa, em linguagem Java, capaz de receber, via teclado, 10
elementos tipo int de um vetor e um outro elemento tipo int com o qual será feita uma
busca binária recursiva no vetor digitado, ao longo de todos os seus índices e no sentido
do menor para o maior índice. O programa deverá informar o valor do menor índice do
vetor que contém o elemento igual ao valor digitado. Ex.:
Índice: 0 1 2 3 4 5 6 7 8 9
Elementos Digitados: 7 3 4 5 8 4 7 8 9 4
Número Digitado: 4  Resposta: O número 4 está localizado no índice 2 do vetor. 
  
 */

package i_busca_binaria_recursiva;

import javax.swing.JOptionPane;

public class Lista49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//declarando o vetor de tamanho 10
	int vetor[] = new int[4];
	int numero;
	int aux = 0;
		
	numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero a ser buscado (iterativo)"));
	
	for (int i = 0; i < vetor.length; i++) {
		vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para preencher o vetor indice: " + i));
	}
	
	JOptionPane.showMessageDialog(null, "O numero "+numero+" esta localizado no indice " + IndiceNumeroI(vetor, numero) + " METODO ITERATIVO");
	
	for (int i = 0; i < vetor.length; i++) {
		
		for (int j = 0; j < vetor.length; j++) {
			
			if(vetor[i] < vetor[j]){
				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				
				
			}
		}
		
	}
	
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero a ser buscado (recursivo)"));
	
	//for (int i = 0; i < vetor.length; i++) {
	//	vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para preencher o vetor"));
	//}
	
	JOptionPane.showMessageDialog(null, "O numero "+numero+" esta localizado no indice " + IdiceNumeroR(vetor, 0, vetor.length-1, numero) + " METODO RECURSIVO");
		
	}
	
	public static int IndiceNumeroI(int iVet[], int iK){
		
		int iBaixo, iAlto, iMeio;
		
		iBaixo = 0;
		iAlto = iVet.length-1;
		while(iBaixo <= iAlto){
			
				iMeio=(iBaixo+iAlto)/2;
				
				if(iK < iVet[iMeio]) iAlto=iMeio-1;
				else if(iK > iVet[iMeio]) iBaixo=iMeio+1;
				else return iMeio;
		}
		
		return -1;
		
	}
	
	public static int IdiceNumeroR(int iV[], int iB, int iA, int iK){
		
		int iM = (iB + iA)/2;
		if(iB <= iA)
			if(iK < iV[iM]) return IdiceNumeroR(iV, iB, iM -1, iK);
			else if(iK > iV[iM]) return IdiceNumeroR(iV, iM +1, iA, iK);
			else return iM;
		return -1;
		
	}
	
	

}
