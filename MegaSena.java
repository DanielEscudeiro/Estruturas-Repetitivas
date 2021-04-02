package javaFundamental;                                                                                                                                                                    

import javax.swing.JOptionPane;

public class MegaSena {

	public static void main54365456(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 60;
		final int MIN = 1;
		
		int[] numerosSorteados = new int[6];
		
		int num = 0, i = 0;
		Boolean Achou;
		
		while(true){
			
			num = (int)(Math.random() * (MAX - MIN) + MIN);
			Achou = false;
			
			for(int j = 0; j < 6; j++){
				
				if(numerosSorteados[j] == num) {
					System.out.println(num);
					Achou = true;
					break;
				}
			}
			
			if(!Achou) {
				numerosSorteados[i++] = num;
			}
			
			if(i == 6){
				break;
			}
		}
		
		String msg = "Números sorteados: ";
		for(i = 0; i < 6; i++) {
			msg += numerosSorteados[i] + " ";
		}
		
		
		
		JOptionPane.showInternalMessageDialog(null, msg);
	}

}
