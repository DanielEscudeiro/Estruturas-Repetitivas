package javaFundamental;

import java.util.Random;

import javax.swing.JOptionPane;

public class ComputadorVsHumano {

	public static void main1234567(String[] args) {
		// TODO Auto-generated method stub
		String letratxt;
		char letra = ' ';
		int numerosSorteados, i = 0, j = 0;

		Random numeros = new Random();
		numerosSorteados = numeros.nextInt(25);
		numerosSorteados += 65; 
		
		do {
			
			letratxt = JOptionPane.showInputDialog("Adivinhe a letra que o computador escolheu [Digite -1 se você quiser sair]").toUpperCase();
			letra = letratxt.charAt(0);
			
			if(numerosSorteados == letra) {
				JOptionPane.showInternalMessageDialog(null, "Parabéns você acertou!" );
				i++;
				
				if(i < j) {
					JOptionPane.showInternalMessageDialog(null, "Que pena... o computador venceu você!");
				}
				else if(i == j) {
					JOptionPane.showInternalMessageDialog(null, "Uau!!! O placar ficou empatado, tente jogar mais uma vez para vencer o computador!");
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Parabéns, você venceu o computador!!");
				}
				
				letratxt = JOptionPane.showInputDialog("Você deseja jogar de novo? [Digite -1 se você quiser sair ou 0 se quiser continuar jogando]");
				
				if(letratxt.equals("0")) {
					continue;
				}
				else {
					break;
				}
			}
			else if(letratxt.equals("-1")) {
				break;
			}
			else {
				j++;
				JOptionPane.showInternalMessageDialog(null, "Você errou... Tente novamente!");
				JOptionPane.showInternalMessageDialog(null, "Computador: " + j + " Você: " + i);
			}
			
		}while(!letratxt.equals("-1"));
		
		if(letra < numerosSorteados) {
			
		}

	}

}
