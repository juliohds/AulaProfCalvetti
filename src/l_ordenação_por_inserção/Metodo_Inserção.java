package l_ordenação_por_inserção;

public class Metodo_Inserção {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long tempoInicioM = System.currentTimeMillis();	
	long tempoInicioN = System.nanoTime();
	
	int v[] = {9,2,4,5,8,7,5,4,88};
	
	for (int i = 0; i < v.length; i++) {
		
		OrdenaçãoCres(v);
		System.out.println("[" +i +"] "+ v[i] );
	
	}
	
	System.out.println("Tempo Total Mili: "+(System.currentTimeMillis()-tempoInicioM) + " milisegundos");
	System.out.println("Tempo Total Nano: "+(System.currentTimeMillis()-tempoInicioM) + " milisegundos");
	
	}

public static void OrdenaçãoCres(int v[]){
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
}


public static void OrdenaçãoDecre(int v[]){
	int iA, iB;
	int iT;
	
	for (iA = 1; iA < v.length; iA++) {
		iT=v[iA];
		iB=iA-1;
		
		while (iB >= 0 && iT > v[iB]) {
			v[iB+1]=v[iB];
			iB--;		
		}
		
		v[iB+1]=iT;
	}
}

public static void OrdenaçãoDecreInverso(int v[]){
	int iA, iB;
	int iT;
	
	//iA é igual ao ultimo indice -1, ate que iA seja menor que zero, subtraia 1
	for (iA = v.length-2; iA >= 0; iA--) {
	
		iT=v[iA]; //valor do ultimo indice
		iB=iA+1; // numero do penultimo indice
		
		while (iB >= 0 && iT > v[iB]) { // enquanto o ultimo indice foir maior que 0, e o valor do ultimo foi maior que o valor do 
										// penultimo			
			//fala que o penultimo é igual ao ultimo valor;
			v[iB]=v[iA];
			//diminui um numero do indice que esta sendo usado
			iB--;		
		}
		
		//o valor com um indice antes do penultimo  é igual ao valor do ultimo indice
		v[iB+2] = iT;
	}
}

}