//package Rechner1;
//import java.util.Scanner;
//
//public class Zinsberechnung {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" Geben Sie das anzulegende Kapital mit 2 Nachkommastellen an! ");
//		float kapital = scanner.nextFloat();
//		scanner.nextLine();
//
//		kapital = Math.round(kapital * 100.0f) / 100.0f;
//		System.out.println(" Ihr anzulegendes Kapital beträgt : " + kapital + " Geld ");
//
//		
//		System.out.println(
//				" Geben Sie den Zinssatz ohne %-Zeichen für das anzulegende Kapital mit bis zu 2 Nachkommastellen an! ");
//		float zinssatz = scanner.nextFloat();
//
//		zinssatz = Math.round(zinssatz * 100.0f) / 100.0f;
//		System.out.println(" Ihr anzulegendes Zinssatzfür das anzulegende Kapital beträgt : " + zinssatz + " % ");
//
//		
//		System.out.println(" Geben Sie die gewünschte Laufzeit für die Anlage in ganzen Jahren an! ");
//		int laufzeit = scanner.nextInt();
//
//		System.out.println(" Ihr Laufzeit für die Anlage beträgt : " + laufzeit + " Jahre ");
//		 
//		String input = scanner.nextLine();
//		System.out.println(" Für Ertrag bitten mit Enter bestätigen! ");
//		
//		scanner.nextLine();
//		float ertrag = kapital + kapital * (zinssatz / 100 ) * laufzeit;
//		
//		ertrag = Math.round(ertrag * 100.0f) / 100.0f;
//		
//		if (input.isEmpty())
//			;
//		{
//			System.out.println("Ertrag = " + ertrag);
//		}
//
//		scanner.close();
//			}
//
//}
package Rechner1;
import java.util.Scanner;

public class Zinsberechnung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geben Sie das anzulegende Kapital mit 2 Nachkommastellen an: ");
        float kapital = scanner.nextFloat();
        System.out.println("Ihr anzulegendes Kapital beträgt: " + kapital + " Geld ");

        System.out.println("Geben Sie den Zinssatz ohne %-Zeichen für das anzulegende Kapital mit bis zu 2 Nachkommastellen an: ");
        float zinssatz = scanner.nextFloat();
        System.out.println("Ihr anzulegendes Zinssatz für das anzulegende Kapital beträgt: " + zinssatz + " % ");

        System.out.println("Geben Sie die gewünschte Laufzeit für die Anlage in ganzen Jahren an: ");
        int laufzeit = scanner.nextInt();
        System.out.println("Ihre Laufzeit für die Anlage beträgt: " + laufzeit + " Jahre ");

        // Leeren Sie den Eingabepuffer nach dem letzten nextInt()
        scanner.nextLine(); 

        // Schleife für die Eingabebestätigung
        while (true) {
            System.out.println("Für Ertrag bitten mit Enter bestätigen! ");
            String input = scanner.nextLine();
            
            // Zinseszinsberechnung
            float zinssatzDecimal = zinssatz / 100; // Umwandlung in Dezimalform
            float ertrag = kapital * (float) Math.pow((1 + zinssatzDecimal), laufzeit);
            ertrag = Math.round(ertrag * 100.0f) / 100.0f;

            if (input.isEmpty()) {
                System.out.println("Ertrag = " + ertrag);
                break; // Schleife verlassen, wenn die Eingabe leer ist
            } else {
                System.out.println("Falsche Eingabe. Bitte drücken Sie die Enter-Taste zur Bestätigung.");
            }
        }

        scanner.close();
    }
}
