package torre;

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
import javax.swing.JTextField;

class Interface extends JFrame implements ActionListener{
   
   private JButton tiraA;
   private JButton poeA;
   
   private JButton tiraB;
   private JButton poeB;
   
   private JButton tiraC;
   private JButton poeC;
   
   private JButton confirmar;
   
   private JTextField texto;
   
   private JLabel etiqueta;
   
   
   private int cont;
   
   Pilha a = new Pilha(3);
   Pilha b = new Pilha(3);
   Pilha c = new Pilha(3);
   
   
   public Interface(){
	   
      super("Sistema Medico");
      
      URL url = this.getClass().getResource("minha_imagem.png");  
      Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
      this.setIconImage(iconeTitulo);
      
      tiraA     = new JButton("Retira Idoso");
      tiraB     = new JButton("Retira Jovem");
      poeB      = new JButton("Chama Jovem");
      poeA      = new JButton("Chama Idoso");
      tiraC     = new JButton("Retira Criança");
      poeC      = new JButton("Chama Criança");
      
      
      etiqueta  = new JLabel("senha chamada:");
    
      texto     = new JTextField(10);
      
      cont = 0;
      
      tiraA.addActionListener(this);
      tiraB.addActionListener(this);
      poeB.addActionListener(this);
      poeA.addActionListener(this);
      tiraC.addActionListener(this);
      poeC.addActionListener(this);
      confirmar.addActionListener(this);
      
      
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
  
      caixa.add(confirmar, BorderLayout.CENTER);
   
      
   
   
      setSize(340,190);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLocationRelativeTo(null);
      getContentPane().setBackground(Color.black);
      etiqueta.setForeground(Color.white);
            
      
      a.push(3);
      a.push(2);
      a.push(1);
        
      
}
   
  
   
	public static void main(String[] args) {
		
			
		    Interface inter = new Interface();
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
	

   
}

