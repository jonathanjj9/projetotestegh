package projetoTesteGH;

public class b33minuto {

	/**
	 * Criar um algoritmo que leia um valor de hora e informe quantos minutos se
	 * passsaram desde o início do dia.
	 */

	public static void main(String[] args) {

		double umaHora = 0.6 * 100;
		double horaAtual = 3;
		double minutosPassados = umaHora * horaAtual;

		System.out.println("Até o momento se passaram: " + minutosPassados + " Minutos. ");
	}
}