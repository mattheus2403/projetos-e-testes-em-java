package classeAbstrata;

public class Principal {

	public static void main (String args[]) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Matheus Morais";
		a1.cpf = "508.368.78.55";
		a1.dtNascimento = "24/03/01";
		a1.rg = "99999-X";
		
		System.out.println("Os dados do aluno são: ");
		System.out.println(a1.getDados());
	}
}
