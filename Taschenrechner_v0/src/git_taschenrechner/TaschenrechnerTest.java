package git_taschenrechner;

import java.util.Scanner;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		Taschenrechner ts = new Taschenrechner();

		int swValue;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|   MENU SELECTION DEMO    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Multiplizieren |");
		System.out.println("|        4. Dividieren     |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);
		
		System.out.println("Erste Nummer");
		Scanner myScanner1 = new Scanner(System.in);
		double nmb1 = myScanner1.nextInt();
		System.out.println("Zweite Nummer");
		Scanner myScanner2 = new Scanner(System.in);
		double nmb2 = myScanner2.nextInt();

		// Switch construct
		switch (swValue) {
		case '1':
			System.out.println(nmb1 + " +" + nmb2 + " =" + ts.add(nmb1, nmb2));
			break;
			
			
		  //  add your code here
		case '2':
			System.out.println(nmb1 + " -" + nmb2 + " =" + ts.sub(nmb1, nmb2));
			break;
			
		case '3':
			System.out.println(nmb1 + " *" + nmb2 + " =" + ts.mul(nmb1, nmb2));
			break;
			
		case '4':
			System.out.println(nmb1 + " /" + nmb2 + " =" + ts.div(nmb1, nmb2));
			break;
			
		case '5':
			System.exit(0);
		  
		  
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}

	}

}
