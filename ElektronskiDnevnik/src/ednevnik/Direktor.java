package ednevnik;

public class Direktor {
	private String imePrezime;
	private String sifra;
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime==null || imePrezime.equals(""))
			throw new RuntimeException("Unesite ime:");
		
		this.imePrezime = imePrezime;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		if(sifra==null || sifra.equals("") || sifra.length()<8)
			throw new RuntimeException("Unesite sifru od najmanje 8 znakova:");
		this.sifra = sifra;
	}
}
