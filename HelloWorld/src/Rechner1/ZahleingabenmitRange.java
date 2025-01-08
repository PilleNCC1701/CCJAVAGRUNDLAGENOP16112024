package Rechner1;

import java.util.Scanner;

public class ZahleingabenmitRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl zwischen Null und Neun ein!");
		char c = scanner.next().charAt(0);
		
		
		switch (c) {
		
		case 1 : c = 'q';
		System.out.println("Bereich Null bis Drei");
		break;
		
		case 2 : c = 'w';
		System.out.println("Bereich Drei bis Sieben");
		break;
		
		case 3 : c = 'e';
		System.out.println("Bereich Acht bis Neun");
		break;
		
		default:
			System.out.println("Eingaben ungültig!");
		scanner.close();
		}}}