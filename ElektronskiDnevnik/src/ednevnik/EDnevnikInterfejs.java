package ednevnik;

public interface EDnevnikInterfejs {

	public void dodajRazred (Razred razred);
	public void dodajOdeljenje (Odeljenje odeljenje, int brojRazreda);
	public void dodajUcenike (Ucenik ucenik, int brojRazreda, int brojOdeljenja);
}
