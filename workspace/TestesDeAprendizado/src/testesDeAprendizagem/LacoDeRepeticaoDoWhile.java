package testesDeAprendizagem;

public class LacoDeRepeticaoDoWhile {
	public static void main (String args[]) {
		int i = 10;
		do {
			System.out.println(i); // Imprime a pr�pria vari�vel de controle
			i--; //decrementa a vari�vel de controle
		}while (i != 0); //condi��o de parada
	}
}
