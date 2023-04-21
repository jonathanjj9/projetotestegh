/* Efetuar o calculo e apresentar o valor de uma prestação em atraso, utilizando a formula:
 
   PRESTAÇÃO <- (VALOR + (VALOR*TAXA/100)*TEMPO)
 */

package projetoTesteGH;

public class b06prestacao {

	 public static void main(String[] args) {
		
		
			
			double prestacao, valor = 138.59, multa = 2,  mes = 6;
			
			multa = valor*(mes/100);
			
			prestacao = valor +(valor*(multa/100));
			
			System.out.println("Valor Bruto: " + valor);
			System.out.printf("Valor corrigido com multa: %.2f ", + prestacao );
	}
}
