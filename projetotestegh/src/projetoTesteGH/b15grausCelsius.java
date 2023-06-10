package projetoTesteGH;

public class b15grausCelsius {

	public static void main(String args[]) {

		double k, re, ra, f, c = 3.17;

		f = c * 1.8 + 32;
		ra = c * 1.8 + 32 + 459.67;
		re = c * 0.8;
		k = c + 273.15;

		System.out.println("Fahrenheit = " + f );
		System.out.println("Rankine = " + ra);
		System.out.println("Réaumur = " + re);
		System.out.println("Kelvin = " + k);
        
		
	}
}
