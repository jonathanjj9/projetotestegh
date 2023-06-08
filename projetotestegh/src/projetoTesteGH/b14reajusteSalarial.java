package projetoTesteGH;
 
/** com base em um salario, aplique um reajuste de 30% em cima desse salario**/

public class b14reajusteSalarial {

	
	public static void main (String[] args) {
		
		double salarioMensal = 6376.18;
		double percentualReajuste = 30; 
		double salarioAtualizado;
		
		salarioAtualizado =(salarioMensal * percentualReajuste)/100 + salarioMensal; 
		
		System.out.println("Salario atualizado com reajuste: R$ " + salarioAtualizado);
		
		}
}
