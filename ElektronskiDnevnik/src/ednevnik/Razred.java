	package ednevnik;

import java.util.LinkedList;

/**
 * Klasa koja sadrzi atibute redniBroj razreda i listu odeljenja
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Razred {
	
	/**
	 * Atribut koji predstavlja redni broj odeljenja
	 */
	private int redniBroj;
	
	/**
	 * Listu objekata klase Odeljenje
	 */
	private LinkedList<Odeljenje> odeljenja;
	
	
	/**
	 * Metoda koja vraca redni broj odeljenja
	 * @return redniBroj kao int
	 */
	public int getRedniBroj() {
		return redniBroj;
	}
	
	/**
	 * Metoda koja postavlja atribut redniBroj na novu vrijednost
	 * @param redniBroj - nova vrijednost
	 * @throws java.land.RuntimeException ako se kao parametar unese broj manji od 1 ili veci od 8
	 */
	public void setRedniBroj(int redniBroj) {
		if(redniBroj<1 || redniBroj>8)
			throw new RuntimeException("Morate uneti razred od 1-8");
		this.redniBroj = redniBroj;
	}
	public LinkedList<Odeljenje> getOdeljenja() {
		return odeljenja;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Razred(atribut redniBroj)
	 * @return true ako se poklapaju atributi
	 * @return false ako se ne poklapaju
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Razred))
			throw new RuntimeException("Uneti objekat nije razred.");
		Razred r = (Razred)obj;
		if(r.getRedniBroj()==redniBroj)
			return true;
		return false;
	}
	
	/**
	 * Metoda koja sve atribute pretvara u string i vraca ih
	 * @return svi atributi kao String
	 */
	@Override
	public String toString() {
		return "Razred [redniBroj=" + redniBroj + ", odeljenja=" + odeljenja + "]";
	}
}
