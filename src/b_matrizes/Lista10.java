package b_matrizes;
import javax.swing.JOptionPane;

/*
 
10) Um teatro possui 3000 lugares divididos em 30 fileiras, cada uma com 100
cadeiras. Elaborar um programa em linguagem Java, capaz de gerenciar a venda dos
ingressos para este teatro. Cada lugar poderá estar Livre (0), Reservado (1) ou Vendido
(2). 
  
  
 */
public class Lista10 {

	public static void main(String[] args) {
		
		int matriz1[][] = new int[30][100];
		int parada = 1;
		int fileira, cadeira;
		
		while(parada!=0){
			
		fileira = Integer.parseInt(JOptionPane.showInputDialog("Digite a fileira (0 a 30) ou digite 0 para encerrar."));
			
			if(fileira==0){
				parada = 0;
				break;
			}
		
		cadeira = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da cadeira."));	
        
		if(matriz1[fileira][cadeira]==0){
		
			JOptionPane.showMessageDialog(null, "lugar livre ok para reservar");
			matriz1[fileira][cadeira] = 1;
			continue;
			
		}
		
		if(matriz1[fileira][cadeira]==1)
		{			
			JOptionPane.showMessageDialog(null, "lugar reservado ok para comprar");
			matriz1[fileira][cadeira] = 2;
			continue;
		}
		
		if(matriz1[fileira][cadeira]==2)
		{			
			JOptionPane.showMessageDialog(null, "lugar ja foi vendido");
			continue;
		}
		
		}
		
		//JOptionPane.showMessageDialog(null, matriz1[0][0]);
		
	}

}
