package ednevnik;

import java.util.LinkedList;

import ednevnik.sistemskeoperacije.SODodajNapomenuUceniku;
import ednevnik.sistemskeoperacije.SODodajOceneUceniku;
import ednevnik.sistemskeoperacije.SODodajOdeljenje;
import ednevnik.sistemskeoperacije.SODodajPlanCasovaPredmetu;
import ednevnik.sistemskeoperacije.SODodajRazred;
import ednevnik.sistemskeoperacije.SODodajUcenike;
import ednevnik.sistemskeoperacije.SOVratiUcenika;

public class EDnevnik implements EDnevnikInterfejs {
	private LinkedList<Razred> razredi;
	private String skolskaGodina;
	
	public LinkedList<Razred> getRazredi() {
		return razredi;
	}
	
	public String getSkolskaGodina() {
		return skolskaGodina;
	}
	public void setSkolskaGodina(String skolskaGodina) {
		if(skolskaGodina==null || skolskaGodina.equals(""))
			throw new RuntimeException("Morate uneti skolsku godinu.");
		
		this.skolskaGodina = skolskaGodina;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EDnevnik))
			throw new RuntimeException("Uneti objekat nije dnevnik.");
		EDnevnik ed = (EDnevnik)obj;
		if(ed.skolskaGodina.equals(skolskaGodina))
			return true;
		return false;
	}

	@Override
	public void dodajRazred(Razred razred) {
		SODodajRazred.izvrsi(razred, razredi);
	}

	@Override
	public void dodajOdeljenje(Odeljenje odeljenje, int brojRazreda) {
		SODodajOdeljenje.izvrsi(odeljenje, razredi, brojRazreda);
	}

	@Override
	public void dodajUcenike(Ucenik ucenik, int brojRazreda, int brojOdeljenja) {
		SODodajUcenike.izvrsi(ucenik, razredi, brojRazreda, brojOdeljenja);
	}

	@Override
	public void dodajOceneUceniku(Ocena ocena, Ucenik ucenik) {
		SODodajOceneUceniku.izvrsi(ocena, ucenik);
	}
 
	@Override
	public void dodajNapomenuUceniku(String napomena, Ucenik ucenik) {
		SODodajNapomenuUceniku.izvrsi(napomena, ucenik);
	}

	@Override
	public void dodajPlanCasovaPredmetu(String plan, Predmet predmet) {
		SODodajPlanCasovaPredmetu.izvrsi(plan, predmet);
	}
	
	@Override
	public Ucenik vratiUcenika(int razred, int odeljenje, String imePrezime, String imeRoditelja) {
		return SOVratiUcenika.izvrsi(razredi, razred, odeljenje, 
				imePrezime, imeRoditelja);
	}
	
}
