package projetoTesteGH;

public class b25divisãoComResto {

	public static void main(String[] args) {

		int dividendo = 7;
		int divisor = 3;
		int quociente;
		int resto;

		quociente = dividendo / divisor;
		resto = dividendo - (divisor * quociente);
		
		System.out.println("******** Operação Divisão ***********\n ");

		System.out.println("Dividendo: " + dividendo);
		System.out.println("Divisor: " + divisor);
		System.out.println("Quociente: " + quociente);
		System.out.println("Resto: " + resto);
	}

}
