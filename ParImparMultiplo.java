package javaFundamental;

import javax.swing.JOptionPane;

public class ParImparMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		String valorTxt, msg = "";
		
		
		valorTxt = JOptionPane.showInputDialog("Informe um valor");
		valor = Integer.parseInt(valorTxt);
		
		if(valor % 2 == 0) {
			msg += "� par";
		}
		if (valor % 2 == 1) {
			msg += "� �mpar";
		}
		if (valor % 3 == 0 && valor % 6 == 0) {
			msg += " e � multiplo de 3 e 6!";
		}
		
		JOptionPane.showInternalMessageDialog(null, msg);
	}

}
