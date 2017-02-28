import javax.swing.JOptionPane;

/*

Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
capaz de receber, via teclado, dois números inteiros e positivos, calculando o primeiro
elevado ao segundo.

*/
public class Lista27 {

	public static void main(String[] args) {
		
	int n = Integer.parseInt(JOptionPane.showInputDialog("digite n1"));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite n2"));
	int cont = 0;
	int result = 1;
	
	JOptionPane.showMessageDialog(null, n+" elevado a "+n2+" igual a "+ calculaElevado(n,n2, cont, result));

	}
	
	public static int calculaElevado(int n, int n2, int cont, int result){
		if(n2==0)
			return result;
		
		if(n<0)
			return 99999999;
		
		if(cont==n2){
			//result *= n;
			return result;
		}
		
		if(cont<n2){
			result *= n;
			return calculaElevado(n, n2, cont+=1, result);
		}else
			return 9999;
	}

}
