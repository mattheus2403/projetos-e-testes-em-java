package interfaceLearn;

public interface Operacoes {
	
	//Essa � a declara��o de um m�todo abstrato
	
	abstract double calcularMedia(double n1, double n2);

}


/*

Para declararmos uma interface, n�o deve-se usar a palavra reservada 
"class", ou seja, a palavra reservada "interface" (que � igual em ingl�s 
e portugu�s)vai no lugar da palavra "class". 

*/



//Diferentemente das classes abstratas, as interfaces podem conter apenas
//m�todos abstratos (sem corpo, apenas a assinatura), ou seja, ela deve
//filhas. Segundo Teruel, essa � uma vantagem da orienta��o a objetos, 
//pois torna o c�digo ainda mais reutiliz�vel.



