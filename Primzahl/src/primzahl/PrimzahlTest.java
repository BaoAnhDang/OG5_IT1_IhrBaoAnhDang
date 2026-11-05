package primzahl;
import java.util.Scanner;
public class PrimzahlTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl:");
		long zahl = scn.nextLong();
		long start = System.currentTimeMillis();
		Primzahlen p = new Primzahlen();
		boolean ergebnis = p.isPrim(zahl);
		long end = System.currentTimeMillis();
		long zeit = end - start;
		
		System.out.println(ergebnis);
		System.out.println("Dauer: " + zeit + "ms" );
		scn.close();
	}

}