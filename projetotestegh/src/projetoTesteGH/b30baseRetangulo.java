package projetoTesteGH;

public class b30baseRetangulo {

	/**
	 * Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:
	 * perímetro: area: diagonal :
	 */

	public static void main(String[] args) {

		double base = 12;
		double altura = 7;
		double perimetro = 2 * (base + altura);
		double area = base * altura;
		double diagonal = (base * base) + (altura * altura);

		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("Diagonal: " + diagonal);

	}
}