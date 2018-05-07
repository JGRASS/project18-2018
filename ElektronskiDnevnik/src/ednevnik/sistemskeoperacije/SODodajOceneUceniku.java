package ednevnik.sistemskeoperacije;

import ednevnik.Ocena;
import ednevnik.Ucenik;

public class SODodajOceneUceniku {

	public static void izvrsi (Ocena ocena, Ucenik ucenik) {
		
		if (ocena == null)
			throw new RuntimeException("Ocena ne sme biti null!");
		
		if (ocena.getBrOcene() < 1 || ocena.getBrOcene() > 5)
			throw new RuntimeException("Ocena mora biti izmedju 1 i 5!");
		
		ucenik.getOcene().add(ocena);
	}
}
