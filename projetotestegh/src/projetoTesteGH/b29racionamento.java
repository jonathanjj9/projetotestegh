package projetoTesteGH;

public class b29racionamento {
	public static void main(String[] args) {
		/**
		 * Antes de o racionamento de energia ser decretado, quase ninguém falava em
		 * quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário.
		 * Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo
		 * (1320), fazer um algoritmo que receba o valor do salário mínimo e a
		 * quantidade de quilowatts gasta por uma residência e calcule. Imprima: • o
		 * valor em reais de cada quilowatt • o valor em reais a ser pago • o novo valor
		 * a ser pago por essa residência com um desconto de 10%
		 */

		double salarioMinimo = 1320.00;
		double cemQuilowatts = salarioMinimo / 7;
		double umQuilowatt = cemQuilowatts / 100;
		double quantidadeGastaQuilowatts = 78;
		double valorGastoEmQuiloWatts = umQuilowatt * quantidadeGastaQuilowatts;
		double desconto = valorGastoEmQuiloWatts * 0.9;

		System.out.println("Salario Minimo - 01/2023 - R$ " + salarioMinimo);
		System.out.println("100 Quilowatts = " + cemQuilowatts + " kW");
		System.out.println("Valor da conta a ser paga: R$ " + valorGastoEmQuiloWatts);
		System.out.println("Valor com 10% de desconto: R$ " + desconto);

	}
}
