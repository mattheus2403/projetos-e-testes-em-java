package testesDeAprendizagem;

import java.util.Scanner;

public class media {
	
	public static void main(String[] args) {
		// declara��es
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		//leitura das notas
		System.out.println("Insira as notas: ");
		
		//Nota 1:
		System.out.println("\n\tNota 1: ");
		nota1 = teclado.nextFloat();
		
		//Nota 2:
		System.out.println("\n\tNota 2: ");
		nota2 = teclado.nextFloat();
		
		//Nota 3:
		System.out.println("\n\tNota 3: ");
		nota3 = teclado.nextFloat();
		
		// calcula usando um m�todo com retorno: 
		media = calculaMedia(nota1, nota2, nota3);
		
		System.out.println("\n\tA m�dia � " + media);
	}
	
	//O m�todo est�tico (static) permite ser invocado sem inst�ncia de classe
	
	public static float calculaMedia(float n1, float n2, float n3) {
		
		float media;
		
		//verifica as duas maiores e tira a m�dia:
		if (n1 < n2 && n1 < n3) {
			media = (n2 + n3) / 2;
		} else if (n2 < n3) {
			media = (n1 + n3) / 2;
		} else {
			media = (n1 + n2) / 2;
		}
		return media;
		
	}
}
