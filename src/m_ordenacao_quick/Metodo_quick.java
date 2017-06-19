package m_ordenacao_quick;

public class Metodo_quick {

	public static void main(String args[]){
		
}

public static void quick(int v[], int iBaixo, int iAlto)
{
	int iP, iB, iA;
	int iPivot;
	
	iB = iBaixo;
	iA = iAlto;
	iPivot = v[iBaixo];
	while(iBaixo < iAlto)
{
	while((v[iAlto] >= iPivot) && (iBaixo < iAlto))
		iAlto--;
	if(iBaixo != iAlto)
	{
		v[iBaixo] = v[iAlto];
		iBaixo++;
	}
	while((v[iBaixo] <= iPivot) && (iBaixo < iAlto))
		iBaixo++;
	if(iBaixo != iAlto)
	{
		v[iAlto] = v[iBaixo];
		iAlto--;			
	}
}
v[iBaixo] = iPivot;
iP = iBaixo;
iBaixo = iB;
iAlto = iA;
if(iBaixo < iP) quick(v, iBaixo, iP-1);
if(iAlto > iP)	quick(v, iP+1, iAlto);
}

}