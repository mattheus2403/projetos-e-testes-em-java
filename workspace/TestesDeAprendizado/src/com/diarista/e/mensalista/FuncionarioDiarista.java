package com.diarista.e.mensalista;

public class FuncionarioDiarista implements Operacoes {

	//Atributos:
	String nome;
	double valorDaHora;
	int diasTrabalhados;
	
	public FuncionarioDiarista(String nome, double valorDaHora, 
			int diasTrabalhados) {
		this.nome = nome;
		this.valorDaHora = valorDaHora;
		this.diasTrabalhados = diasTrabalhados;
	}		
		//sobresecrevendo obrigatoriamente o metodo de calculo
		
		@Override
		
		public double calcularSalarioLiquido() {
			return (8 * valorDaHora) * diasTrabalhados;
		}
	}
	
	
	

