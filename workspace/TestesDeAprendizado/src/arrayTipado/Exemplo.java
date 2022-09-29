package arrayTipado;

public class Exemplo {
	public static void main (String args[]) {
		
		//Cria o array que pode armazenar 4 pessoas;
		Pessoa listaPessoas[] = new Pessoa[4];
		
		//Pessoa 1
		listaPessoas[0] = new Pessoa(); //É preciso inicializar
		
		listaPessoas[0].nome = "Matheus Morais Rodrigues";
		listaPessoas[0].idade = 21;
		listaPessoas[0].email = "matheusmoraidois@gmail.com";
		
		//Pessoa 2
		listaPessoas[1] = new Pessoa();
		
		listaPessoas[1].nome = "Yusaku Fujiki";
		listaPessoas[1].idade = 17;
		listaPessoas[1].email = "cyberse.com";
		
		//Pessoa 3
		listaPessoas[2] = new Pessoa();
		
		listaPessoas[2].nome = "Yuma Tsukumo";
		listaPessoas[2].idade = 12;
		listaPessoas[2].email = "xyz.com";
		
		//Pessoa 4 
		listaPessoas[3] = new Pessoa();
		
		listaPessoas[3].nome = "Judai Yuki";
		listaPessoas[3].idade = 15;
		listaPessoas[3].email = "Fusion.com";
		
		//vamos mostrar os dados na tela
		
		int i = 0;
		
		while (i <=3) {
			System.out.println("Dados da pessoa " + (i + 1) + ": "); // i+1 pra deixar mais amigável a exibição
			
			System.out.println("\t" + listaPessoas[i].nome);
			System.out.println("\t" + listaPessoas[i].idade);
			System.out.println("\t" + listaPessoas[i].email);
			i++;// itera o i
		}
	}
}
