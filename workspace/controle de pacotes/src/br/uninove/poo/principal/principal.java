package br.uninove.poo.principal;

//Importa a classe trigonometria. Se quisessemos importar todas as
//clases do pacote, ficaria assim:
//import br.uninove.poo.matematica.*

import br.uninove.poo.matematica.Trigonometria;

import java.util.Scanner;
//Importa uma classe do Java, para usar o Scanner do teclado

public class principal {

	public static void main(String[] args) {
		Trigonometria tri = new Trigonometria();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		float base, altura;
		
		System.out.print("informe o valor da base do tri�ngulo: ");
		base = sc.nextFloat();
		
		System.out.print("informe o valor da altura do tri�ngulo: ");
		altura = sc.nextFloat();
		
		System.out.print("\nA area do tri�ngulo �: ");
		System.out.println(tri.areaTriangulo(base, altura));
	}
	
}
