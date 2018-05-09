 package ednevnik.sistemskeoperacije;

import ednevnik.Ocena;
import ednevnik.Ucenik;

/**
 * Klasa koja sadrzi metodu SODodajOceneUceniku
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajOceneUceniku {

	/**
	 * Metoda koja dodaje ocjenu uceniku 
	 * @param ocena objekat klase Ocena
	 * @param ucenik objekat klase Ucenik
	 */
	public static void izvrsi (Ocena ocena, Ucenik ucenik) {
		
		if (ocena == null)
			throw new RuntimeException("Ocena ne sme biti null!");
		
		if (ocena.getBrOcene() < 1 || ocena.getBrOcene() > 5)
			throw new RuntimeException("Ocena mora biti izmedju 1 i 5!");
		
		ucenik.getOcene().add(ocena);
	}
}
