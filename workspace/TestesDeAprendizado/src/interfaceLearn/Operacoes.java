package interfaceLearn;

public interface Operacoes {
	
	//Essa é a declaração de um método abstrato
	
	abstract double calcularMedia(double n1, double n2);

}


/*

Para declararmos uma interface, não deve-se usar a palavra reservada 
"class", ou seja, a palavra reservada "interface" (que é igual em inglês 
e português)vai no lugar da palavra "class". 

*/



//Diferentemente das classes abstratas, as interfaces podem conter apenas
//métodos abstratos (sem corpo, apenas a assinatura), ou seja, ela deve
//filhas. Segundo Teruel, essa é uma vantagem da orientação a objetos, 
//pois torna o código ainda mais reutilizável.



