package ednevnik;

/**
 * Klasa koja sadrzi ime i prezime direktora i njegovu sifru sa kojom moze da se uloguje, sa odgovarajucim get i set metodama
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */

public class Direktor {
	/**
	 * Atribut koji pokazuje ime i prezime direktora
	 */
	private String imePrezime;
	
	/**
	 * Atribut koji pokazuje sifru za prijavljivanje direktora
	 */
	private String sifra;
	
	/**
	 * Metoda koja vraca ime i prezime direktora
	 * @return imePrezime kao String
	 */
	public String getImePrezime() {
		return imePrezime;
	}
	
	/**
	 * Metoda koja postavlja imePrezime na odgovarajucu vrijednost
	 * @param imePrezime novo ime i prezime direktora
	 * @throws java.land.RuntimeException ako je parametar imePrezime null ili prazan string 
	 */
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime:");
		
		this.imePrezime = imePrezime;
	}
	
	/**
	 * Metoda koja vraca sifru
	 * @return sifra kao String
	 */
	public String getSifra() {
		return sifra;
	}
	
	/**
	 * Metoda koja postavlja sifru na odgovarajucu vrijednost
	 * @param sifra nova sifra direktora
	 * @throws java.land.RuntimeException ako je parametar sifra null, prazan string ili string kraci od 8 karaktera
	 */
	public void setSifra(String sifra) {
		if(sifra==null || sifra.equals("") || sifra.length()<8)
			throw new RuntimeException("Unesite sifru od najmanje 8 znakova:");
		this.sifra = sifra;
	}
}
