package interfaceLearn;

public class Professor implements Operacoes {
	
	@Override
	public double calcularMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}
}

/*

Assim como classes abstratas, as interfaces não podem ser instânciadas, 
ou seja, apenas herdadas por outras classes. Contudo, para classes 
implementarem interfaces, não se utiliza a palavra extends, mas sim 
implements.


Note que houve obrigatoriedade na classe "Professor" para a implementação
do método de cálculo da média. O compilador do Java não permitiria que
a classe professor fosse compilada antes de todos os métodos serem 
sobrescritos (reimplementados).
*/