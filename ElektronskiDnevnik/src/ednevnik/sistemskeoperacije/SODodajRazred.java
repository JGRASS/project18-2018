package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Razred;

/**
 * Klasa koja sadrzi metodu SODodajRazred
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajRazred {

	/**
	 * Metoda koja dodaje razred u listu razreda
	 * @param razred kao objekat
	 * @param razredi lista razreda
	 */
	public static void izvrsi (Razred razred, LinkedList<Razred> razredi) {
		if (razred == null)
			throw new RuntimeException("Razred ne sme biti null!");
		
		if (razredi.contains(razred))
			throw new RuntimeException("Razred vec postoji u dnevniku!");
		
		razredi.add(razred);
	}
}
