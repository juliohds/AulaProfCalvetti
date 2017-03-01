package a_vetores;

public class Lista02 {

	public static void main(String args[]){
		
		int vetor[] = new int[100];
		
		for (int i = 0; i < vetor.length; i++) {
			//se o contador do for, ser um numero par.
			if (i%2==0) {
				
				vetor[i]= 0;
				
			}else {
				
				vetor[i]= i;
				
			}
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("vetor "+ vetor[i]);
		}
		
	}
	
}
