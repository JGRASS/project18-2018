package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Profesor;

/**
 * Klasa koja sadrzi metodu SODodajProfesora
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajProfesora {

	/**
	 * Metoda koja dodaje profesora u listu profesora koji imaju pristup sistemu
	 * @param imePrezime profesora
	 * @param korisnickoIme profesora
	 * @param sifra profesora
	 * @param profesori lista profesora
	 * @return listu profesora 
	 */
	public static LinkedList<Profesor> izvrsi(String imePrezime,String korisnickoIme, String sifra,LinkedList<Profesor> profesori) {
		Profesor p = new Profesor();
		
		p.setImePrezime(imePrezime);
		p.setKorisnicnoIme(korisnickoIme);
		p.setSifra(sifra);
		
		profesori.add(p);
		
		return profesori;
	}
}
