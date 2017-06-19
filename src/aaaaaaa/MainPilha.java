package aaaaaaa;

import javax.swing.JOptionPane;
import	javax.swing.*;

public class MainPilha {

	
		public	static	ListaDE	lista = new	ListaDE();
		
		public	static	String	sIO,sTitle;
		public	static	String[]	sSN={"Sim","Não"};
		public	static	int		iSN;
		public	static	String[]	sOpcao={"Inserir Elemento","Consultar Elemento","Retirar Elemento","Sair"};
		public	static	int		iOpcao;

		public static void main(String Args[])
		{				
			//Tela inicial
			sTitle="pilha";
			sIO="Listas Duplamente Encadeadas";
			//JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

			//Tela de menu
			do
			{
				sIO="Selecione o botão da opção desejada:";
				iOpcao=JOptionPane.showOptionDialog(null,sIO,sTitle,1,JOptionPane.QUESTION_MESSAGE,null,sOpcao,null);
				switch(iOpcao)
				{
					case	0:	inserir_elemento();
								break;
					case	1:	
								break;
					case	2:	retirar_elemento();
								break;
					case	3:	sIO="Deseja realmente sair?";
								iSN=JOptionPane.showOptionDialog(null,sIO,sTitle,1,JOptionPane.QUESTION_MESSAGE,null,sSN,null);
								if(iSN==1)	iOpcao=-1;
								break;
				}
			}while(iOpcao!=3);
					
			//Termina execução
	      System.exit(0);
	   }

		public	static	void	inserir_elemento()
		{
			sIO="Digite o número a ser inserido na Lista:";
			if(lista.inserirAoFinal(Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE))))
					sIO="Inserção na Lista com sucesso!";
			else	sIO="Problemas na Inserção na Lista";
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
		}

		/*public	static	void	consultar_elemento()
		{
			int	iI;
			
			sIO="";
			if(lista.ehVazia())	sIO="Lista Vazia!";
			else
			{
				iI=lista.consultarNo();
				if(iI<0)	sIO+="Lista Encerrada!";
				else		sIO+=iI;
			}
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
		}*/
		
		public	static	void	retirar_elemento()
		{
			sIO="";
			if(lista.ehVazia())	sIO="Lista Vazia!";
			else	sIO+=lista.removerDoFinal();
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
		}

}

	


