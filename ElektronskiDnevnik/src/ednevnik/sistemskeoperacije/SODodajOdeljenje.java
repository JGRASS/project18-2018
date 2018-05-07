package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Odeljenje;
import ednevnik.Razred;

public class SODodajOdeljenje {

	public static void izvrsi (Odeljenje odeljenje, LinkedList<Razred> razredi, int brojRazreda) {
		
		if (odeljenje == null)
			throw new RuntimeException("Odeljenje ne sme biti null!");
		
		if (brojRazreda < 1 || brojRazreda > 8)
			throw new RuntimeException("Broj razreda mora biti izmedju 1 i 8!");
		
		if (razredi.get(brojRazreda).getOdeljenja().contains(odeljenje))
			throw new RuntimeException("U ovom razredu vec postoji ovo odeljenje!");
		
		razredi.get(brojRazreda).getOdeljenja().add(odeljenje);
	}
}
