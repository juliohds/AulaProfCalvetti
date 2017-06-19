/*
 * ALGED - Lista Ex - 2o Sem - Ex23
 *
 *	Listas Singularmente Encadeadas
 */

package fila_LDE;
import javax.swing.JOptionPane;

public class ListaSE_Ex23 implements Lista_Ex23
{
	private	NoSimplesInt	nsInicio;
	private	NoSimplesInt 	nsFim;
	private	NoSimplesInt	nsProximo;
	private	int				iTamanho;
	
	public	ListaSE_Ex23()
	{
		nsInicio=null;
		nsFim=null;
		nsProximo=null;
		iTamanho=0;
	}
	
	public	boolean	inserirAoFinal(int iI)
	{
		NoSimplesInt	nsNovo = new NoSimplesInt(iI, null);
		if(iTamanho==0)
		{
			nsInicio=nsNovo;
			nsFim=nsNovo;
			nsProximo=nsNovo;
		}
		else
		{
			nsFim.setNext(nsNovo);
			nsFim=nsNovo;
			nsProximo=nsInicio;
		}
		iTamanho++;
		return	true;
	}
	
	public	int	removerDoFinal() // remove do inicio
	{
		int	iI;
		
		if(ehVazia())	return	-1;
		iI = nsInicio.getElement();
		if(iTamanho==1)
		{
			nsInicio=null;
			nsFim=null;
			nsProximo=null;
		}
		else
		{
			NoSimplesInt	nsAux = new	NoSimplesInt();
			nsAux=nsInicio;
			
			nsInicio = nsInicio.getNext();		    
			nsAux.setNext(null);
			
			
		}
		iTamanho--;
		return	iI;
	}
	
	public	int	removerDoFinal2()//do final
	{
		int	iI;
		
		if(ehVazia())	return	-1;
		iI = nsFim.getElement();
		if(iTamanho==1)
		{
			nsInicio=null;
			nsFim=null;
			nsProximo=null;
		}
		else
		{
			NoSimplesInt	nsAux = new	NoSimplesInt();
			nsAux=nsInicio;
			while(nsAux.getNext()!= nsFim)	nsAux=nsAux.getNext();
			nsFim=nsAux;
			nsAux.setNext(null);
			nsProximo=nsInicio;
		}
		iTamanho--;
		return	iI;
	}
	
	public	int	consultarNo()
	{
		int	iI;
		
		if(nsProximo==null)	return -1;
		iI=nsProximo.getElement();
		nsProximo=nsProximo.getNext();
		return	iI;	
	}
		
	public	boolean	ehVazia()
	{
		if(iTamanho==0)	return	true;
		else	return	false;
	}
}
