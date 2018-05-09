package ednevnik.sistemskeoperacije;

import ednevnik.Ucenik;

/**
 * Klasa koja sadrzi metodu SODodajNapomenuUceniku
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajNapomenuUceniku {

	/**
	 * Metoda koja dodaje napomenu uceniku u listu napomena
	 * @param napomena koja se dodaje
	 * @param ucenik za koga se dodaje napomena
	 */
	public static void izvrsi (String napomena, Ucenik ucenik) {
		
		if (napomena == null || napomena == "")
			throw new RuntimeException("Napomena mora postojati!");
		
		ucenik.getNapomene().add(napomena);
	}
}
