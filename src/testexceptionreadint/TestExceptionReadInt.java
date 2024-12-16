package testexceptionreadint;

import java.util.Scanner;

/**
 * Esempio programma in cui l'eccezione non è catturata per gestirla.
 * Es: l'input "fred" causerebbe eccezione del metodo Integer.parseInt()
 * @author cam
 */
public class TestExceptionReadInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		int intValue = Integer.parseInt(line);
	    
		System.out.println("Valore: " + intValue);
		in.close();

	}

}