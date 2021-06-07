package fr.blaise.tp;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Cuisson {
	
	static final int BLEU = 1;
	static final int POINT = 2;
	static final int CUIT = 3;
	
	static final int BOEUF = 1;
	static final int PORC = 2;
	
	public static void main(String[] args) {

		int tempsCuisson = 0;
		
		System.out.println("Choisissez votre viande: ");
		System.out.println(" Boeuf = 1 ");
		System.out.println(" Porc = 2 ");
		
		int typeViande = saisir();
		
		System.out.println("Choisissez votre temps de cuisson: ");
		System.out.println(" Bleu = 1 ");
		System.out.println(" Point = 2 ");
		System.out.println(" Cuit = 3 ");
		
		int modeCuisson = saisir();
		
		System.out.println("Entrez le poids de votre viande (en gramme) : ");
		int poidsViande = saisir();
		
		if( typeViande == BOEUF ) {
			switch (modeCuisson) {
			
			case BLEU:
				tempsCuisson= (int)(poidsViande * 10 / 500f * 60);
				break;
			case POINT:
				tempsCuisson= (int)(poidsViande * 17 / 500f * 60);
				break;
			case CUIT:
				tempsCuisson= (int)(poidsViande * 25 / 500f * 60);
				break;
			}
		}
		else if (typeViande == PORC) {
			switch (modeCuisson) {
			
			case BLEU:
				tempsCuisson= (int)(poidsViande * 15 / 400f * 60);
				break;
			case POINT:
				tempsCuisson= (int)(poidsViande * 25 / 400f * 60);
				break;
			case CUIT:
				tempsCuisson= (int)(poidsViande * 40 / 400f * 60);
				break;
			}
		}
		else System.out.println("Type de viande invalide");
		if(tempsCuisson > 0)System.out.println("Il vous faut " + tempsCuisson + " secondes");
	}
	
	public static int saisir()
	{
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		return result;
	}

}
