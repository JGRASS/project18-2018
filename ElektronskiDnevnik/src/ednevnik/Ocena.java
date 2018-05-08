package ednevnik;

/**
 * Klasa koja sadrzi atribute brOcene, predmet, opis(pismena, usmena ocena ili kontrolni), polugodiste
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Ocena {
	
	/**
	 * Atribut koji pokazuje ocenu koju je djak dobio
	 */
	private int brOcene;
	
	/**
	 * Atribut koji pokazuje iz kog predmeta je djak dobio ocenu
	 */
	private String predmet;
	
	/**
	 * Atribut koji pokazuje da li ocena dobijena usmeno, pismeno ili iz kontrolnog
	 */
	private String opis;
	
	/**
	 * Zakljucna ocena na polugodistu
	 */
	private int polugodiste;
	
	/**
	 * Metoda koja vraca ocenu koju je djak dobio
	 * @return ocenu kao int
	 */
	public int getBrOcene() {
		return brOcene;
	}
	
	/**
	 * Metoda koja postavlja novu ocenu koju je djak dobio
	 * @param brOcene nova ocena
	 * @throws java.land.RuntimeException kada je ocena manja od 1 ili veca od 5
	 */
	public void setBrOcene(int brOcene) {
		if(brOcene<1 || brOcene>5)
			throw new RuntimeException("Morate uneti ocenu od 1-5:");
		this.brOcene = brOcene;
	}
	
	/**
	 * Metoda koja vraca predemt iz kojeg je ucenik dobio ocenu
	 * @return predmet kao String
	 */
	public String getPredmet() {
		return predmet;
	}
	
	/**
	 * Metoda koja postavlja novu vrijednost atributa predmet
	 * @param pedmet nova vrijednost
	 * @throws java.land.RuntimeException kada se unese kao parametar null ili prazan String
	 */
	public void setPredmet(String predmet) {
		if(predmet==null || predmet.equals(""))
			throw new RuntimeException("Morate uneti naziv predmeta:");
		this.predmet = predmet;
	}
	
	/**
	 * Metoda koja vraca opis ocene
	 * @return opis kao String
	 */
	public String getOpis() {
		return opis;
	}
	
	/**
	 * Metoda koja postavlja novu vrijednost atributa opis
	 * @param opis nova vrijednost
	 * @throws java.land.RuntimeException ako se kao parametar unese null ili prazan String
	 */
	public void setOpis(String opis) {
		if(opis==null || opis.equals(""))
			throw new RuntimeException("Morate uneti opis:");
		
		this.opis = opis;
	}
	
	/**
	 * Metoda koja vraca zakljucnu ocenu na polugodistu
	 * @return ocena kao int
	 */
	public int getPolugodiste() {
		return polugodiste;
	}
	
	/**
	 * Metoda koja postavlja novu vrijednost atributa polugodiste
	 * @param polugodiste nova vrijednost
	 */
	public void setPolugodiste(int polugodiste) {
		if(polugodiste<1 || polugodiste >2)
				throw new RuntimeException("Morate uneti polugodiste 1 ili 2");
		this.polugodiste = polugodiste;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brOcene;
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + polugodiste;
		result = prime * result + ((predmet == null) ? 0 : predmet.hashCode());
		return result;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Ocena(poredi njihove atribute brOcene, opis, polugodiste i predmet)
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
		Ocena other = (Ocena) obj;
		if (brOcene != other.brOcene)
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (polugodiste != other.polugodiste)
			return false;
		if (predmet == null) {
			if (other.predmet != null)
				return false;
		} else if (!predmet.equals(other.predmet))
			return false;
		return true;
	}
	
	
}
