import javax.swing.JOptionPane;

/*
 
11) Utilizando programação por chamadas de métodos, elaborar um programa, em
linguagem Java, capaz de receber os valores de a, b e c de uma equação de 2º grau
qualquer ( a x2 + b x + c = 0 ), calcular e apresentar o valor de D (delta) e informar se
suas raízes são imaginárias, reais iguais ou reais diferentes, apresentando seus valores
para os casos quando foram reais. Dica: Criar um método para calcular a raiz 1 e outro
método para calcular a raiz 2;
  
  
  
 */
public class Lista11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	double a,b,c,delta,x1,x2;
	
	
	a = Integer.parseInt(JOptionPane.showInputDialog("Escreva A"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Escreva B"));
	c = Integer.parseInt(JOptionPane.showInputDialog("Escreva C"));
	
	delta = ((b*b)-(4*a*c));
	JOptionPane.showMessageDialog(null, delta);
	
	x1 = 0;
	x2 = 0;
	
	if(delta >= 0){
		
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
	}
	
	
	JOptionPane.showMessageDialog(null, "X1 "+x1+" X2 "+x2);
	
	}

	
	
	
}
