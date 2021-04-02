package javaFundamental;

import java.util.Random;
import java.util.Timer;

public class OrdenacaoBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[500];
		
		int troca1, troca2;
		
		Random gerador = new Random();
		
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = gerador.nextInt(5000);
		
		for(int i = 0; i < vetor.length; i++) 
			System.out.println("------VETOR DESORDENADO-----> " + vetor[i]);
		
		
		for(int i = 1; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				
				if(vetor[j] > vetor[j + 1]) {
					troca1 = vetor[j];
					troca2 = vetor[j + 1];
					vetor[j] = troca2;
					vetor[j + 1] = troca1;
				}
			}
		}

		for(int i = 0; i < vetor.length; i++)
			System.out.println("------VETOR ORDENADO-----> "  + vetor[i]);
	
	}

}
