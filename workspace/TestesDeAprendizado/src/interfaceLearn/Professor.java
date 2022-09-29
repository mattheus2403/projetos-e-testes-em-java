package interfaceLearn;

public class Professor implements Operacoes {
	
	@Override
	public double calcularMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}
}

/*

Assim como classes abstratas, as interfaces n�o podem ser inst�nciadas, 
ou seja, apenas herdadas por outras classes. Contudo, para classes 
implementarem interfaces, n�o se utiliza a palavra extends, mas sim 
implements.


Note que houve obrigatoriedade na classe "Professor" para a implementa��o
do m�todo de c�lculo da m�dia. O compilador do Java n�o permitiria que
a classe professor fosse compilada antes de todos os m�todos serem 
sobrescritos (reimplementados).
*/