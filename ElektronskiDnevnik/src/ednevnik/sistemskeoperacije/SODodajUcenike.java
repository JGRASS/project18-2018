package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Razred;
import ednevnik.Ucenik;

public class SODodajUcenike {

	public static void izvrsi (Ucenik ucenik, LinkedList<Razred> razredi, int brojRazreda, 
			int brojOdeljenja) {
		
		if (ucenik == null)
			throw new RuntimeException("Ucenik ne sme biti null!");
		
		if (brojRazreda < 1 || brojOdeljenja > 8)
			throw new RuntimeException("Broj razreda mora biti izmedju 1 i 8!");
		
		if (brojOdeljenja < 1 || brojOdeljenja > razredi.get(brojRazreda).getOdeljenja().size())
			throw new RuntimeException("Broj odeljenja ne sme biti veci od postojeceg broja"
					+ " odeljenja odabranog razreda ili manji od 1!");
		
		if(razredi.get(brojRazreda).getOdeljenja().get(brojOdeljenja).getUcenici().contains(ucenik))
			throw new RuntimeException("Dato odeljenje vec sadrzi datog ucenika!");
		
		razredi.get(brojRazreda).getOdeljenja().get(brojOdeljenja).getUcenici().add(ucenik);
	}
}
