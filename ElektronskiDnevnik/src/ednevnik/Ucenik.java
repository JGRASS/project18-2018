package ednevnik;

import java.util.LinkedList;

public class Ucenik {
	private String imePrezime;
	private String imeRoditelja;
	private String jmbg;
	private LinkedList<Ocena> ocene;
	private int opravdaniIzostanci;
	private int neopravdaniIzostanci;
	private LinkedList<String> napomene;
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime i prezime:");
		
		this.imePrezime = imePrezime;
	}
	public String getImeRoditelja() {
		return imeRoditelja;
	}
	public void setImeRoditelja(String imeRoditelja) {
		if(imeRoditelja==null || imeRoditelja.equals(""))
			throw new RuntimeException("Unesite ime i prezime roditelja:");
		
		this.imeRoditelja = imeRoditelja;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		if(jmbg==null || jmbg.equals("") || jmbg.length()!=13)
			throw new RuntimeException("Unesite JMBG (13 brojeva!):");
		
		this.jmbg = jmbg;
	}
	public int getOpravdaniIzostanci() {
		return opravdaniIzostanci;
	}
	public void setOpravdaniIzostanci(int opravdaniIzostanci) {
		if(opravdaniIzostanci<0)
			throw new RuntimeException ("Broj oprvdanih ne sme biti manji od 0:");
		
		this.opravdaniIzostanci = opravdaniIzostanci;
	}
	public int getNeopravdaniIzostanci() {
		return neopravdaniIzostanci;
	}
	public void setNeopravdaniIzostanci(int neopravdaniIzostanci) {
		if(neopravdaniIzostanci<0)
			throw new RuntimeException ("Broj  neopravdanih ne sme biti manji od 0:");
		
		this.neopravdaniIzostanci = neopravdaniIzostanci;
	}
	public LinkedList<Ocena> getOcene() {
		return ocene;
	}
	
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
	
	
	
	
	
}
