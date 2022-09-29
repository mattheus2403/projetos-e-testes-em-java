package polimorfismoV2;

public class Professor extends PessoaGenerica{ //pronto agora a classe professor é uma pessoa generica
	
	//Não é preciso declarar os atributo que já foram declarados na classe mãe, somente os próprios:
	int matricula;
	String dataContrato;
	float Salario;
	
	@Override
	public String retornaDados() {
		String dados;
		
		//pega os dados da classe herdada
		
		dados = super.retornaDados();
		
		//acrescenta os dados do professor
		
		dados += "\tMatricula: " + matricula + "\n";
		dados += "\tData de Contraro: " + dataContrato + "\n";
		dados += "\tSalario: " + Salario + "\n";
		
		return dados;
	}
}

// aqui fazemos exatamente a mesma coisa que no projeto Polimorfismo, mas com o professor