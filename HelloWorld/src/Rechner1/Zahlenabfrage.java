package Rechner1;

import java.util.Scanner;

public class Zahlenabfrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie eine Zahl zwischen Null und Neun ein!");

		int zahl = scanner.nextInt();
		
		switch (zahl) {

		case 0:
			System.out.println("Bereich Null bis Drei");
			break;

		case 1:
			System.out.println("Bereich Null bis Drei");
			break;

		case 2:
			System.out.println("Bereich Null bis Drei");
			break;

		case 3:
			System.out.println("Bereich Null bis Drei");
			break;

		case 4:
			System.out.println("Bereich Vier bis Sieben");
			break;

		case 5:
			System.out.println("Bereich Vier bis Sieben");
			break;

		case 6:
			System.out.println("Bereich Vier bis Sieben");
			break;

		case 7:
			System.out.println("Bereich Vier bis Sieben");
			break;

		case 8:
			System.out.println("Bereich Acht bis Neun");
			break;

		case 9:
			System.out.println("Bereich Acht bis Neun");
			break;

		default:
			System.out.println("Eingaben ungültig!");
			scanner.close();

		}
	}
}
