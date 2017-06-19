package aaaaaaa;

//Nó Duplamente Encadeado
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
// método setPrevious
void setPrevious(NoDuplaInt nsA) {
   nsAnterior = nsA;
}
// método setNext
void setNext(NoDuplaInt nsP) {
   nsProximo = nsP;
}
// método getElement
int getElement() {
   return iElemento;
}
// método getPrevious
NoDuplaInt getPrevious() {
   return nsAnterior;
}
// método getNext
NoDuplaInt getNext() {
   return nsProximo;
}
} // Fim da classe
