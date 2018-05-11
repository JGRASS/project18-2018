package ednevnik;

import java.io.Serializable;

/**
 * Klasa koja sadrzi atribute imePrezime, jmbg, korisnickoIme i sifru roditelja
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Roditelj implements Serializable {
	
	/**
	 * Atribut koji pokazuje ime i prezime roditelja
	 */
	private String imePrezime;
	
	/**
	 * Atribut koji pokazuje jmbg ucenika
	 */
	private String jmbg;
	
	/**
	 * Atribut koji pokazuje korisnicko ime roditelja
	 */
	private String korisnickoIme;
	
	/**
	 * Atribut koji pokazuje sifru roditelja
	 */
	private String sifra;
	
	
	/**
	 * Metoda koja vraca ime i prezime roditelja
	 * @return ime i prezime kao jedan String
	 */
	public String getImePrezime() {
		return imePrezime;
	}
	
	/**
	 * Metoda koja postavlja atribut imePrezime na odredjenu vrijednost
	 * @param imePrezime - nova vrijednost
	 */
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime:");
		
		this.imePrezime = imePrezime;
	}
	
	/**
	 * Metoda koja vraca jbmg roditelj
	 * @return jmbg kao string
	 */
	public String getJmbg() {
		return jmbg;
	}
	
	/**
	 * Metoda koja postavlja atribut jmbg na novu vrijednost
	 * @param jmbg - nova vrijednost
	 */
	public void setJmbg(String jmbg) {
		if(jmbg==null || jmbg.equals("") || jmbg.length()!=13)
			throw new RuntimeException("Unesite JMBG (13 brojeva!):");
		
		this.jmbg = jmbg;
	}
	
	/**
	 * Metoda koja vraca korisnicko ime roditelja
	 * @return koricniskoIme kao string
	 */
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	
	/**
	 * Metoda koja postavlja koricnisko ime na novu vrijednost
	 * @param korisnickoIme - nova vrijednost
	 */
	public void setKorisnickoIme(String korisnickoIme) {
		if(korisnickoIme==null || korisnickoIme.equals(""))
			throw new RuntimeException("Unesite korisnicko ime:");
		
		this.korisnickoIme = korisnickoIme;
	}
	
	/**
	 * Metoda koja vraca sifru roditelja
	 * @return sifra kao string
	 */
	public String getSifra() {
		return sifra;
	}
	
	/**
	 * Metoda koja postavlja sifru na novu vrijednost
	 * @param sifra - nova vrijednost
	 */
	public void setSifra(String sifra) {
		if(sifra==null || sifra.equals("") || sifra.length()<8)
			throw new RuntimeException("Unesite sifru od najmanje 8 znakova:");
		
		this.sifra = sifra;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imePrezime == null) ? 0 : imePrezime.hashCode());
		result = prime * result + ((jmbg == null) ? 0 : jmbg.hashCode());
		result = prime * result + ((korisnickoIme == null) ? 0 : korisnickoIme.hashCode());
		result = prime * result + ((sifra == null) ? 0 : sifra.hashCode());
		return result;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Roditelj(njihove atribute imePrezime, jmbg, koricniskoIme i sifru)
	 * @return true ako se poklapaju svi atributi
	 * @return false ako se ne poklapaju svi atributi
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roditelj other = (Roditelj) obj;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equals(other.imePrezime))
			return false;
		if (jmbg == null) {
			if (other.jmbg != null)
				return false;
		} else if (!jmbg.equals(other.jmbg))
			return false;
		if (korisnickoIme == null) {
			if (other.korisnickoIme != null)
				return false;
		} else if (!korisnickoIme.equals(other.korisnickoIme))
			return false;
		if (sifra == null) {
			if (other.sifra != null)
				return false;
		} else if (!sifra.equals(other.sifra))
			return false;
		return true;
	}
	
	
	
	
}
