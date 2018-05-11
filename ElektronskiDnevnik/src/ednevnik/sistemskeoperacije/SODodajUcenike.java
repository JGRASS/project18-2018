package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Razred;
import ednevnik.Ucenik;

/**
 * Klasa koja sadrzi metodu SODodajUcenika
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajUcenike {

	/**
	 * Metoda koja dodaje ucenika u odredjeni razred i odeljenje
	 * @param ucenik kao objekat klase Ucenik
	 * @param razredi lista razreda
	 * @param brojRazreda redni broj razreda
	 * @param brojOdeljenja 
	 */
	public static void izvrsi (String imePrezime, String imeRoditelja, String JMBG, LinkedList<Razred> razredi, int brojRazreda, 
			int brojOdeljenja) {
		
		Ucenik ucenik = new Ucenik();
		
		ucenik.setImePrezime(imePrezime);
		ucenik.setImeRoditelja(imeRoditelja);
		ucenik.setJmbg(JMBG);
		
		if (ucenik == null)
			throw new RuntimeException("Ucenik ne sme biti null!");
		
		if (brojRazreda < 1 || brojOdeljenja > 8)
			throw new RuntimeException("Broj razreda mora biti izmedju 1 i 8!");
		
		if (brojOdeljenja < 1 || brojOdeljenja > razredi.get(brojRazreda).getOdeljenja().size())
			throw new RuntimeException("Broj odeljenja ne sme biti veci od postojeceg broja"
					+ " odeljenja odabranog razreda ili manji od 1!");
		
		if(razredi.get(brojRazreda).getOdeljenja().get(brojOdeljenja).getUcenici().contains(ucenik))
			throw new RuntimeException("Dato odeljenje vec sadrzi datog ucenika!");
		
		razredi.get(brojRazreda).getOdeljenja().get(brojOdeljenja).getUcenici().add(ucenik);
	}
}
