/*
 * ALGED - Lista Ex - 2o Sem - Ex23
 *
 *	Listas Singularmente Encadeadas
 */
 
package fila_LDE;
public	interface	Lista_Ex23
{
	public	boolean	inserirAoFinal(int iI);		// Retorna sucesso ou fracasso de inserir um nó ao final da lista;
	public	int		removerDoFinal();				// Retorna elemento removido do final da lista;
	public	int		consultarNo();					// Retorna elemento consultado do próximo nó;
	public	boolean	ehVazia();						// Retorna flag informando se lista está ou não vazia;
}

