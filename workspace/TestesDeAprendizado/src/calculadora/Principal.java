package calculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		
		//Define o leitor do teclado
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		//Define a vari�veis locais
		int x, y;
		
		//Le:
		System.out.println("Informe o 1� valor: ");
		x = leitor.nextInt();
		
		System.out.println("Informe o 2� valor: ");
		y = leitor.nextInt();
		
		//Cria a instancia da classe matematica utilizando o construtor
		Matematica mat = new Matematica(x, y);
		
		// Imprime o resultado das opera��es atrav�s
		// de chamadas aos m�todos da classe Matem�tica
		
		System.out.println("--------------------"); //Apenas para organiar a sa�da
		System.out.println("O valor da soma �: " + mat.soma());
		System.out.println("O valor da subtra��o � " + mat.subtrai());
		System.out.println("O valor da multiplica��o � " + mat.multiplica());
		System.out.println("E o valor ou resto da divis�o � " + mat.divide());
		System.out.println("--------------------"); //Apenas para organiar a sa�da
	}
}
