package testesDeAprendizagem;

public class LacoDeRepeticaoFor {
	public static void main (String[] args){
		for (int i = 0; i <= 10; i++) { // � o mesmo que: para i de 0 a at� 10 (inclusive) repita
			if (i % 2 == 0); //Verifica se a vari�vel que � incrementada � divis�vel por 2, ou seja, se o resto de sua divis�o por 2 � 0
				System.out.println(i);
		}
	}
}
