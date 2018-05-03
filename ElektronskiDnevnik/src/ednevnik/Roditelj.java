package ednevnik;

public class Roditelj {
	private String imePrezime;
	private String jmbg;
	private String korisnickoIme;
	private String sifra;
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime:");
		
		this.imePrezime = imePrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		if(jmbg==null || jmbg.equals("") || jmbg.length()!=13)
			throw new RuntimeException("Unesite JMBG (13 brojeva!):");
		
		this.jmbg = jmbg;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		if(korisnickoIme==null || korisnickoIme.equals(""))
			throw new RuntimeException("Unesite korisnicko ime:");
		
		this.korisnickoIme = korisnickoIme;
	}
	public String getSifra() {
		return sifra;
	}
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
