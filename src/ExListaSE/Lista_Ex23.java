package ExListaSE;
/*
 * ALGED - Lista Ex - 2o Sem - Ex23
 *
 *	Listas Singularmente Encadeadas
 */
 
public	interface	Lista_Ex23
{
	public	boolean	inserirAoFinal(int iI);		// Retorna sucesso ou fracasso de inserir um nó ao final da lista;
	public	int		removerDoInicio();			// Retorna elemento removido do inicio da lista;
	public	int		consultarNo();				// Retorna elemento consultado do próximo nó;
	public	boolean	ehVazia();					// Retorna flag informando se lista está ou não vazia;
}

