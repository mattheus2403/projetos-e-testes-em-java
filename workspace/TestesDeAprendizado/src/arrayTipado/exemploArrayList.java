package arrayTipado;

import java.util.ArrayList;

public class exemploArrayList {
	
	public static void main(String args[]) {
		
		//criando a lista do tipo pessoa
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		//Cria um objeto de "Pessoa" para podemos adiciona-lo a lista
		Pessoa pessoaLocal = new Pessoa();
		pessoaLocal.nome = "Yugi";
		pessoaLocal.idade = 16;
		pessoaLocal.email = "ritual.com";
		
		//adiciona a pessoa a lista:
		listaPessoas.add(pessoaLocal);
		
		//J� que a pessoa criada j� foi acrescentada � lista,
		//podemos reaproveitar a vari�vel local para acrescentar outra pessoa:
		pessoaLocal = new Pessoa(); // "reseta" a vari�vel para poder ser reutiizada
		pessoaLocal.nome = "Yuya";
		pessoaLocal.idade = 14;
		pessoaLocal.email = "pendulum.com";
		
		//acrescenta
		listaPessoas.add(pessoaLocal);
		
		//mais uma pessoa
		pessoaLocal = new Pessoa(); // "reseta" a vari�vel para poder ser reutiizada
		pessoaLocal.nome = "yusei";
		pessoaLocal.idade = 20;
		pessoaLocal.email = "synchro.com";
		
		//acrescenta
		listaPessoas.add(pessoaLocal);
		
		// s� mais uma pessoa
		pessoaLocal = new Pessoa(); // "reseta" a vari�vel para poder ser reutiizada
		pessoaLocal.nome = "yuga";
		pessoaLocal.idade = 12;
		pessoaLocal.email = "rush.com";
		listaPessoas.add(pessoaLocal);
		
		//Percorrendo a lista com um la�o e acessando seus itens
		for (int i = 0; i <= listaPessoas.size() - 1; i++) {
			System.out.println("Imprimindo dados da posi��o: " + i);
			System.out.println("\t- Nome: " + listaPessoas.get(i).nome);
			System.out.println("\t- Idade: " + listaPessoas.get(i).idade);
			System.out.println("\t- Email " + listaPessoas.get(i).email);
			System.out.println("-------------------------");
		}
		
		//Vamos procurar a pessoa que se chama "yuya" e remove-lo da lista
	    //Para isso, � preciso percorrer a lista, procurando o nome e,"
		//quando for encontrado, guardar o �ndice que a pessoa est�."
		int posicaoRemovida = -999; // vari�vel auxiliar para remo��o; um numero qualquer
		for (int j = 0; j < listaPessoas.size(); j++) {
			if (listaPessoas.get(j).nome.equals("Yuya")) { // se encontrar...
				posicaoRemovida = j; // Atribui a vari�vel o valor do �ndice
				break; // se j� encontrou, o loop pode parar
			}
		}
		//Verifica se a vari�vel auxiliar foi alterada. se sim, remove
		if (posicaoRemovida != -999) {
			listaPessoas.remove(posicaoRemovida); //Remove na posi��o encontrada
			System.out.println(" >> O Yuya estava na posi��o " + posicaoRemovida);
		}
		
		//Para ter certeza da remo��o, vamos percorrer e imprimir a lista novamente,
		//mas s� os nomes agora:
		System.out.println("Imprimindo os nomes da lista, ap�s a remo��o do Yuya: ");
		for (int k = 0; k < listaPessoas.size(); k++) {
			System.out.println("\t" + k + " - " + listaPessoas.get(k).nome);
		}
	}
}











