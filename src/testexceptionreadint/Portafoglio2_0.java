package testexceptionreadint;

class Portafoglio2_0 {
	
	private int disponibilita = 0;
	
	/**
	 * 
	 * @param value
	 * @return la disponibilità ad operazione avvenuta
	 */
	public int versa(int value) {
		this.disponibilita += value;
		return this.disponibilita;
	}
	
	/**
	 * 
	 * @param value
	 * @return la disponibilità ad operazione avvenuta
	 * 
	 * @throws MyException se la disponibilità è < della richiesta di 
	 * prelievo.
	 * 
	 */
	public int preleva(int value) {
		if (this.disponibilita < value) 
			throw new MyException("Disponiblità: " + this.disponibilita 
					+ " < richiesta prelievo: " + value);
		
		this.disponibilita -= value;
		return this.disponibilita;
	}
	
	public int getDisponibilita() {
		return this.disponibilita;
	}
	
}