package heran�aV3;

public class Professor extends PessoaGenerica{ //pronto agora a classe professor � uma pessoa generica
	
	//N�o � preciso declarar os atributo que j� foram declarados na classe m�e, somente os pr�prios:
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
