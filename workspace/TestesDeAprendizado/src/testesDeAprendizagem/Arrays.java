package testesDeAprendizagem;

public class Arrays {
	public static void main (String args[]) {
		//declara��o de arrays de tamanho 3
		String nomes[] = new String [3];
		
		//seta, manualmente, cada posi��o do array, de 0 a2 (tr�s posi��es)
		nomes[0] = "Josefino";
		nomes[1] = "Josefina";
		nomes[2] = "Marcelino";
		
		//E para acessar cada posi��o, podemos usar um la�o de 0 a 2 (0, 1, 2 - tr�s)
		for (int i = 0; i <= 2; i++) {
			System.out.print("Na posi��o " + i + " do array, temos: ");
			System.out.println(nomes[i]);
		}
	}
}
