package projetoTesteGH;

public class projetoJdev {



	
	/**algoritmo 98 ------
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. O valor máximo da prestação não
poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da 
prestação e informar se o empréstimo pode ou não ser concedido. */

   public static void main(String[] args) {
	   
	double salario = 1000;
	double valorEmprestimoMaximo = (salario/100) * 30;
	double prestacao = 600 ;
	
		
	if(prestacao <= valorEmprestimoMaximo) {
		
		System.out.println("Autorizado o emprestimo de R$ " + prestacao);
	} else {
		 
		System.out.println("NÃO Autorizado. Valor máximo de emprestimo é de 30% do salário R$ " + valorEmprestimoMaximo);
		
	}
	 
		
	 
  }

}


