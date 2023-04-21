package projetoTesteGH;

public class b05combustivel {

public static void main(String[] args) {
	

	double tempoHr = 1.45, velocidadeKM = 120, distancia, litrosUsados;
	
	distancia = tempoHr * velocidadeKM;
	litrosUsados = distancia / 12.0;
	
	System.out.println("******* *********** ********** \n" + "       Combustivel Gasto \n" 
	+ "******* *********** **********" );
	
	System.out.println("Velocidade Média: " + velocidadeKM + " km \n" + "Tempo gasto: " + tempoHr + 
	" hora/min \n" + "Quilometragem: " + distancia + " km \n" + "Litros consumido: " + litrosUsados + " lt" );	
	
   }
}
