package projetoTesteGH;

public class b32trocaValores {

	/*
	 * algoritmo 68 * Ler dois valores para as variáveis A e b, efetuar a troca dos
	 * vatores de forma que a variável A passe a ter o valor da variável 8 e que a
	 * variável 8 passe a ter o valor da variável A. Apresentar os valores trocados
	 **/

	public static void main(String[] args) {

		int a = 15;
		int b = 25;
		int auxiliar;

		auxiliar = a;
		a = b;
		b = auxiliar;

		System.out.println("A passou a ser: " + a);
		System.out.println("B passou a ser: " + b);
	}
}