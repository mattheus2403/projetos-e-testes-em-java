//instru��es de pacote dessa classe
package br.uninove.poo.matematica;

public class Trigonometria {
	
	public float areaTriangulo(float base, float altura) {
		OperacoesAritmeticas oa = new OperacoesAritmeticas();
		
		//�rea do triangulo = (base X altura) / 2
		//Usa o objeto oa para multiplicar:
		float area = oa.multiplicacao(base, altura) / 2;
		return area;
	}
}
