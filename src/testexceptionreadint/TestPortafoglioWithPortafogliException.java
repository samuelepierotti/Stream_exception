package testexceptionreadint;
public class TestPortafoglioWithPortafogliException {
    	
	public static void main(String[] args) {
		
		Portafoglio3_0 portLucia = new Portafoglio3_0();
		
		portLucia.versa(400);
		try {
			portLucia.preleva(600);
		} catch (PortafoglioException e) {
			System.out.println("PortafoglioException: " + e.getMessage());
		}
		
		System.out.println("SONO QUI");
		
	}

}