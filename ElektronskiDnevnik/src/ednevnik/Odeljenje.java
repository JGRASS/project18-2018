package ednevnik;

import java.util.LinkedList;

public class Odeljenje {
	private int redniBroj;
	private String imeRazrednog;
	private LinkedList<Ucenik> ucenici;
	private Predmet[] predmeti;
	
	public int getRedniBroj() {
		return redniBroj;
	}
	public void setRedniBroj(int redniBroj) {
		if(redniBroj<1 || redniBroj>15)
			throw new RuntimeException("Redni broj odeljenja mora biti izmedju 1 i 15");
		this.redniBroj = redniBroj;
	}
	public String getImeRazrednog() {
		return imeRazrednog;
	}
	public void setImeRazrednog(String imeRazrednog) {
		if(imeRazrednog==null || imeRazrednog.equals(""))
			throw new RuntimeException("Morate uneti ime i prezime razrednog staresine:");
		
		this.imeRazrednog = imeRazrednog;
	}
	public LinkedList<Ucenik> getUcenici() {
		return ucenici;
	}

	public Predmet[] getPredmeti() {
		return predmeti;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Odeljenje))
			throw new RuntimeException("Uneti objekat nije odeljenje.");
		Odeljenje o = (Odeljenje)obj;
		if(o.imeRazrednog.equals(imeRazrednog) && o.redniBroj==redniBroj)
			return true;
		return false;
	}
	
	
}
