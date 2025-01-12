package Neu1;
import java.util.Random;
import java.util.Arrays;
public class neu {
	
public static void main(String[] args) {
	
	Random zahl = new Random();
	int [] lottozahlen = new int[6];
	int szahl = zahl.nextInt(10);
	
	for (int i=0 ; i< lottozahlen.length; i++) { 
		lottozahlen[i]= 1+ zahl.nextInt(50);
	}
	System.out.println(Arrays.toString(lottozahlen));
	System.out.println(" Super Zahl = " + szahl);
}	
}
