package f_busca_linear;

import javax.swing.JOptionPane;

public class Lista32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = {1,2,3,4};
		
		int k = Integer.parseInt(JOptionPane.showInputDialog("Qual numero deseja buscar?"));
		
		JOptionPane.showMessageDialog(null, "blrC: " + bl_recursivaCima(vetor, k, vetor.length-1));
		JOptionPane.showMessageDialog(null, "blrB: " + bl_recursivaBaixo(vetor, k, 0));
		//JOptionPane.showMessageDialog(null, );
		
	}
	
	//começando de cima
	public static int bl_iterativaCima(int v[], int k){
		
		int r = -1;
		for(int i=v.length-1; i>=0; i--){
			if(v[i]==k)
				r=i;
		}
		return r;
		
	}
	
	public static int bl_recursivaCima(int v[], int k, int i){
		
		if(v[i]==k)
			return i;
		if(i<=0)
			return -1;
		else
			return bl_recursivaCima(v, k, i-1);
		
	}
	
	public static int bl_iterativaBaixo(int v[], int k){
	
		int r = -1;
		for(int i=0; i<v.length; i++){
			if(v[i]==k)
				r=i;
		}
		return r;
		
	}
	
	public static int bl_recursivaBaixo(int v[], int k, int i){
		
		if(v[i]==k)
			return i;
		if(i>=v.length)
			return -1;
		else
			return bl_recursivaBaixo(v, k, i+1);
		
	}

}
