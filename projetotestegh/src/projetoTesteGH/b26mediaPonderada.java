package projetoTesteGH;

/**
 * Entrar com quatro números e imprimir a média ponderada, sabendo-se que os
 * pesos são respectivamente: 1, 2, 3 e 4.
 */

public class b26mediaPonderada {

	public static void main(String[] args) {

		double salario1 = 5000.00;
		double salario2 = 2000.00;
		double salario3 = 1400.00;
		double salario4 = 1200.00;

		double salarioTotal = (1 * salario1) + (2 * salario2) + (3 * salario3) + (4 * salario4);
		double pesoTotal = 1 + 2 + 3 + 4;
		// ou double salarioTotal = (1*salario1) + (2*salario2) + (3*salario3) +
		// (4*salario4) / 10 que é igual ao pesoTotal;

		double mediaPonderada = salarioTotal / pesoTotal;

		System.out.println("Media Ponderada: \nR$ " + mediaPonderada);

	}

}
