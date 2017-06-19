package aaaaaaa;

//Listas Duplamente Encadeadas
public class ListaDE {
// Atributos da classe
private NoDuplaInt nsInicio;
private NoDuplaInt nsFim;
private NoDuplaInt nsPonteiro;
private int        iTamanho;
// Construtor
public ListaDE() {
   nsInicio   = null;
   nsFim      = null;
   nsPonteiro = null;
   iTamanho   = 0;
}
// M�todo inserirAoFinal
public boolean inserirAoFinal(int iI) {
   NoDuplaInt nsNovo = new NoDuplaInt(iI, null, null);
   if (iTamanho == 0) {
      nsInicio   = nsNovo;
      nsFim      = nsNovo;
      nsPonteiro = nsNovo;
   }
   else {
      nsFim.setNext     (nsNovo);
      nsNovo.setPrevious(nsFim);
      nsFim      = nsNovo;
      nsPonteiro = nsInicio;
   }
   iTamanho++;
   return true;
}
// M�todo RemoverDoFinal
public int removerDoFinal() {
   int iI = nsFim.getElement();
   if (iTamanho == 1) {
      nsInicio   = null;
      nsFim      = null;
      nsPonteiro = null;
      iTamanho--;
      return iI;
   }
   else {
      nsFim      = nsFim.getPrevious();
      nsFim.setNext(null);
      nsPonteiro = nsInicio;
      iTamanho--;
      return iI;
   }
}

//M�todo RemoverDoFinal
public int removerDoInicio() {
int iI = nsInicio.getElement();
if (iTamanho == 1) {
   nsInicio   = null;
   nsFim      = null;
   nsPonteiro = null;
   iTamanho--;
   return iI;
}
else {
   //nsFim      = nsFim.getPrevious();
   //NoDuplaInt noAux = new NoDuplaInt();
   //noAux=nsInicio;
   nsInicio = nsInicio.getNext();
   nsInicio.setPrevious(null);
   iTamanho--;
   return iI;
     
}
}


// M�todo ehVazia
public boolean ehVazia() {
   if (iTamanho == 0) return true;
   else               return false;
}
// M�todo ehPrimeiro
public boolean ehPrimeiro() {
   if (nsPonteiro.getPrevious() == null) return true;
   else                                  return false;
}
// M�todo ehUltimo
public boolean ehUltimo() {
   if (nsPonteiro.getNext() == null) return true;
   else                              return false;
}
// M�todo apresentarAtual
public int apresentarAtual() {
   return nsPonteiro.getElement();
}
// M�todo apresentarProximo
public int apresentarProximo() {
   nsPonteiro = nsPonteiro.getNext();
   return       nsPonteiro.getElement();
}
// M�todo apresentarAnterior
public int apresentarAnterior() {
   nsPonteiro = nsPonteiro.getPrevious();
   return       nsPonteiro.getElement();
}
} // Fim da classe