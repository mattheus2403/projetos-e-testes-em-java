package heran�aV3;

public class Aluno extends PessoaGenerica{ // n�o precisa criar uma nova classe, � s� refazer essa
	//atributos locais que pertecem apenas ao aluno
	int registroAcademico;
	float notaVestibular;
	String curso, dataIngresso;
	
	public String retornaDadosAluno() {
		String dados;
		
		//Pega os dados da classe herdada
		dados = super.retornaDados();
		
		//Acrescenta os dados do aluno:
		dados += "\tRegistro Academico: " + registroAcademico + "\n";
		dados += "\tNota no Vestibular> " + notaVestibular + "\n";
		dados += "\tCurso: " + curso + "\n";
		dados += "\tData de ingresso: " + dataIngresso + "\n";
		
		return dados;
	}

}


// nessa segunda vers�o apenas alteramos a classe Aluno para que seus dados
// sejam mostrados, e n�o apenas o da classe gen�rica, assim usamos o comando super
// e depois os chamamos na nova classe principal modificada

