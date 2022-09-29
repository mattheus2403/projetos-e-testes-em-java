package calculadora2;
// importa a classe scanner para ser usada aqui
import java.util.Scanner; 

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		// declaracao do scanner:
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		//declaracao das variaveis que serao utilizadas
		float peso, altura, imc;
		
		//leitura do teclado:
		//informacao de instrucoes para o usuario:
		System.out.print("Informe o PESO: ");
		
		//le e armazena o valor do peso:
        peso = leitor.nextFloat(); //Le um valor de ponto flutuante
		
		//le e armazena o valor da altura:
		System.out.print("Informe a ALTURA: ");
		altura = leitor.nextFloat(); // le um valor de ponto flutuante
		
		//calcula
		imc = peso / (altura * altura);
		
		//imprime o resultado
		//note que pode-se contatenar o resultado com a impressao de texto
		System.out.println("\n\tO IMC desta pessoa é " + imc +"\n\n");
	}
}
