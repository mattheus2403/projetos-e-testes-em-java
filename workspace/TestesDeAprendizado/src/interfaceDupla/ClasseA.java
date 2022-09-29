package interfaceDupla;

public class ClasseA implements InterfaceA, InterfaceB {
	
	//reimplementando o métodoA, da interface A
	
	@Override
	public double metodoA() {
		return 10.5;
	}
	
	//Reimplementando o métodoB, da interface B
	@Override
	public String metodoB(double valor) {
		if (valor <= 10) {
			return "Valor válido";
		} else {
			return "valor inválido";
		}
	}
}

//esse programa tem o intuito de ensinar como se implementa mais de uma
//interface
