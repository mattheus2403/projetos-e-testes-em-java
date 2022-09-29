package com.cursoemvideo.horadosistema;

import java.util.Date;

public class HoraDoSistema {

	public static void main(String[] args) {
		
		//aqui pegamos o comando Date importado lá em cima em java.util.date
		//e atribuimos o nome "relogio a esse comando que exibe a data e hora atual
		Date relogio = new Date();
		//aqui criamos o texto que será imprimido na tela antecedendo a data e hora atual
		System.out.println("A hora do sistema é ");
		//aqui selecionamos o nosso Date que está associado ao relogio e 
		//convertemos ele para texto com o comando ".toString()"
		System.out.println(relogio.toString());
	}

}
