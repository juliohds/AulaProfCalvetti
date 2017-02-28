import javax.swing.JOptionPane;

public class ExercicioSLIDE2 {

	public static void main(String args[]){
		
	 JOptionPane.showMessageDialog(null, "O 10º termo de um PG razao 2 é "+ calc10(1,0));
		
	}
	
	public static int calc10(int pg, int n){
	
		if(n==10){
			return pg;
		}
		else{
			pg = pg *2;
			n+=1;
			return calc10(pg, n);
		}

	}
	
}
