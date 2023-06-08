package projetoTesteGH;

public class b11conversaoDolarReal {
	
	

	public static void main(String[] args) {
		
		System.out.println("********Conversão dolar p/ real********* \n");
		
		double cotacaoDolar = 5.31;
		double dolarDisponivel = 100.00;
		double convercaoReal = dolarDisponivel*cotacaoDolar;
		
		System.out.println("Dolar disponivel: US$ " + dolarDisponivel);
		System.out.println("Valor convertido em Real: R$ "  + convercaoReal );
		System.out.println("\n");
		
		
		System.out.println("********Conversão Real p/ dolar********* \n");
		
		double cotacaoReal = 0.1881;
		double realDisponivel = 100.00;
		double convercaoDolar = realDisponivel*cotacaoReal;
		
		System.out.println("Real disponivel: R$ " + realDisponivel);
		System.out.println("Valor convertido em dolar: US$ " + convercaoDolar);
		
		
	}
	
	 
}



