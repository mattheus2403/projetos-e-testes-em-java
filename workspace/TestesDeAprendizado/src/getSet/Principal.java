package getSet;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1, numero2;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.print("Informe o 1� valor: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Informe o 2� valor: ");
		numero2 = sc.nextFloat();
		
		//seta na inst�ncia da calculadora (calc) os valores a e b
		calc.setA(numero1);
		calc.setB(numero2);
		
		System.out.println("As quatro opera��es aplicadas aos valores " + calc.getA() + " e " + calc.getB() + " s�o");
		System.out.println("\tSoma: " + calc.soma());
		System.out.println("\tSubtracao: " + calc.subtrai());
		System.out.println("\tMultiplicacao: " + calc.multiplica());
		System.out.println("\tDivide: " + calc.divide());
	}
}
