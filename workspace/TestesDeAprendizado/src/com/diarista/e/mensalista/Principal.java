package com.diarista.e.mensalista;

import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		//Vari?veis auxiliares:
		String nomeAux;
		double salarioAux;
		int diasAux;
		
		//Le os dados para um funcionario mensalista:
		System.out.print("Qual o nome do funcion?rio mensalista? ");
		nomeAux = teclado.next();
		
		System.out.print("Qual o valor do salario bruto do funcionario mensalista? ");
		salarioAux = teclado.nextDouble();
		
		//Constr?i um funcion?rio mensalista na mem?ria (inst?ncia)
		FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux, salarioAux);
		
		//Le os dados de um funcion?rio diarista:
		System.out.print("Qual o nome do funcion?rio mensalista? ");
		nomeAux = teclado.next();
		
		System.out.print("Qual o valor da hora deste funcionario diarista? ");
		salarioAux = teclado.nextDouble();
		
		System.out.print("Quantos dias trabalhou? ");
		diasAux = teclado.nextInt();
		
		//cria inst?ncia de um funcion?rio diarista na mem?ria, j? com os dados: 
		FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
		
		//agora vamos implementar os dados de cada um e o sal?rio bruto (calculado):
		System.out.println("Dados e sal?rio do funcion?rio mensalista: ");
		System.out.println("\tNome: " + fM.nome);
		System.out.println("\tSal?rio Bruto: " + fM.calcularSalarioLiquido());
		
		System.out.println("Dados e sal?rio do funcion?rio diarista: ");
		System.out.println("\tNome: " + fD.nome);
		System.out.println("\tSal?rio Bruto: " + fD.calcularSalarioLiquido());
		
		
	}
}
