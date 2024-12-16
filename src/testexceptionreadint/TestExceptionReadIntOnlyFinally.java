package testexceptionreadint;

import java.util.Scanner;

/**
 * Esempio per evidenziare l'utilizzo di finally nella gestione delle eccezioni, 
 * senza il catch.
 * 
 * @author cam
 *
 */
public class TestExceptionReadIntOnlyFinally {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digita un intero:");
		
		try {
			int intValue = in.nextInt();
		
			System.out.println("Valore: " + intValue);
		} finally {
			System.out.println("SONO IN FINALLY!!!");
			in.close();
		}
	}

}