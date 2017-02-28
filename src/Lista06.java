/*
  
 6o) Elaborar um programa, em linguagem Java, capaz de limpar (colocar -1 em todas as
suas posições) qualquer tipo de matriz, inteira e positiva e que seja declarada
globalmente. O programador deverá definir o tamanho da matriz (linhas e colunas),
antes de compilar o programa. 
  

 */
public class Lista06 {

	public static void main(String[] args) {
		
		
	int matriz[][] = new int[10][10];
	
	for(int i = 0; i>10; i++){
		
		for(int m =0; m>10; m++){
			
		matriz[i][m] = -1;	
			
		}
		
	}
	
	
	}

}
