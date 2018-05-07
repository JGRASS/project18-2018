package ednevnik.sistemskeoperacije;

import ednevnik.Ucenik;

public class SODodajNapomenuUceniku {

	public static void izvrsi (String napomena, Ucenik ucenik) {
		
		if (napomena == null || napomena == "")
			throw new RuntimeException("Napomena mora postojati!");
		
		ucenik.getNapomene().add(napomena);
	}
}
