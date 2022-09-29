package herançaV2;

public class Principal {
	public static void main(String args[]) {
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		
		// veja que podemos acessar os atributos diretamente
		//mesmo eles sendo da classe PessoaGenerica.
		//Isso ocorre pois o aluno a1 é um Objeto da classe
		//aluno que, por sua vez, é filho de "PessoaGenerica"
		a1.nome = "Matheus Morais";
		a1.registroAcademico = 1234567890;
		a1.cpf = "508.368.078.55";
		a1.RG = "999999-X";
		a1.curso = "Doutorado em Duelos";
		a1.dataNascimento = "10/01/2001";
		a1.dataIngresso = "01/10/2020";
		a1.endereco = "Rua das ruas, 10";
		a1.notaVestibular = 10;
		a1.telFixo = "(11) 4002-8922";
		a1.telCelular = "(11) 95728-4331";
		
		//idem para professor
		p1.nome = "Vellian Crowler";
		p1.Salario = 200.00F;
		p1.cpf = "000.000.000-10";
		p1.dataNascimento = "12/12/2012";
		p1.RG = "0102030405-Y";
		p1.endereco = "Ancient Gear Fortress, 02";
		p1.matricula = 90020;
		p1.telFixo = "(299) 23232";
		p1.telCelular = "(299) 1212121";
		p1.dataContrato = "01/01/1901";
		
		//Vamos imprimir os dados do aluno a1
		System.out.println("Dados pessoais do aluno: ");
		System.out.println(a1.retornaDadosAluno());
	}
}

//aqui criamos um programa que pega as caracteristicas genéricas 
//da classe mãe = PessoaGenerica, e une com as caracteristicas individuais
//das classes aluno e professor, assim não tendo que serem referenciadas individualmente
// o que geraria mais código, ou seja, mais trabalho pro programador.