package testexceptionreadint;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esempio cattura dell'eccezione java.util.InputMismatchException 
 * 
 * @author cam
 *
 */
public class TestExceptionReadIntWithFinally {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		try {
			int intValue = in.nextInt();
			System.out.println("Valore: " + intValue);
		} catch (InputMismatchException e) {
			System.out.println("Exception message: " + e.getMessage());
		} finally {
			System.out.println("SONO IN FINALLY!!!");
			in.close();
		}
	}

}