package k_ordena��o_por_sele��o;

import javax.swing.JOptionPane;

/*
66�) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleat�ria,
o conte�do de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
executar uma ordena��o decrescente do mesmo e apresentar o vetor ordenado em tela.
Utilizar um m�todo de ordena��o por sele��o.
*/

public class Ex66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double v[] =  {1.5, 2.2, 8.4, 6.8, 1.7, 7.7, 3.5, 6.2, 4.4, 2.2, 0.0};
	/*	
	double v[] = new double [4];
		
	for (int i = 0; i < v.length; i++) {
		JOptionPane.showInputDialog("preencha o indice " +i+" do vetor");
	}
	*/
		
	v = ordenaSelectDecrescente(v);
	
	for (int i = 0; i < v.length; i++) {
		System.out.println(v[i]);
	}
	}
	
	
	public static double[] ordenaSelectDecrescente(double v[]){
		int iA, iB, iC;
		double iT;
		
		for (iA = 0; iA < v.length-1; iA++) {
			
			iC=iA;
			iT=v[iA];
			
			for (iB=iA+1; iB < v.length; iB++) {
				
				if(v[iB] > iT){
					iC=iB;
					iT=v[iB];
				}
			}
			v[iC]=v[iA];
			v[iA]=iT;
		}
		return v;
	}

}
