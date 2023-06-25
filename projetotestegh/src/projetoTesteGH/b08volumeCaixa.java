
package projetoTesteGH;

import javax.swing.JOptionPane;



public class b08volumeCaixa {

	public static void main(String args[]) {
		
		String larg = JOptionPane.showInputDialog("Digite a largura ");
		String alt = JOptionPane.showInputDialog("Digite a altura ");
		String comp = JOptionPane.showInputDialog("Digite o comprimento");
		
		double largura  = Double.parseDouble(larg);
		double altura  = Double.parseDouble(alt);
		double comprimento  = Double.parseDouble(comp);
		
		double volume = largura * altura * comprimento;
		
		JOptionPane.showMessageDialog(null, "Volume da caixa: " + volume); 
		
	}
}