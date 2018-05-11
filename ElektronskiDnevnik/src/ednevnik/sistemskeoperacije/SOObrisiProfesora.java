package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Profesor;

public class SOObrisiProfesora {

	public static void izvrsi (LinkedList<Profesor> profesori, String imePrezime) {
		
		if (imePrezime == null || profesori == null)
			throw new RuntimeException();
		
		for (int i = 0; i < profesori.size(); i++) {
			if (profesori.get(i).getImePrezime().equals(imePrezime))
				profesori.remove(i);
		}
	}
}
