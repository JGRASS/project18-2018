package ednevnik;

import java.util.LinkedList;

/**
 * Klasa koja sadrzi naziv predmeta, listu Stringova koja sadrzi plan casova i ime profesora tog predmeta
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class Predmet {
	
	/**
	 * Atribut koji pokazuje naziv predmeta
	 */
	private String naziv;
	
	/**
	 * Lista koja sadrzi objekte klase String
	 */
	private LinkedList<String> planCasova;
	
	/**
	 * Atribut koji pokazuje ime profesora tog predemeta
	 */
	private String imeProfesora;
	
	
	/**
	 * Metoda koja vraca naziv predmeta
	 * @return naziv kao String
	 */
	public String getNaziv() {
		return naziv;
	}
	
	/**
	 * Metoda koja postavlja atribut naziv na novu vrijednost
	 * @param naziv nova vrijednost
	 * @throws java.land.RuntimeEcxpetion ako se kao paramtera unese null ili prazan String
	 */
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.equals(""))
			throw new RuntimeException("Morate uneti naziv predmeta:");
		this.naziv = naziv;
	}
	
	/**
	 * Metoda koja vraca listu objekata klase String koja predstavlja plan casova
	 * @return listu objekata klase String
	 */
	public LinkedList<String> getPlanCasova() {
		return planCasova;
	}
	
	/**
	 * Metoda koja vraca ime profesora tog predmeta
	 * @return ime kao String
	 */
	public String getImeProfesora() {
		return imeProfesora;
	}
	
	/**
	 * Metoda koja postavlja atribut imeProfesora na novu vrijednost
	 * @param imeProfesora nova vrijednost
	 * @throws java.land.RuntimeExcpetion ako se kao parametar unese null ili prazan String
	 */
	public void setImeProfesora(String imeProfesora) {
		if(imeProfesora==null || imeProfesora.equals(""))
			throw new RuntimeException("Morate uneti ime i prezime profesora:");
		
		this.imeProfesora = imeProfesora;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imeProfesora == null) ? 0 : imeProfesora.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((planCasova == null) ? 0 : planCasova.hashCode());
		return result;
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase Predmet(njihove atribute imeProfesora, naziv i planCasova)
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
		Predmet other = (Predmet) obj;
		if (imeProfesora == null) {
			if (other.imeProfesora != null)
				return false;
		} else if (!imeProfesora.equals(other.imeProfesora))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (planCasova == null) {
			if (other.planCasova != null)
				return false;
		} else if (!planCasova.equals(other.planCasova))
			return false;
		return true;
	}
	
	
	
}
