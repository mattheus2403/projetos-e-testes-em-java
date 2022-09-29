package testesDeAprendizagem;

public class LacoDeRepeticaoFor {
	public static void main (String[] args){
		for (int i = 0; i <= 10; i++) { // é o mesmo que: para i de 0 a até 10 (inclusive) repita
			if (i % 2 == 0); //Verifica se a variável que é incrementada é divisível por 2, ou seja, se o resto de sua divisão por 2 é 0
				System.out.println(i);
		}
	}
}
