package Neu1;
import java.util.Scanner;
import java.util.Random;

public class Fruechtefarben {

	public static void main(String[] args) {
		String [][] fruechte = new String [3][3]; 
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Wie oft möchten sie zugreifen? ");
		fruechte [0] [0] =  " Erdbeere nicht angebissen ";
		fruechte [0] [1] =	" Erdbeere schmutzig ";
		fruechte [0] [2] =	" Erdbeere angebisen ";	
		fruechte [1] [0] =	" Blaubeere nicht angebissen ";
		fruechte [1] [1] =	" Blaubeere angebisen ";	
		fruechte [1] [2] =	" Blaubeere schmutzig ";
		fruechte [2] [0] =	" Stachelbeere nicht angebissen ";					
		fruechte [2] [1] =	" Stachelbeere schmutzig ";
		fruechte [2] [2] =	" Stachelbeere angebissen ";							

		int anzahl = scanner.nextInt();
	
		for (int i = 0; i < anzahl; i++) {
			
		int zufallsIndex1 = random.nextInt(fruechte.length);
		int zufallsIndex2 = random.nextInt(fruechte[zufallsIndex1].length);
		String zufallsWert = fruechte[zufallsIndex1][zufallsIndex2];
		
		System.out.println((i + 1) + ": Sie haben erwischt: " + zufallsWert); }
		
		scanner.close();
	}

}

