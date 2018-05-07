package ednevnik.sistemskeoperacije;

import ednevnik.Predmet;

public class SODodajPlanCasovaPredmetu {

	public static void izvrsi (String plan, Predmet predmet) {
		
		if (plan == null || plan == "")
			throw new RuntimeException("String mora postojati!");
		
		predmet.getPlanCasova().add(plan);
	}
}
