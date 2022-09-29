package polimorfismoSobrecarga;

public class Aluno extends PessoaGenerica{ // não precisa criar uma nova classe, é só refazer essa
	//atributos locais que pertecem apenas ao aluno
	int registroAcademico;
	float notaVestibular;
	String curso, dataIngresso;
	
	//Construtor de Aluno, vazio
	
	public Aluno() {
		// Ao criar a instância de um aluno, é preciso criar a instância de 
		// uma pessoa genérica com o construtor padrão da heranca:
		super();
	}
	//sobrecarregando o construtor, com outra assinatura
	//(já recebendo os atributos):
	public Aluno (String nome, String RG, String cpf, String endereco,
				  String telFixo, String telCelular, String dataNascimento,
				  int registroAcademico, float notaVestibular,
				  String curso, String dataIngresso) {
		super();
		
		//atribui os dados para o objeto mãe
		//como os nomes dos atributos são iguais, é preciso dizer a qual
		// estamos referenciando. Usamos a palavra reservada "this"
		// para indicar que estamos usando os parametros locais (recebidos
		// nos atributos do construtor):
		this.RG =  RG;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telCelular = telCelular;
		this.telFixo = telFixo;
		this.dataNascimento = dataNascimento;
		
		//Agora atribui os valores locais:
		this.registroAcademico = registroAcademico;
		this.notaVestibular = notaVestibular;
		this.curso = curso;
		this.dataIngresso = dataIngresso;
	}
	
	// note que o nome do método é exatamente o mesmo da classe mãe	
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


// aqui usamos o tipo de polimorfismo sobrecarga, que permite que se tenha mais 
// de um método com o mesmo nome


