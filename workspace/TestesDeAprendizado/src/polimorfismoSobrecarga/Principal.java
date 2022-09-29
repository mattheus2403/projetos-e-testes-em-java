package polimorfismoSobrecarga;

public class Principal {
	public static void main(String args[]) {
		//Agora podemos criar o aluno com os dados diretamente do construtor dele
		/*
		 Lembre-se que os atributos devem ir na mesma ordem do construtor da classe
        A ordem é:
 
         String nome, String RG, String cpf, String endereco,
         String telFixo, String telCelular, String dataNascimento,
         int registroAcademico, float notaVestibular,
         String curso, String dataIngresso
         */
		Aluno a1 = new Aluno("Matheus Morais", "999999-X", "508.368.078.55", "Rua das ruas, 10",
				"(11) 95728-4331", "(11) 4002-8922", "10/01/2001",
				1234567890, 10, "Doutorado em Duelos", "01/10/2020");
		

		//Vamos imprimir os dados do aluno a1
		System.out.println("Dados pessoais do aluno: ");
		//na hora de chamar você chama o mesmo
		System.out.println(a1.retornaDados());
	}
}

