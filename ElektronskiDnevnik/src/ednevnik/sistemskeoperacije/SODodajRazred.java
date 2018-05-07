package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Razred;

public class SODodajRazred {

	public static void izvrsi (Razred razred, LinkedList<Razred> razredi) {
		if (razred == null)
			throw new RuntimeException("Razred ne sme biti null!");
		
		if (razredi.contains(razred))
			throw new RuntimeException("Razred vec postoji u dnevniku!");
		
		razredi.add(razred);
	}
}
