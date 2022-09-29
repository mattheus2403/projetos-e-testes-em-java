package testesDeAprendizagem;

public class Arrays {
	public static void main (String args[]) {
		//declaração de arrays de tamanho 3
		String nomes[] = new String [3];
		
		//seta, manualmente, cada posição do array, de 0 a2 (três posições)
		nomes[0] = "Josefino";
		nomes[1] = "Josefina";
		nomes[2] = "Marcelino";
		
		//E para acessar cada posição, podemos usar um laço de 0 a 2 (0, 1, 2 - três)
		for (int i = 0; i <= 2; i++) {
			System.out.print("Na posição " + i + " do array, temos: ");
			System.out.println(nomes[i]);
		}
	}
}
