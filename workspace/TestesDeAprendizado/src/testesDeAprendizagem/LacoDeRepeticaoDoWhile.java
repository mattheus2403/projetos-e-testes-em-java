package testesDeAprendizagem;

public class LacoDeRepeticaoDoWhile {
	public static void main (String args[]) {
		int i = 10;
		do {
			System.out.println(i); // Imprime a própria variável de controle
			i--; //decrementa a variável de controle
		}while (i != 0); //condição de parada
	}
}
