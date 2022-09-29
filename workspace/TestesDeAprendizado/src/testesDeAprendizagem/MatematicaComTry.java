package testesDeAprendizagem;

import java.util.InputMismatchException; //algumas exceções precisam ter a classe de tratamento importada
import java.util.Scanner;

public class MatematicaComTry {
	
	public static void main (String args[]) {
		
		//Declaração das variáveis locais 
		int a, b, resultado;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		try { // bloco que será tratado
			
			//leitura das variáveis
			System.out.print("informe o 1º valor: ");
			a = teclado.nextInt();
			
			System.out.print("Informe o 2º valor: ");
			b = teclado.nextInt();
			
			//Calcula a divisão e imprime:
			resultado = a / b;
			System.out.println("O resultado da divisão é: " + resultado);
		} catch(ArithmeticException AE) { // exeção de divisão por 0
			System.out.println("Divisão por zero não existe!");
		} catch (InputMismatchException IME) { //exceção de tipo informado é diferente de inteiro
			System.out.println("O valor informado não é inteiro!");
		}
	}
}

// este programa está tratando problemas onde um número digitado pelo usuário está 
//sendo divido por zero ou quando não o usuário não digita um numero inteiro
//em casos assim criamos esse tratamento de excessões que dá uma resposta alternativa
// pra que uma tela de erro não seja exibida no lugar

