package herançaV3;

public class Professor extends PessoaGenerica{ //pronto agora a classe professor é uma pessoa generica
	
	//Não é preciso declarar os atributo que já foram declarados na classe mãe, somente os próprios:
	int matricula;
	String dataContrato;
	float Salario;
	
	public String retornaDadosProfessor() {
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
