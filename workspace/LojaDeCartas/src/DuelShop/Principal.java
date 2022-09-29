package DuelShop;

import java.util.Scanner;
public class Principal {
	
	public static void main (String[] args) {
		
		// declarações
		String tipo;
		@SuppressWarnings("resource")
		Scanner card = new Scanner(System.in);
		
		// leitura
		System.out.printf("Bem vindo a Duel Shop, digite o tipo de carta que deseja comprar. \nex: magia, armadilha, monstro: ");
		tipo = card.next();
		
		// tomada de decisão
		
		switch (tipo) {
		case "magia":
			System.out.print("digite a carta de magia que deseja comprar: ");
			break;
			
		case "armadilha":
			System.out.print("digite a carta de armadilha que deseja comprar: ");
			break;
		
		case "monstro":
			System.out.print("digite a carta de monstro que deseja comprar: ");
			break;
			
		default:
			System.out.print("digite um tipo de carta válida");
		}
		
	}
}
