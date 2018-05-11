package ednevnik;

import java.io.Serializable;
import java.util.LinkedList;


import ednevnik.interfejs.KorisniciInterfejs;
import ednevnik.sistemskeoperacije.SODeserijalizujProfesore;
import ednevnik.sistemskeoperacije.SODeserijalizujRoditelje;
import ednevnik.sistemskeoperacije.SODodajProfesora;
import ednevnik.sistemskeoperacije.SODodajRoditelje;
import ednevnik.sistemskeoperacije.SOObrisiProfesora;
import ednevnik.sistemskeoperacije.SOPorediProfesora;
import ednevnik.sistemskeoperacije.SOPrikaziSveProfesore;
import ednevnik.sistemskeoperacije.SOSerijalizujProfesora;
import ednevnik.sistemskeoperacije.SOSerijalizujRoditelja;
import ednevnik.sistemskeoperacije.SOUporediRoditelja;

/**
 * Klasa koja sadrzi lisut roditelj i listu profesora sa metoda dodajProfesora, dodajRoditelja, SerijalizujRoditelja, SerijalizujProfesora,
 * deserijalizujRoditelja, DeserijalizujProfesora, uporediRoditelja, uporediProfesora, obrisiProfesora, prikaziSveProfesore
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Korisnici implements KorisniciInterfejs, Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Lista koja sadrzi objekte klase Roditelj
	 */

	private LinkedList<Roditelj> roditelji = new LinkedList<Roditelj>();
	
	/**
	 * Lista koja sadrzi objekte klase Profesor
	 */
	private LinkedList<Profesor> profesori = new LinkedList<Profesor>();
	
	/**
	 * Metoda koa vraca listu roditelja
	 * @return lista objekata klase Roditelj
	 */
	public LinkedList<Roditelj> getRoditelji() {
		return roditelji;
	}
	
	/**
	 * Metoda koa vraca listu profesora
	 * @return lista objekata klase Profesor
	 */
	public LinkedList<Profesor> getProfesori() {
		return profesori;
	}
	
	/**
	 * Metoda koja dodaje profesora u listu profesora
	 * @param prof objekat klase Profesor koji se dodaje u listu
	 */
	public void dodajProfesora(Profesor prof) {
		profesori = SODeserijalizujProfesore.izvrsi();
		SODodajProfesora.izvrsi(prof, profesori);
		SOSerijalizujProfesora.izvrsi(profesori);
	}
	
	public void dodajRoditelja(Roditelj rod) {
		SODodajRoditelje.izvrsi(rod, roditelji);
	}

	@Override
	public void serijalizujRod(LinkedList<Roditelj> roditelji) {
		SOSerijalizujRoditelja.izvrsi(roditelji);
	}

	@Override
	public void serijalizujProf(LinkedList<Profesor> profesori) {
		SOSerijalizujProfesora.izvrsi(profesori);
	}

	@Override
	public void deserijalizujRod(LinkedList<Roditelj> roditelji) {
		roditelji = SODeserijalizujRoditelje.izvrsi();
	}

	@Override
	public void deserijalizujProf(LinkedList<Profesor> profesori) {
		profesori = SODeserijalizujProfesore.izvrsi();
	}

	@Override
	public boolean uporediRoditelja(String korisnickoIme,String sifra) {
		return SOUporediRoditelja.izvrsi(korisnickoIme, sifra, roditelji);
	}

	@Override
	public boolean uporediProfesora(String korisnickoIme, String sifra) {
		profesori = SODeserijalizujProfesore.izvrsi();
		return SOPorediProfesora.izvrsi(korisnickoIme, sifra, profesori);
	}

	@Override
	public void obrisiProfesora(LinkedList<Profesor> profesori, String imePrezime) {
		
		profesori = SODeserijalizujProfesore.izvrsi();
		
		SOObrisiProfesora.izvrsi(profesori, imePrezime);
		
		SOSerijalizujProfesora.izvrsi(profesori);
	}

	@Override
	public String prikaziSveProfesore() {
		profesori = SODeserijalizujProfesore.izvrsi();
		return SOPrikaziSveProfesore.izvrsi(profesori);
	}
	
}
