package BMIrechner;

import java.util.Scanner;

public class BMIrechner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" What is your \"Weight\"? ");
		double Weight = scanner.nextDouble();
		System.out.println(" What is your \"Height\"? ");
		double Height = scanner.nextDouble();

		double Bmi = Weight / (Height * Height);
		System.out.println(" Your BMI is " + Bmi);
		scanner.close();
	}
}
