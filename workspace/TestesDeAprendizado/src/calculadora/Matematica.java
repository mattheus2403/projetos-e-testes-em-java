package calculadora;

public class Matematica {
	
	// atributos local
	int a, b;
	
	// construtor da classe, que recebe dois valores (X e Y e atribui
	//as variaveis locais (a e b);
	public Matematica (int x, int y) {
		a = x;
		b = y;
	}
	
	//Metodo de soma
	public int soma() {
		return a + b;
	}
	
	// Metodo de subtracao
	public int subtrai() {
		return a - b;
	}
	
	// Metodo de multiplicacao
	public int multiplica() {
		return a * b;
	}
	
	// Metodo de divisao
	
	public int divide() {
		return a / b;
	}
}

