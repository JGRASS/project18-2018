package ednevnik;

import java.util.LinkedList;

/**
 * Klasa koja sadrzi atribute imePrezime, imeRoditelja, jmbg, listu ocena, opravdaneIzostanke, neopravdaneIzostanke,listu napomena
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Ucenik {
	
	/**
	 * Atribut koji pokazuje ime i prezime ucenika
	 */
	private String imePrezime;
	
	/**
	 * Atribut koji pokazuje ime i prezime roditelja ucenika
	 */
	private String imeRoditelja;
	
	/**
	 * Atribut koji pokazuje jmbg ucenika
	 */
	private String jmbg;
	
	/**
	 * Lista objekata klase Ocena
	 */
	private LinkedList<Ocena> ocene;
	
	/**
	 * Atribut koji pokazuje opravdane izostanke
	 */
	private int opravdaniIzostanci;
	
	/**
	 * Atribut koji pokazuje neopravdane izostanke
	 */
	private int neopravdaniIzostanci;
	/**
	 * Lista objekata klase String
	 */
	private LinkedList<String> napomene;
	
	/**
	 * Metoda koja vraca ime i prezime ucenika
	 * @return ime i prezime kao jedan String
	 */
	public String getImePrezime() {
		return imePrezime;
	}
	
	/**
	 * Metoda koja postavlja vrijednost atributa imePrezime na novu vrijednost
	 * @param imePrezime - nova vrijednost
	 */
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime i prezime:");
		
		this.imePrezime = imePrezime;
	}
	
	/**
	 * Metoda koja vraca ime roditelja 
	 * @return ime kao String
	 */
	public String getImeRoditelja() {
		return imeRoditelja;
	}
	
	/**
	 * Metoda koja postavlja imeRoditelja na novu vrijednost
	 * @param imeRoditelja - nova vrijednost
	 */
	public void setImeRoditelja(String imeRoditelja) {
		if(imeRoditelja==null || imeRoditelja.equals(""))
			throw new RuntimeException("Unesite ime i prezime roditelja:");
		
		this.imeRoditelja = imeRoditelja;
	}
	
	/**
	 * Metoda koja vraca jmbg ucenika
	 * @return jmbg kao String
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
	 * Metoda koja vraca opravdane izostanke
	 * @return opravdane izostanke kao int
	 */
	public int getOpravdaniIzostanci() {
		return opravdaniIzostanci;
	}
	
	/**
	 * Metoda koja postavlja atribut opravdaniIzostanci na novu vrijednost 
	 * @param opravdaniIzostanci - nova vrijednost
	 */
	public void setOpravdaniIzostanci(int opravdaniIzostanci) {
		if(opravdaniIzostanci<0)
			throw new RuntimeException ("Broj oprvdanih ne sme biti manji od 0:");
		
		this.opravdaniIzostanci = opravdaniIzostanci;
	}
	
	/**
	 * Metoda koja vraca neopravdane izostanke
	 * @return neopravdane izostanke kao int
	 */
	public int getNeopravdaniIzostanci() {
		return neopravdaniIzostanci;
	}
	
	/**
	 * Metoda koja postavlja atribut neopravdaniIzostanci na novu vrijednost 
	 * @param neopravdaniIzostanci - nova vrijednost
	 */
	public void setNeopravdaniIzostanci(int neopravdaniIzostanci) {
		if(neopravdaniIzostanci<0)
			throw new RuntimeException ("Broj  neopravdanih ne sme biti manji od 0:");
		
		this.neopravdaniIzostanci = neopravdaniIzostanci;
	}
	
	/**
	 * Metoda koja vraca listu ocena
	 * @return ocene kao listu
	 */
	public LinkedList<Ocena> getOcene() {
		return ocene;
	}
	
	/**
	 * Metoda koja vraca listu napomena
	 * @return napomene kao listu
	 */
	public LinkedList<String> getNapomene() {
		return napomene;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imePrezime == null) ? 0 : imePrezime.hashCode());
		result = prime * result + ((imeRoditelja == null) ? 0 : imeRoditelja.hashCode());
		result = prime * result + ((jmbg == null) ? 0 : jmbg.hashCode());
		result = prime * result + ((napomene == null) ? 0 : napomene.hashCode());
		result = prime * result + neopravdaniIzostanci;
		result = prime * result + ((ocene == null) ? 0 : ocene.hashCode());
		result = prime * result + opravdaniIzostanci;
		return result;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Ucenik(njihove atribute imePrezime, imeRoditelja, jmbg, napomene, neopravdaniIzostanci, opravdaniIzostanci)
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
		Ucenik other = (Ucenik) obj;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equals(other.imePrezime))
			return false;
		if (imeRoditelja == null) {
			if (other.imeRoditelja != null)
				return false;
		} else if (!imeRoditelja.equals(other.imeRoditelja))
			return false;
		if (jmbg == null) {
			if (other.jmbg != null)
				return false;
		} else if (!jmbg.equals(other.jmbg))
			return false;
		if (napomene == null) {
			if (other.napomene != null)
				return false;
		} else if (!napomene.equals(other.napomene))
			return false;
		if (neopravdaniIzostanci != other.neopravdaniIzostanci)
			return false;
		if (ocene == null) {
			if (other.ocene != null)
				return false;
		} else if (!ocene.equals(other.ocene))
			return false;
		if (opravdaniIzostanci != other.opravdaniIzostanci)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ucenik [imePrezime=" + imePrezime + ", imeRoditelja=" + imeRoditelja + ", jmbg=" + jmbg + ", ocene="
				+ ocene + ", opravdaniIzostanci=" + opravdaniIzostanci + ", neopravdaniIzostanci="
				+ neopravdaniIzostanci + ", napomene=" + napomene + "]";
	}
		
}
