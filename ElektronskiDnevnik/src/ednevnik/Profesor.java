package ednevnik;

/**
 * Klasa koja sadrzi atribute imePrezime profesora, koriscnikoIme profesora i sifru profesora 
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Profesor {
	
	/**
	 * Atribut koji predstavlja ime i prezime profesora
	 */
	private String imePrezime;
	
	/**
	 * Atribut koji predstavlja koricnisko ime profesora
	 */
	private String korisnickoIme;
	
	/**
	 * Atribut koji predstavlja sifru za prijavljivanje profesora u dnevnik
	 */
	private String sifra;
	
	
	/**
	 * Metoda koja vraca ime i prezime profesora
	 * @return ime i prezime kao String
	 */
	public String getImePrezime() {
		return imePrezime;
	}
	
	/**
	 * Metoda koja postavlja atribut imePrezime na novu vrijednost
	 * @param imePrezime nova vrijednost
	 * @throws java.land.RuntimeExcpetion ako se kao parametar unese null ili prazan String
	 */
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime:");
		
		this.imePrezime = imePrezime;
	}
	
	/**
	 * Metoda koja vraca korisnicko ime profesora
	 * @return korisnicko ime kao String
	 */
	public String getKorisnicnoIme() {
		return korisnickoIme;
	}
	
	/**
	 * Metoda koja postavlja atribut korisncikoIme na novu vrijednost
	 * @param korisnickoIme nova vrijednost
	 * @throws java.land.RuntimeExcpetion ako se ako parametar unese null ili prazan String
	 */
	public void setKorisnicnoIme(String korisnickoIme) {
		if(korisnickoIme==null || korisnickoIme.equals(""))
			throw new RuntimeException("Unesite korisnicko ime:");
		
		this.korisnickoIme = korisnickoIme;
	}
	
	/**
	 * Metoda koja vraca sifru profesora
	 * @return sifru kao String
	 */
	public String getSifra() {
		return sifra;
	}
	
	/**
	 * Metoda koja postavlja atribut sifra na novu vrijednost
	 * @param sifra nova vrijednost
	 * @throws java.land.RuntimeExcpetion ako se kao parametar unese null, prazan String ili String kraci od 8 karaktera
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
		result = prime * result + ((korisnickoIme == null) ? 0 : korisnickoIme.hashCode());
		result = prime * result + ((sifra == null) ? 0 : sifra.hashCode());
		return result;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Profesor(poredi njihove atribute imePrezime, korisnickoIme i sifra)
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
		Profesor other = (Profesor) obj;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equals(other.imePrezime))
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
