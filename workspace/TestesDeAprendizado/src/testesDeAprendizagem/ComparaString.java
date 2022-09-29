package testesDeAprendizagem;

import java.util.Scanner;

public class ComparaString {
	public static void main(String args[]) {
		//Declaracoes
		String nome1, nome2;
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		//Leitura
		System.out.print("Informe o 1º nome ");
		nome1 = tec.next();
		
		System.out.print("Informe o 2º nome ");
		nome2 = tec.next();
	

	//compara desconsiderando a caixa:

	if (nome1.equalsIgnoreCase(nome2)) {
		System.out.println("\nOs nomes são iguais");
	} else {
		System.out.println("\nOs nomes são diferentes");
	}
}

}