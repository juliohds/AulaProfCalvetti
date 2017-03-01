package metodos_recursividade;
import javax.swing.JOptionPane;

/*

Criar um método, em linguagem Java, que se utilize da recursividade, dentro de um
programa capaz de receber, via teclado, um número inteiro qualquer e informar se o
mesmo é ou não primo;

*/

public class Lista24 {

	public static void main(String[] args) {
	
		
	int c = 1;
	int s = 0;
	int n = (Integer.parseInt(JOptionPane.showInputDialog("Qual numero deseja verificar?")));
	JOptionPane.showMessageDialog(null,"ele é primo? "+ verificaSeEhPrimo(n, c, s));
				
		

	}
	
	public static boolean verificaSeEhPrimo(int n, int c, int s){
		
		if (n<=0) {
			return false;
		} 
		else if(n==2) {			
			return true;
		}
		//se for par retorna como nao primo
		else if(n%2==0){
			return false;
		}
		else{
			//se o contador for menor que numero faça isso
			if(c<=n){
					
					if(n%c==0){
						return verificaSeEhPrimo(n, c+=1, s+=1);
			        }else{
			        	return verificaSeEhPrimo(n, c+=1, s);
			        }
				
			}else{
				
				if(s==2){
					return true;
				}
			return false;
				
			}

		}
			
		}
	
	}
