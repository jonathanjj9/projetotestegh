
package projetoTesteGH;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {

		String carro = JOptionPane.showInputDialog("informe carro");
		String pessoas = JOptionPane.showInputDialog("informe pessoal");

		double carroNumero = Double.parseDouble(carro);
		double pessoasNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoasNumero);

		double resto = carroNumero % pessoasNumero;
         
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		  
/* Zero da resposta é equivalente a caixa de dialogo, exemplo: sim == 0, não == 1 e cancelar == 2; esse numeros são da sintaxe do objeto*/
		
		 if (resposta == 0) {
			
			JOptionPane.showMessageDialog(null, divisao);
		
		 }else {
			
			
		  }
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado do resto?");
		
		 if(resposta == 0) {
			 
			 JOptionPane.showConfirmDialog(null, resto );
			 JOptionPane.showMessageDialog(null, "Fim!");
		 }else {
			 
			 JOptionPane.showMessageDialog(null, "Fim!");
		 }
                 
                  
	}
}
