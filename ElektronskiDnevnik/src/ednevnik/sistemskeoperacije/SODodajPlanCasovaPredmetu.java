package ednevnik.sistemskeoperacije;

import ednevnik.Predmet;

/**
 * Klasa koja sadrzi metodu SODodajPlanCasovaPredmetu
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajPlanCasovaPredmetu {

	/**
	 * Metoda koja dodaje plan casa za odredjeni predmet
	 * @param plan casa
	 * @param predmet za koji se dodaje plan
	 */
	public static void izvrsi (String plan, Predmet predmet) {
		
		if (plan == null || plan == "")
			throw new RuntimeException("String mora postojati!");
		
		predmet.getPlanCasova().add(plan);
	}
}
