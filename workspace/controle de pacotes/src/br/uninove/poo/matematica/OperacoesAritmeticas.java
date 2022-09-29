//instruções de pacote dessa classe

package br.uninove.poo.matematica;

public class OperacoesAritmeticas {

	public float multiplicacao(float a, float b) {
		return a * b;
	}
	
	public float soma(float a, float b) {
		return a + b;
	}
	
	public float subtracao(float a, float b) {
		return a - b;
	}
	
	public float divisao(float a, float b) {

		try {
			return a / b;
		} catch (Exception ex) {
			System.out.println("Erro" + ex.getMessage());
			return 0;
		}
	}
	
}
