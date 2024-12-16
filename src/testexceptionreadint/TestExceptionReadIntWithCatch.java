package testexceptionreadint;

import java.util.Scanner;

/**
 * Eccezione gestita tramite try...catch
 * 
 * @author cam
 *
 */
public class TestExceptionReadIntWithCatch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		
		try {
			int intValue = Integer.parseInt(line);
	    	System.out.println("Valore: " + intValue);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("DOPO CATCH");
		in.close();
		
	}

}