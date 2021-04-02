package javaFundamental;

import javax.swing.JOptionPane;

public class TrocaMaisculasMinusculas {

	public static void main34265398(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra;
		String palavraResultante = "";
		
		palavra = JOptionPane.showInputDialog("Informe uma palavra");
		
		int codLetra = 0;
		int qtMaiMin = 0, qtMinMai = 0;
		
		for(int i = 0; i < palavra.length(); i++) {
			
			codLetra = (int)(palavra.charAt(i));
			
			if(codLetra > 64 && codLetra < 91) { //Intervalo de letras maisculas
				codLetra += 32;
				qtMaiMin++;
			}
			else if (codLetra > 90 && codLetra < 123){
				codLetra -= 32;
				qtMinMai++;
			}
			
			palavraResultante += String.valueOf((char)codLetra);
		}
		
		String msg = "";
		
		msg += "Palavra origem: " + " - palavra resultante: " + palavraResultante + "\n\n";
		msg += "Quantidade de trocas de maiúsculas para minúsculas: " + qtMaiMin + "\n";
		msg += "Quantidade de trocas de minúsculas para maiúsculas: " + qtMinMai;
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
