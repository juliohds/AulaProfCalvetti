/*
 * ALGED - Lista Ex - 2o Sem - Ex23
 *
 *	Listas Singularmente Encadeadas
 */
 
package z_atividade03;
public	interface	Lista_Ex23
{
	public	boolean	inserirAoFinal(int iI);		// Retorna sucesso ou fracasso de inserir um n� ao final da lista;
	public	int		removerDoFinal();				// Retorna elemento removido do final da lista;
	public	int		consultarNo();					// Retorna elemento consultado do pr�ximo n�;
	public	boolean	ehVazia();						// Retorna flag informando se lista est� ou n�o vazia;
}

