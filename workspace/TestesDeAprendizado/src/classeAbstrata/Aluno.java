package classeAbstrata;

public class Aluno extends PessoaGenerica {
	//construtor
	public Aluno() {
	}		
		@Override
		public String getDados() {
			String dados = "";
			dados += "\nNome: " + nome;
			dados += "\nCPF: " + cpf;
			dados += "\nRG " + rg;
			dados += "\ndtNascimento: " + dtNascimento;
			return dados;
		}
	}

// aqui os dados são reimplementados como na classe abstrata