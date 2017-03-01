/**

Rescrever o exercício no. 11 desta lista, utilizando métodos com passagem de
parâmetros;
  
 */
package d_metodos_com_parametros;

import javax.swing.JOptionPane;

public class Lista17 {

	public static void main(String[] args) {
			
		double a,b,c;
			
		a = Integer.parseInt(JOptionPane.showInputDialog("Escreva A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Escreva B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Escreva C"));
			
		double delta = valorDelta(a,b,c);
		
		JOptionPane.showMessageDialog(null, "delta " +delta);
								
		JOptionPane.showMessageDialog(null, valorX(delta, a, b));
			
		}
	
	
	public static double valorDelta(double a, double b, double c){
		
		double delta = ((b*b)-(4*a*c));
		return delta;
		
	}
	
	public static String valorX (double delta, double a, double b){
		
		double x1 = 0;
		double x2 = 0;
		
		if(delta >= 0){
			
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
		
			return "Valor de x1 "+x1+" x2: "+x2;
		}
		
		else{
			return "Valor de delta inválido";
		}
		
	}	
	
}


