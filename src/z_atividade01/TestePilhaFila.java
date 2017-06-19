package z_atividade01;

import javax.swing.*;

      public class TestePilhaFila{
      
         public static void main(String args[]){
         
         int iTam, tent, m, n;
         String junt2, junt;
         
         junt2 = "";
         junt = "";
         
         tent = 0;
         n = 0;
         m = 0;
         
         Pilha p = new Pilha(10);
         Fila  f = new Fila(10);
         
         for(int i = 0; i < 10; i++){
            iTam = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    
            p.push(iTam);
            f.enQueueC(iTam);
                 
        }
        
          for(int i = 0; i < 10; i++){
        
            n = p.pop();
            junt += n + " ";
                      
         
        }
        
        System.out.println("Pilha: " + junt);
        
        for(int i = 0; i < 10; i++){
        
        
            m = f.deQueueC();  
            junt2 += m + " ";
         
        }
        
        System.out.println("Fila: " + junt2);
         
         
         System.exit(0); 
         }
         
       }