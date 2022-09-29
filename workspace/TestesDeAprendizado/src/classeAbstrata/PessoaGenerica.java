package classeAbstrata;
//Para implementarmos classes abstratas, come�aremos a utilizar uma nova 
//palavra reservada: abstract.
abstract class PessoaGenerica {
	String nome, cpf, rg, dtNascimento;
	
	public abstract String getDados();
	
}

/*
Classes abstratas, em Java, s�o classes modelo, ou seja, elas podem ser 
herdadas, mas todas as funcionalidades devem ser, obrigatoriamente, 
implementadas pela classe que est� herdando. Na programa��o, � imposs�vel 
criarmos uma inst�ncia de uma classe abstrata.


Repare que a classe "PessoaGenerica" � abstrata e seu m�todo de retornar dados
tamb�m. Isso quer dizer que, se ele precisar� ser reimplementado pela classe 
que herda, ele n�o precisa de um corpo, ou seja, basta a declara��o do m�todo.
 Lembre-se que, mesmo a classe "PessoaGenerica" sendo abstrata, seus atributos
  continuam sendo passados para as classes filhas (herdeiras). 

*/