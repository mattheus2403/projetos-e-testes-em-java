package testesDeAprendizagem;

public class vetoresMultidimensionais {
	public static void main (String args[]) {
		
		String nomesCompletos[][] = new String [3][3];
		
		//Pessoa 1:
		nomesCompletos[0][0] = "Matheus"; //Primeira linha, primeira coluna
		nomesCompletos[0][1] = " Morais rodrigues"; //Primeira linha, segunda coluna
		
		//Pessoa 2:
		nomesCompletos[1][0] = "Anabel"; //segunda linha, primeira coluna
		nomesCompletos[1][1] = " Da silva"; //segunda linha, segunda coluna
		
		//Pessoa 3:
		nomesCompletos[2][0] = "Joaquim"; //terceira linha, primeira coluna
		nomesCompletos[2][1] = " Phoenix"; //terceira linha, segunda coluna
		
		//Impressão dos nomes com os sobrenomes:
		for(int i = 0; i <= 2; i++) {
			System.out.print("Nome armazenado na linha " + i + ": ");
			
			//Pega a posição i (linha), a coluna do nome (0) e concatena com a coluna do sobrenome (1)
			System.out.println(nomesCompletos[i][0] + nomesCompletos[i][1]);
		}
	}
}

// esses arrays e os arrays simples são classificados com arrays de tipos primitivos
