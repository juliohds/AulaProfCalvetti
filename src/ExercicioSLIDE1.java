import javax.swing.JOptionPane;

public class ExercicioSLIDE1 {

	public static void main(String[] args) {
		
		int c =0;
		int impar =0;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));
		JOptionPane.showMessageDialog(null, "numero n do main " + n);
		
		
		JOptionPane.showMessageDialog(null, " voltou do metodo "+ ImparOnze(n, c, impar));
		
	}
	
	
	public static int ImparOnze(int n, int c, int impar){
		
		
		if(n<=0){
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para iniciar a contagem ou se voce ja digitou digite um numero maior que 0: "));
			return ImparOnze(n, c, impar);
		}
		
		else if(n>1 && c==0){
			return ImparOnze(n-1, c, impar);
		}
		
		else if(n==1 && c==0){
							
			impar += 1;
			c+=1;
			
			n = Integer.parseInt(JOptionPane.showInputDialog("Contagem iniciada, quantia de impars "+c+" digite um numero: "));
			
			return ImparOnze(n, c, impar); 
		}
		
		else if(n>0 && c>0){
			
			if(n%2==0){
				
				n = Integer.parseInt(JOptionPane.showInputDialog("Contagem iniciadam ja digitou "+c+" impares digite um numero: "));
				return ImparOnze(n, c, impar); 
			}
			impar += 1;
			c+=1;
			
			if(c==4){
				return n;
			}
			return ImparOnze(n+1, c, impar);
		}
		
	return n+999999;
		
	}
	
	

}
