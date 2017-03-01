package e_metodos_recursividade;
import javax.swing.JOptionPane;

/*
Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
capaz de receber, via teclado, dois números inteiros e positivos, calculando o Máximo
Divisor Comum entre eles.
 */
public class Lista26 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite n1 maior que 0:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite n2 maior que 0:"));
		int cont;
		
			if(n1>=n2){
				cont  = n1-1;
			}else{
				cont = n2-1;
			}
				
		JOptionPane.showMessageDialog(null, "O Maximo divisor comum é " + MaxDivComum(n1,n2, cont));
		
	}
	
		
	public static int MaxDivComum(int n1, int n2, int cont){
		
		if(cont<=0){
			return 1;
		}
		
		if(n1%cont==0 && n2%cont==0){
			return cont;
		}
		return MaxDivComum(n1, n2, cont-=1);
		
	}

}
