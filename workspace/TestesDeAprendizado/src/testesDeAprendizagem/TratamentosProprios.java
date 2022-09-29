package testesDeAprendizagem;

import java.util.Scanner;

public class TratamentosProprios {
	
	public static void main(String args[]) {
		
		float x, y, resultado;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculadora de n�meros positivos");
		
		System.out.print("\t Valor 1: ");
		x = teclado.nextFloat();
		
		System.out.print("\t Valor 2: ");
		y = teclado.nextFloat();
		
		try {
			if (y > x) { // se o valor a ser subtra�do for menor, sobre a excess�o
				throw new IllegalArgumentException("Y n�o pode ser subtra�do de X, pois � maior que X");
			} else {
				resultado = x - y;
				System.out.println("Resultado " + resultado);
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage()); // imprime o erro
		}
		
	}
}

// nessa programa em quest�o fazemos nosso pr�prio tratamento de excess�o informando 
// qual circunst�ncia o erro pode acontecer, sem recorrer a tratamentos de excess�o
// pr� existentes, como vimos no exemo "matematica com try" aqui al�m de criarmos nosso
// proprio tratamento de excess�o, usamos o comando throw.