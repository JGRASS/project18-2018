package ednevnik;

public interface EDnevnikInterfejs {

	public void dodajRazred (Razred razred);
	public void dodajOdeljenje (Odeljenje odeljenje, int brojRazreda);
	public void dodajUcenike (Ucenik ucenik, int brojRazreda, int brojOdeljenja);
	public void dodajOceneUceniku (Ocena ocena, Ucenik ucenik);
	public void dodajNapomenuUceniku (String napomena, Ucenik ucenik);
	public void dodajPlanCasovaPredmetu (String plan, Predmet predmet);
	public Ucenik vratiUcenika (int razred, int odeljenje, String imePrezime, 
			String imeRoditelja);
}
