package polimorfismo;

public class Aluno extends PessoaGenerica{ // n�o precisa criar uma nova classe, � s� refazer essa
	//atributos locais que pertecem apenas ao aluno
	int registroAcademico;
	float notaVestibular;
	String curso, dataIngresso;
	
	// note que o nome do m�todo � exatamente o mesmo da classe m�e
	// no caso o retornaDados, diferente do retornaDadosAluno no Heran�aV2
	
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


// aqui fizemos a mesma coisa, a diferen�a � que implementamos o @Override, ou seja
// apenas mudamos o "estilo" de programa��o usando a reescrita do m�todo


