package AtividadeDeTempoJava;

import javax.swing.JOptionPane;

/*
 * 1) usuario digita tamanho do vetor int N
 * 2) instanciar vetor int com tamanho n
 * 3) Preencher o vetor de n até 1 (decrescente)
 * 4) Disparar cronometro mili e micro segundos
 * 5) Invoca metodo de ordenacao (insert-sort) => crescente
 * 6) Para cronometro ms e miliseg
 * 7) calcular o tempo decorrido para ordenação 
 * 
 JulioHDS
 */
public class Ex30_03 {

	public static void main(String args[]){
	
	int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do vetor"));
		
	int vetor[] = new int[n];
	
	//preencher o vetor de 0 ate n decrescente 
	for (int i = 0, j = n; i < vetor.length; i++, j--) {
				
		vetor[i] = j;

	}
	
	long tempoInicioM = System.currentTimeMillis();	
	long tempoInicioN = System.nanoTime();
		
	/* INSERCAO
	OrdenaçãoCresInser(vetor);	
	*/
	
	ordenaSelectCrescente(vetor);
	
	/*BOLHA
	int rasc = 0;	
	vetor = ordenacaoBolha(vetor, rasc);*/
	
	/*teste
	 * for (int i = 0; i < vetor.length; i++) {
	
		JOptionPane.showMessageDialog(null, "vetor ordenado: "+ vetor[i]);
		
	}*/
	
	
	System.out.println("Tempo Total Mili: "+(System.currentTimeMillis()-tempoInicioM) + " milisegundos");
	System.out.println("Tempo Total Nano: "+(System.nanoTime()-tempoInicioN) / 1000 + " microsegundos");
	
	
		
	}
	
	
	public static int[] OrdenaçãoCresInser(int v[]){
		int iA, iB;
		int iT;
		
		for (iA = 1; iA < v.length; iA++) {
			iT=v[iA];
			iB=iA-1;
			
			while (iB >= 0 && iT < v[iB]) {
				v[iB+1]=v[iB];
				iB--;		
			}
			
			v[iB+1]=iT;
		}
		
		return v;
	}
	
	public static int[] ordenaSelectCrescente(int v[]){
		int iA, iB, iC;
		int iT;
		
		for (iA = 0; iA < v.length-1; iA++) {
			
			iC=iA;
			iT=v[iA];
			
			for (iB=iA+1; iB < v.length; iB++) {
				
				if(v[iB] < iT){
					iC=iB;
					iT=v[iB];
				}
			}
			v[iC]=v[iA];
			v[iA]=iT;
		}
		return v;
	}
	
	public static int[] ordenacaoBolha(int v[], int rasc){
		
		for(int i = 0; i < v.length; i++){
			
			for(int j = 0; j < v.length-1; j++){
				
				if(v[j] > v[j+1]){
					
					rasc = v[j];
					v[j] = v[j+1];
					v[j+1] = rasc;
				}
			}
		}
		return v;
	}

}
