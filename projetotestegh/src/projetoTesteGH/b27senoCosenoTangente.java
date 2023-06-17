package projetoTesteGH;

/*Entrar com um ângulo em graus e imprimir: seno, co-seno, tangente. */

public class b27senoCosenoTangente {

	public static void main(String[] args) {

		double hipotenusa = 2;
		double ca = 2.75;
		double co = 3.145;

		double seno = co / hipotenusa;
		double coseno = ca / hipotenusa;
		double tangente = ca / co;

		System.out.println("Hipotenusa = " + seno);
		System.out.println("Conseno = " + coseno);
		System.out.println("Tangente = " + tangente);

	}
}