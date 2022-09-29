package com.diarista.e.mensalista;

public class FuncionarioMensalista implements Operacoes {

	//Atributos:
	String nome;
	double salario;
	
	//construtor que recebe parâmetros de entrada e seta localmente
	
	public FuncionarioMensalista(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
		//sobresecrevendo obrigatoriamente o metodo de calculo
		
		@Override
		
		public double calcularSalarioLiquido() {
			return this.salario = this.salario * 27.5 / 100;
		}
	}

