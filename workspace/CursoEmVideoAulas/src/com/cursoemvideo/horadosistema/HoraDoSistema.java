package com.cursoemvideo.horadosistema;

import java.util.Date;

public class HoraDoSistema {

	public static void main(String[] args) {
		
		//aqui pegamos o comando Date importado l� em cima em java.util.date
		//e atribuimos o nome "relogio a esse comando que exibe a data e hora atual
		Date relogio = new Date();
		//aqui criamos o texto que ser� imprimido na tela antecedendo a data e hora atual
		System.out.println("A hora do sistema � ");
		//aqui selecionamos o nosso Date que est� associado ao relogio e 
		//convertemos ele para texto com o comando ".toString()"
		System.out.println(relogio.toString());
	}

}
