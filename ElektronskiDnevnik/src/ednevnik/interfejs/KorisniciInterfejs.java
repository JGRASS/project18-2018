package ednevnik.interfejs;

import java.util.LinkedList;

import ednevnik.Profesor;
import ednevnik.Roditelj;

public interface KorisniciInterfejs {
	public void dodajProfesora(Profesor prof);
	public void dodajRoditelja(Roditelj r);
	public void serijalizujRod(LinkedList<Roditelj> roditelji);
	public void serijalizujProf(LinkedList<Profesor> profesori);
	public void deserijalizujRod(LinkedList<Roditelj> roditelji);
	public void deserijalizujProf(LinkedList<Profesor> profesori);
	public boolean uporediRoditelja(String korisnickoIme,String sifra);
	public boolean uporediProfesora(String korisnickoIme,String sifra);
	public void obrisiProfesora (LinkedList<Profesor> profesori, String imePrezime);
}
