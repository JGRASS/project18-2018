package ednevnik;

import java.util.LinkedList;

/**
 * Klasa koja sadrzi atribute redniBroj, imeRazrednog, listu ucenika i listu predmeta tog odeljenja
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Odeljenje {
	
	/**
	 * Atribut koji predstavlja redni broj tog odeljenja u skoli
	 */
	private int redniBroj;
	
	/**
	 * Atribut koji predstavlja ime i prezime razrednog tog odeljenja
	 */
	private String imeRazrednog;
	
	/**
	 * Lista objekata klase Ucenik
	 */
	private LinkedList<Ucenik> ucenici;
	
	/**
	 * Niz objekata klase Predmet
	 */
	private Predmet[] predmeti;
	
	
	/**
	 * Metoda koja vraca redni broj odeljenja
	 * @return redniBroj kao int
	 */
	public int getRedniBroj() {
		return redniBroj;
	}
	
	/**
	 * Metoda koja postavlja redniBroj na novu vrijednost
	 * @param redniBroj nova vrijednost
	 * @throws java.land.RuntimeExcpetion ako je parametar koji je unijet manji od 1 ili veci od 15
	 */
	public void setRedniBroj(int redniBroj) {
		if(redniBroj<1 || redniBroj>15)
			throw new RuntimeException("Redni broj odeljenja mora biti izmedju 1 i 15");
		this.redniBroj = redniBroj;
	}
	
	/**
	 * Metoda koja vraca ime i prezime razrednog
	 * @return ime i prezime kao String
	 */
	public String getImeRazrednog() {
		return imeRazrednog;
	}
	
	/**
	 * Metoda koja postavlja ime i prezime razrednog na novu vrijednost
	 * @param imeRazrednog nova vrijednost
	 * @throws java.land.RuntimeException ako se kao parametar unese null ili prazan String
	 */
	public void setImeRazrednog(String imeRazrednog) {
		if(imeRazrednog==null || imeRazrednog.equals(""))
			throw new RuntimeException("Morate uneti ime i prezime razrednog staresine:");
		
		this.imeRazrednog = imeRazrednog;
	}
	
	/**
	 * Metoda koja vraca listu ucenika tog odeljenja
	 * @return lista objekata klase Ucenik
	 */
	public LinkedList<Ucenik> getUcenici() {
		return ucenici;
	}

	/**
	 * Metoda koja vraca niz predmeta 
	 * @return niz objekata klase Predmet
	 */
	public Predmet[] getPredmeti() {
		return predmeti;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Odeljenje(atribute imeRazrednog i redniBroj)
	 * @return true ako se poklapaju svi atributi
	 * @return false ako se atributi ne poklapaju
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Odeljenje))
			throw new RuntimeException("Uneti objekat nije odeljenje.");
		Odeljenje o = (Odeljenje)obj;
		if(o.imeRazrednog.equals(imeRazrednog) && o.redniBroj==redniBroj)
			return true;
		return false;
	}
	
	
}
