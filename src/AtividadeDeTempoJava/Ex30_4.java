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
public class Ex30_4 {

	public static void main(String args[]) {

		// DIGITE O TAMANHO DO VETOR
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do vetor"));

		int vetor[] = new int[n];

		// preencher o vetor de 0 ate n CRESCENTE
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = i;

		}

		long tempoInicioN = System.nanoTime();

		ordenaSelectDecrescente(vetor);
		// mostra a ordenacao decrescente do metodo select
		System.out.println("Metodo Seleção | TAMANHO " + n + "| Tempo Total Nano: "
				+ (System.nanoTime() - tempoInicioN) / 1000 + " microsegundos");

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = i;
			// System.out.println(vetor[i]);
		}

		long tempoInicioN2 = System.nanoTime();

		OrdenaçãoDecreInsert(vetor);
		// mostra a ordenacao decrescente do metodo insert
		System.out.println("Metodo Insercao | TAMANHO " + n + "| Tempo Total Nano: "
				+ (System.nanoTime() - tempoInicioN2) / 1000 + " microsegundos");

		// ordena crescente novamente
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = i;
			// System.out.println(vetor[i]);
		}

		long tempoInicioN3 = System.nanoTime();

		int rasc = 0;
		ordenacaoBolhaDecres(vetor, rasc);
		// mostra a ordenacao decrescente do metodo insert
		System.out.println("Metodo Bolha | TAMANHO " + n + "| Tempo Total Nano: "
				+ (System.nanoTime() - tempoInicioN3) / 1000 + " microsegundos");

		// ordena crescente novamente
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = i;

		}

		long tempoInicioN4 = System.nanoTime();

		int iBaixo = 0;
		int iAlto = vetor.length-1;
		
		quickDecre(vetor, iBaixo, iAlto);
		// mostra a ordenacao decrescente do metodo insert
		System.out.println("Metodo Quick | TAMANHO " + n + "| Tempo Total Nano: "
				+ (System.nanoTime() - tempoInicioN4) / 1000 + " microsegundos");

		/*
		  for (int i = 0; i < vetor.length; i++) {
		  
		  System.out.println(vetor[i]);
		  
		  }*/
		 

	}

	public static void quickDecre(int v[], int iBaixo, int iAlto) {
		int iP, iB, iA;
		int iPivot;

		iB = iBaixo;
		iA = iAlto;
		iPivot = v[iBaixo];
		while (iBaixo < iAlto) {
			while ((v[iAlto] <= iPivot) && (iBaixo < iAlto))
				iAlto--;
			if (iBaixo != iAlto) {
				v[iBaixo] = v[iAlto];
				iBaixo++;
			}
			while ((v[iBaixo] >= iPivot) && (iBaixo < iAlto))
				iBaixo++;
			if (iBaixo != iAlto) {
				v[iAlto] = v[iBaixo];
				iAlto--;
			}
		}
		v[iBaixo] = iPivot;
		iP = iBaixo;
		iBaixo = iB;
		iAlto = iA;
		if (iBaixo < iP)
			quickDecre(v, iBaixo, iP - 1);
		if (iAlto > iP)
			quickDecre(v, iP + 1, iAlto);
	}

	public static int[] ordenacaoBolhaDecres(int v[], int rasc) {

		for (int i = 0; i < v.length; i++) {

			for (int j = 0; j < v.length - 1; j++) {

				if (v[j] < v[j + 1]) {

					rasc = v[j];
					v[j] = v[j + 1];
					v[j + 1] = rasc;
				}
			}
		}
		return v;
	}

	public static void OrdenaçãoDecreInsert(int v[]) {
		int iA, iB;
		int iT;
System.out.println();
		for (iA = 1; iA < v.length; iA++) {
			iT = v[iA];
			iB = iA - 1;

			while (iB >= 0 && iT > v[iB]) {
				v[iB + 1] = v[iB];
				iB--;
			}

			v[iB + 1] = iT;
		}
	}

	public static int[] ordenaSelectDecrescente(int v[]) {
		int iA, iB, iC;
		int iT;

		for (iA = 0; iA < v.length - 1; iA++) {

			iC = iA;
			iT = v[iA];

			for (iB = iA + 1; iB < v.length; iB++) {

				if (v[iB] > iT) {
					iC = iB;
					iT = v[iB];
				}
			}
			v[iC] = v[iA];
			v[iA] = iT;
		}
		return v;
	}

}
