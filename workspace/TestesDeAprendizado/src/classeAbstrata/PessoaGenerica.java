package classeAbstrata;
//Para implementarmos classes abstratas, começaremos a utilizar uma nova 
//palavra reservada: abstract.
abstract class PessoaGenerica {
	String nome, cpf, rg, dtNascimento;
	
	public abstract String getDados();
	
}

/*
Classes abstratas, em Java, são classes modelo, ou seja, elas podem ser 
herdadas, mas todas as funcionalidades devem ser, obrigatoriamente, 
implementadas pela classe que está herdando. Na programação, é impossível 
criarmos uma instância de uma classe abstrata.


Repare que a classe "PessoaGenerica" é abstrata e seu método de retornar dados
também. Isso quer dizer que, se ele precisará ser reimplementado pela classe 
que herda, ele não precisa de um corpo, ou seja, basta a declaração do método.
 Lembre-se que, mesmo a classe "PessoaGenerica" sendo abstrata, seus atributos
  continuam sendo passados para as classes filhas (herdeiras). 

*/