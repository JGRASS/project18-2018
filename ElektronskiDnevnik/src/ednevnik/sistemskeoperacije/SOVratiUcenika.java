package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Odeljenje;
import ednevnik.Razred;
import ednevnik.Ucenik;

/**
 * Klasa koja sadrzi metodu SOVratiUcenika
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SOVratiUcenika {

	/**
	 * Metoda koja pronalazi ucenika u listi i vraca ga
	 * @param razredi lista razreda
	 * @param razred redni broj razreda
	 * @param odeljenje broj odeljenja
	 * @param imePrezime ucenika
	 * @param imeRoditelja ucenika
	 * @return ucenika kao objekat klase Ucenik
	 */
	public static Ucenik izvrsi (LinkedList<Razred> razredi, int razred, int odeljenje, String imePrezime, 
			String imeRoditelja) {
		
		Ucenik ucenik = null;
		
		for (int i = 0; i < razredi.size(); i ++) {
			Razred r = razredi.get(i);
			if(r.getRedniBroj() == razred) {
				for (int j = 0; j < r.getOdeljenja().size(); j ++) {
					Odeljenje o = r.getOdeljenja().get(j);
					if (o.getRedniBroj() == odeljenje) {
						for (int k = 0; k < o.getUcenici().size(); k ++) {
							Ucenik u = o.getUcenici().get(k);
							if(u.getImePrezime().equalsIgnoreCase(imePrezime) &&
									u.getImeRoditelja().equalsIgnoreCase(imeRoditelja))
								ucenik = u;
						}
					}
				}
			}
		}
		
		return ucenik;
	}
}
