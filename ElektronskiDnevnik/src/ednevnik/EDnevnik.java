package ednevnik;

import java.util.LinkedList;

import ednevnik.interfejs.EDnevnikInterfejs;
import ednevnik.sistemskeoperacije.SODodajNapomenuUceniku;
import ednevnik.sistemskeoperacije.SODodajOceneUceniku;
import ednevnik.sistemskeoperacije.SODodajOdeljenje;
import ednevnik.sistemskeoperacije.SODodajPlanCasovaPredmetu;
import ednevnik.sistemskeoperacije.SODodajRazred;
import ednevnik.sistemskeoperacije.SODodajUcenike;
import ednevnik.sistemskeoperacije.SOVratiUcenika;

/**
 * Klasa koja sadrzi listu razreda i tekucu skolsku godinu, sa odgovarajucim get i set metodama, i metodama dodajRazred, dodajOdeljenje,
 * dodajUcenika, dodajOceneUcenika, dodajNapomenuUceniku, dodajPlanCasovaPredmetu, vratiUcenika 
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class EDnevnik implements EDnevnikInterfejs {
	
	/**
	 * Lista koja sadrzi objekte klase Razred
	 */
	private LinkedList<Razred> razredi;
	
	/**
	 * Atribut koji pokazuje tekucu skolsku godinu
	 */
	private String skolskaGodina;
	
	
	/**
	 * Metoda koja vraca listu objekata klase Razred
	 * @return listu objekata klase Razred
	 */
	public LinkedList<Razred> getRazredi() {
		return razredi;
	}
	
	/**
	 * Metoda koja vraca tekucu skolsku godinu
	 * @return skolska godina kao String
	 */
	public String getSkolskaGodina() {
		return skolskaGodina;
	}
	
	/**
	 * Metoda koja postavlja atribut skolskaGodina na odgovarajucu vrijednost
	 * @param skolskaGodina nova vrijenost atributa
	 * @throws java.land.RuntimeEcxpetion ako unesete parametar koji je null ili prazan String
	 */
	public void setSkolskaGodina(String skolskaGodina) {
		if(skolskaGodina==null || skolskaGodina.equals(""))
			throw new RuntimeException("Morate uneti skolsku godinu.");
		
		this.skolskaGodina = skolskaGodina;
	}

	/**
	 * Metoda koja poredi dva objekta klase EDnevnik(poredi atribut skolskaGodina)
	 * @return true ako se poklapaju atributi
	 * @return false ako se ne poklapaju
	 * @throws java.land.RuntimeException ako unijet objekat nije klase EDnevnik
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EDnevnik))
			throw new RuntimeException("Uneti objekat nije dnevnik.");
		EDnevnik ed = (EDnevnik)obj;
		if(ed.skolskaGodina.equals(skolskaGodina))
			return true;
		return false;
	}

	@Override
	public void dodajRazred(Razred razred) {
		SODodajRazred.izvrsi(razred, razredi);
	}

	@Override
	public void dodajOdeljenje(Odeljenje odeljenje, int brojRazreda) {
		SODodajOdeljenje.izvrsi(odeljenje, razredi, brojRazreda);
	}

	@Override
	public void dodajUcenike(Ucenik ucenik, int brojRazreda, int brojOdeljenja) {
		SODodajUcenike.izvrsi(ucenik, razredi, brojRazreda, brojOdeljenja);
	}

	@Override
	public void dodajOceneUceniku(Ocena ocena, Ucenik ucenik) {
		SODodajOceneUceniku.izvrsi(ocena, ucenik);
	}
 
	@Override
	public void dodajNapomenuUceniku(String napomena, Ucenik ucenik) {
		SODodajNapomenuUceniku.izvrsi(napomena, ucenik);
	}

	@Override
	public void dodajPlanCasovaPredmetu(String plan, Predmet predmet) {
		SODodajPlanCasovaPredmetu.izvrsi(plan, predmet);
	}
	
	@Override
	public Ucenik vratiUcenika(int razred, int odeljenje, String imePrezime, String imeRoditelja) {
		return SOVratiUcenika.izvrsi(razredi, razred, odeljenje, 
				imePrezime, imeRoditelja);

	}
	
}
