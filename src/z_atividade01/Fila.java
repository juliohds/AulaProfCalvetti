package z_atividade01;

public class Fila{

   public  int iTam = 10;
   public  int iFila[] = new int[iTam];
   public  int iSPos = 0;
   public  int iRPos = 0;
   public  boolean bQueueFull = false;

   public Fila(int n){
      int vet[] = new int[n];
   }
      
   public  boolean isOver(){
      if(iSPos == iRPos && bQueueFull) return true;
      return false;      
   }
   public  void enQueueC(int iC){
      iFila[iSPos++] = iC;
      if(iSPos >= iFila.length) iSPos=0;
      if(iSPos == iRPos) bQueueFull = true;
   
   }
   
   public int deQueueC(){
      int iIndice = iRPos++;
      
      if(iRPos >= iFila.length) iRPos = 0;
      
      bQueueFull = false;
      return iFila[iIndice];
   }
 }