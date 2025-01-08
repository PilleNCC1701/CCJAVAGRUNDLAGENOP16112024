package Rechner1;

import java.util.Scanner;

public class Rentenberechnng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Wieviel Kapital sollangelegt  werden? ");
		float anlage = scanner.nextFloat();
		anlage = Math.round(anlage * 100.0f) / 100.0f;
		
		System.out.println(" Bitte Zinssatz eingeben! ");
		float zinssatz= scanner.nextFloat();
		zinssatz = Math.round(zinssatz * 100.0f) / 100.0f;
		
		System.out.println(" Bitte die Jahresrente eingeben! ");
		float jahresrente = scanner.nextFloat();
		jahresrente = Math.round(jahresrente * 100.0f) / 100.0f;
		
		;
		scanner.close();
	}
}
