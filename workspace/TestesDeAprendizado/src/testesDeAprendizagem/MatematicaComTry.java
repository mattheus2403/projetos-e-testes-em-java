package testesDeAprendizagem;

import java.util.InputMismatchException; //algumas exce��es precisam ter a classe de tratamento importada
import java.util.Scanner;

public class MatematicaComTry {
	
	public static void main (String args[]) {
		
		//Declara��o das vari�veis locais 
		int a, b, resultado;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		try { // bloco que ser� tratado
			
			//leitura das vari�veis
			System.out.print("informe o 1� valor: ");
			a = teclado.nextInt();
			
			System.out.print("Informe o 2� valor: ");
			b = teclado.nextInt();
			
			//Calcula a divis�o e imprime:
			resultado = a / b;
			System.out.println("O resultado da divis�o �: " + resultado);
		} catch(ArithmeticException AE) { // exe��o de divis�o por 0
			System.out.println("Divis�o por zero n�o existe!");
		} catch (InputMismatchException IME) { //exce��o de tipo informado � diferente de inteiro
			System.out.println("O valor informado n�o � inteiro!");
		}
	}
}

// este programa est� tratando problemas onde um n�mero digitado pelo usu�rio est� 
//sendo divido por zero ou quando n�o o usu�rio n�o digita um numero inteiro
//em casos assim criamos esse tratamento de excess�es que d� uma resposta alternativa
// pra que uma tela de erro n�o seja exibida no lugar

