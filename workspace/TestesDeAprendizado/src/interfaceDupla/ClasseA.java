package interfaceDupla;

public class ClasseA implements InterfaceA, InterfaceB {
	
	//reimplementando o m�todoA, da interface A
	
	@Override
	public double metodoA() {
		return 10.5;
	}
	
	//Reimplementando o m�todoB, da interface B
	@Override
	public String metodoB(double valor) {
		if (valor <= 10) {
			return "Valor v�lido";
		} else {
			return "valor inv�lido";
		}
	}
}

//esse programa tem o intuito de ensinar como se implementa mais de uma
//interface
