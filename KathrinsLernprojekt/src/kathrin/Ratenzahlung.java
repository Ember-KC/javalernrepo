package kathrin;

import java.util.Scanner;

public class Ratenzahlung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    double zinssatz = 0.015;
    int monatsrate = 0;
    double saldo = 1000.00;
    int gesamtrate = 0;
    int monat = 1;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Bitte geben Sie die monatliche Rate ein!");
    monatsrate = scan.nextInt();
   
    
    while (saldo > 0) {
    saldo = saldo + (saldo*zinssatz) - monatsrate;
    gesamtrate = gesamtrate + monatsrate;
    System.out.println("Monat " + monat + " Saldo: " + saldo + " Gesamtratenzahlung: " + gesamtrate);    
    monat = monat + 1;
    }
    scan.close();
    
	}

}
