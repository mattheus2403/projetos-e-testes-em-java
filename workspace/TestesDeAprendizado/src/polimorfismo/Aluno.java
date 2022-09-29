package polimorfismo;

public class Aluno extends PessoaGenerica{ // não precisa criar uma nova classe, é só refazer essa
	//atributos locais que pertecem apenas ao aluno
	int registroAcademico;
	float notaVestibular;
	String curso, dataIngresso;
	
	// note que o nome do método é exatamente o mesmo da classe mãe
	// no caso o retornaDados, diferente do retornaDadosAluno no HerançaV2
	
	@Override
	
	public String retornaDados() {
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


// aqui fizemos a mesma coisa, a diferença é que implementamos o @Override, ou seja
// apenas mudamos o "estilo" de programação usando a reescrita do método


