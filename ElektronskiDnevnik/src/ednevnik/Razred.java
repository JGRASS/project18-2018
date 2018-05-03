	package ednevnik;

import java.util.LinkedList;

public class Razred {
	private int redniBroj;
	private LinkedList<Odeljenje> odeljenja;
	
	public int getRedniBroj() {
		return redniBroj;
	}
	public void setRedniBroj(int redniBroj) {
		if(redniBroj<0 || redniBroj>8)
			throw new RuntimeException("Morate uneti razred od 1-8");
		this.redniBroj = redniBroj;
	}
	public LinkedList<Odeljenje> getOdeljenja() {
		return odeljenja;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Razred))
			throw new RuntimeException("Uneti objekat nije razred.");
		Razred r = (Razred)obj;
		if(r.getRedniBroj()==redniBroj)
			return true;
		return false;
	}
	
}
