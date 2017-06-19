package z_atividade01;

public class Pilha{

   public int iTam = 10;
   public int iPilha[] = new int[iTam];
   public int iPos = 0;
   
   
   public Pilha(int n){
      int vet[] = new int [n];
   }
   
   
   public int size(){
        return iPos;
   }   
   
   public int top(){
   
      return iPilha[iPos-1];
   }
   
   public int push(int iC){
      if(iPos >= iTam) return 0;
      return iPilha[iPos++] = iC;
   }
   
   public int pop(){
      if(iPos == 0) return 0;
      return iPilha[--iPos];
   }


}