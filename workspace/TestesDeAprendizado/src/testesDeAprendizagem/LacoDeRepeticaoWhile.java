package testesDeAprendizagem;

public class LacoDeRepeticaoWhile {
	public static void main (String args[]) {
		int i = 0;
		while(i <= 10) {
			if (i % 2 != 0) //verifica se o resto da divis�o por 2 � zero. Se n�o for ent�o o n�mero � impar
				System.out.println(i);
			i++; //Incrementa a vari�vel de controle
		}
	}
}
