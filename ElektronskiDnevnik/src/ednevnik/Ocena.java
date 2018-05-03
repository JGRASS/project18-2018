package ednevnik;

public class Ocena {
	private int brOcene;
	private String predmet;
	private String opis;
	private int polugodiste;
	public int getBrOcene() {
		return brOcene;
	}
	public void setBrOcene(int brOcene) {
		if(brOcene<1 || brOcene>5)
			throw new RuntimeException("Morate uneti ocenu od 1-5:");
		this.brOcene = brOcene;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		if(predmet==null || predmet.equals(""))
			throw new RuntimeException("Morate uneti naziv predmeta:");
		this.predmet = predmet;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis==null || opis.equals(""))
			throw new RuntimeException("Morate uneti opis:");
		
		this.opis = opis;
	}
	public int getPolugodiste() {
		return polugodiste;
	}
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
