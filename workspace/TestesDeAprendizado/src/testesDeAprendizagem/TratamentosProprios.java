package testesDeAprendizagem;

import java.util.Scanner;

public class TratamentosProprios {
	
	public static void main(String args[]) {
		
		float x, y, resultado;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculadora de números positivos");
		
		System.out.print("\t Valor 1: ");
		x = teclado.nextFloat();
		
		System.out.print("\t Valor 2: ");
		y = teclado.nextFloat();
		
		try {
			if (y > x) { // se o valor a ser subtraído for menor, sobre a excessão
				throw new IllegalArgumentException("Y não pode ser subtraído de X, pois é maior que X");
			} else {
				resultado = x - y;
				System.out.println("Resultado " + resultado);
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage()); // imprime o erro
		}
		
	}
}

// nessa programa em questão fazemos nosso próprio tratamento de excessão informando 
// qual circunstância o erro pode acontecer, sem recorrer a tratamentos de excessão
// pré existentes, como vimos no exemo "matematica com try" aqui além de criarmos nosso
// proprio tratamento de excessão, usamos o comando throw.