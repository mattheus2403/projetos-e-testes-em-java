package arrayMaior;

import java.util.Scanner;

public class Principal {
	public static void main (String args[]) {
		// inser��o de vari�veis
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < 9; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = leitor.nextInt();
		}
		System.out.println(vetor[0]);
}
}