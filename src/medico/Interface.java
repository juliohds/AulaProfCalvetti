package medico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Interface extends JFrame implements ActionListener{
   
   private JButton tiraA;
   private JButton poeA;
   private JButton tiraB;
   private JButton poeB;
   private JButton tiraC;
   private JButton poeC;
   private JButton confirmar;
   private JButton ajuda;
   private JTextField texto;
   private JTextField texto2;
   private JLabel etiqueta;
   private JLabel etiqueta2;
   
   private int cont;
   
   Pilha a = new Pilha(3);
   Pilha b = new Pilha(3);
   Pilha c = new Pilha(3);
   
   
   public Interface(){
	   
      super("Game - A Torre de Hanoi");
      
      URL url = this.getClass().getResource("minha_imagem.png");  
      Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
      this.setIconImage(iconeTitulo);
      
      tiraA     = new JButton("Retira da Pilha A");
      tiraB     = new JButton("Retira da Pilha B");
      poeB      = new JButton("Coloca na Pilha B");
      poeA      = new JButton("Coloca na Pilha A");
      tiraC     = new JButton("Retira da Pilha C");
      poeC      = new JButton("Coloca na Pilha C");
      confirmar = new JButton("FIM?");
      ajuda = new JButton("Ajuda");
      etiqueta  = new JLabel("Valor Retirado da Pilha:");
      etiqueta2 = new JLabel("Tentativas:");
      texto     = new JTextField(10);
      texto2    = new JTextField(10);
      cont = 0;
      
      tiraA.addActionListener(this);
      tiraB.addActionListener(this);
      poeB.addActionListener(this);
      poeA.addActionListener(this);
      tiraC.addActionListener(this);
      poeC.addActionListener(this);
      confirmar.addActionListener(this);
      ajuda.addActionListener(this);
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      caixa.add(etiqueta);
      caixa.add(texto, BorderLayout.CENTER);
      caixa.add(tiraA);
      caixa.add(poeA);
      caixa.add(tiraB);
      caixa.add(poeB);
      caixa.add(tiraC);
      caixa.add(poeC);
      caixa.add(etiqueta2);
      caixa.add(texto2, BorderLayout.CENTER);
      caixa.add(confirmar, BorderLayout.CENTER);
      caixa.add(ajuda, BorderLayout.EAST);
      
   
   
      setSize(340,190);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLocationRelativeTo(null);
      getContentPane().setBackground(Color.black);
      etiqueta.setForeground(Color.white);
      etiqueta2.setForeground(Color.white);
      
      
      a.push(3);
      a.push(2);
      a.push(1);
        
      
}
   
 
   public void actionPerformed(ActionEvent e){
	   	 if(e.getSource()==tiraA){
	         
	    tiraA();
	   	 
	    }
	      else if(e.getSource()==poeA){
	    	  
	    	  poeA();
	    		
	      }
	      else if(e.getSource()==tiraB){
	    	  
	    	  tiraB();	
	    	  
	      }
	      else if(e.getSource()==poeB){
	    	  
	    	  poeB();
		    	  
	     }
	      else if(e.getSource()==tiraC){
	    	  
	    	  tiraC();
	    		 
	      } 
	      else if(e.getSource()==poeC){
	    	  
	    	  poeC();
	    		
	      }
	      else if(e.getSource()==confirmar){
	    	  
	    	confirmar();
	    	  
	      }
	   	 
	      else if(e.getSource()==ajuda){
	    	  
	    	  ajuda();
	      }
   }
   			
   
   public void confirmar(){
	   if(b.size()==3){
		   
		   JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ VENCEU!");
		   
	   }
	   else{
		   
		   JOptionPane.showMessageDialog(null, "TENTE NOVAMENTE, VOCÊ NÃO ATINGIU O OBJETIVO!");
		   
	   }
	   	   
   }
   
   public void ajuda(){
	   
	   JOptionPane.showMessageDialog(null, "Instruções: O objetivo desse jogo é levar os numero de 1 a 3 da pilha A para a pilha B, "
	   		+ "\n de modo que ela fique com a seguinte ordenação: "
	   		+ "\n BASE: 3; MEIO 2; TOPO 1 ");
	   
   }
   
    public void poeA(){
    	
    	if(b.size() != 3)
    	{
    	String x = texto.getText();
    	
        if(a.size() == 0){
         texto.setText("");
	     a.push(Integer.parseInt(x));
	     System.out.println("O elemento do topo da pilha A agora é: "    + a.top());
	     System.out.println("O tamanho da pilha A agora é: " + a.size());   	
        }
		
        else if(Integer.parseInt(x) < a.top()){
        texto.setText("");
        a.push(Integer.parseInt(x));
        System.out.println("O elemento do topo da pilha A agora é: "    + a.top());
        System.out.println("O tamanho da pilha A agora é: " + a.size());
        }
        
        else{
        	 JOptionPane.showMessageDialog(null, "Este movimento não é permitido no jogo");
 }
   }
    	else{
    		System.out.println("Parabéns");
    	}
} 	
    public void tiraA(){
    	
    	if(b.size() != 3)
    	{
    	texto.setText("" + a.pop()); 
        System.out.println("O tamanho da pilha A agora é: " + a.size());
        cont++;
        texto2.setText("" + cont);
    	}
    	else{
    		System.out.println("Parabéns");
    	}
	}
    public void poeB(){
    	
    	if(b.size() != 3)
    	{
    	String x = texto.getText();
	  	
	  	if(b.size() == 0){
	    texto.setText("");
		b.push(Integer.parseInt(x));
		System.out.println("O elemento do topo da pilha B agora é: "    + b.top());
		System.out.println("O tamanho da pilha B agora é: " + b.size());   	
	    }
	  	
	  	else if(Integer.parseInt(x) < b.top()){
        texto.setText("");
        b.push(Integer.parseInt(x));
        System.out.println("O elemento do topo da pilha B agora é: "    + b.top());
        System.out.println("O tamanho da pilha B agora é: " + b.size());
        }
        else{
        	JOptionPane.showMessageDialog(null, "Este movimento não é permitido no jogo");
   }
  }
    	else{
    		System.out.println("Parabéns");
  }
}
    public void tiraB(){
    	 
    	if(b.size() != 3){
    	texto.setText("" + b.pop());
	       
         System.out.println("O tamanho da pilha B agora é: " + b.size());
         cont++;
         texto2.setText("" + cont);
    	
    	}
    	
         else{
        	 System.out.println("Parabéns");
         }
   
 }
    	
    public void poeC(){
      
      if(b.size() != 3){	
      String x = texto.getText();
   	  
   	  if(c.size() == 0){
		    texto.setText("");
			c.push(Integer.parseInt(x));
			System.out.println("O elemento do topo da pilha C agora é: "    + c.top());
			System.out.println("O tamanho da pilha C agora é: " + c.size());   	
		   }
   	  
   	  else if(Integer.parseInt(x) < c.top()){
	      texto.setText("");
	      c.push(Integer.parseInt(x));
	      System.out.println("O elemento do topo da pilha C agora é: "    + c.top());
	      System.out.println("O tamanho da pilha C agora é: " + c.size());
	      }
	       else{
	    	   JOptionPane.showMessageDialog(null, "Este movimento não é permitido no jogo");
	      }
      }
      else{
    	  System.out.println("Parabéns");
      }
	}
	public void tiraC(){
		
		if(b.size() != 3){
		 texto.setText("" + c.pop());
	      
	      System.out.println("O tamanho da pilha C agora é: " + c.size());
	      cont++;
	      texto2.setText("" + cont);
		}
		else{
			System.out.println("Parabéns");
		}
}

   
   
   
		public static void main(String[] args) {
		
			
		    Interface inter = new Interface();
	}
		
	

   
}

