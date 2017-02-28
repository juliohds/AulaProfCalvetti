
public class Lista03 {

	public static void main(String args[]){
		
		int nro = 0; 
		char vetor[] = new char[26];
		
		for(char ch = 'A'; ch <= 'Z'; ch++){
		
			vetor[nro] = ch;
			nro++;
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
	}
	
	
}
