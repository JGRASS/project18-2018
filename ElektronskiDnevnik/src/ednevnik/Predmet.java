package ednevnik;

import java.util.LinkedList;

public class Predmet {
	private String naziv;
	private LinkedList<String> planCasova;
	private String imeProfesora;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.equals(""))
			throw new RuntimeException("Morate uneti naziv predmeta:");
		this.naziv = naziv;
	}
	public LinkedList<String> getPlanCasova() {
		return planCasova;
	}
	public String getImeProfesora() {
		return imeProfesora;
	}
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
