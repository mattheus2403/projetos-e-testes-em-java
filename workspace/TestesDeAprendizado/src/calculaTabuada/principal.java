package calculaTabuada;

import java.util.Scanner;

public class principal {
	public static void main(String args[]) {	
		// declara��o de scanner
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		// declara��o das variaveis locais
		int num;
		//leitura:
		System.out.print("Digite um numero para ver a tabuada: ");
		num = leitor.nextInt(); // l� o valor
		
		//Cria a instancia da classe tabuada utilizando o construtor
		
		Tabuada tab = new Tabuada(num);
		
		System.out.println("--------------------"); //Apenas para organiar a sa�da
		System.out.printf("%d x 1 = "+ tab.tabuada1(), num);
		System.out.printf("\n%d x 2 = "+ tab.tabuada2(), num);
		System.out.printf("\n%d x 3 = " + tab.tabuada3(), num);
		System.out.printf("\n%d x 4 = "+ tab.tabuada4(), num);
		System.out.printf("\n%d x 5 = "+ tab.tabuada5(), num);
		System.out.printf("\n%d x 6 = " + tab.tabuada6(), num);
		System.out.printf("\n%d x 7 = "+ tab.tabuada7(), num);
		System.out.printf("\n%d x 8 = " + tab.tabuada8(), num);
		System.out.printf("\n%d x 9 = "+ tab.tabuada9(), num);
		System.out.printf("\n%d x 10 = " + tab.tabuada10(), num);

	}
	
	
}
