package com.mathmatic.aritmetica;

public class Operations {
	
	public float multiplicacao (float a, float b) {
		return a * b;
	}
	
	public float divisao (float a, float b) {
		try {
			return a / b;
		} catch (Exception ex) {
			System.out.print("Erro" + ex.getMessage());
			return 0;
		}
	}
	
	public float soma (float a, float b) {
			return a + b;
	}
	
	public float subtracao (float a, float b) {
		return a - b;
	}
}
