package aaaaaaa;

//N� Duplamente Encadeado
public class NoDuplaInt {
private NoDuplaInt nsAnterior;
private NoDuplaInt nsProximo;
private int        iElemento;
// Construtor 1
public NoDuplaInt() {
   iElemento  = 0;
   nsAnterior = null;
   nsProximo  = null;
}
// Construtor 2
public NoDuplaInt(int iE, NoDuplaInt nsA, NoDuplaInt nsP) {
   iElemento  = iE;
   nsAnterior = nsA;
   nsProximo  = nsP;
}
// m�todo setPrevious
void setPrevious(NoDuplaInt nsA) {
   nsAnterior = nsA;
}
// m�todo setNext
void setNext(NoDuplaInt nsP) {
   nsProximo = nsP;
}
// m�todo getElement
int getElement() {
   return iElemento;
}
// m�todo getPrevious
NoDuplaInt getPrevious() {
   return nsAnterior;
}
// m�todo getNext
NoDuplaInt getNext() {
   return nsProximo;
}
} // Fim da classe
