package ednevnik;

import java.util.LinkedList;

import ednevnik.interfejs.KorisniciInterfejs;
import ednevnik.sistemskeoperacije.SODeserijalizujProfesore;
import ednevnik.sistemskeoperacije.SODeserijalizujRoditelje;
import ednevnik.sistemskeoperacije.SODodajProfesora;
import ednevnik.sistemskeoperacije.SODodajRoditelje;
import ednevnik.sistemskeoperacije.SOPorediProfesora;
import ednevnik.sistemskeoperacije.SOSerijalizujProfesora;
import ednevnik.sistemskeoperacije.SOSerijalizujRoditelja;
import ednevnik.sistemskeoperacije.SOUporediRoditelja;

public class Korisnici implements KorisniciInterfejs {
	private LinkedList<Roditelj> roditelji = new LinkedList<Roditelj>();
	private LinkedList<Profesor> profesori = new LinkedList<Profesor>();
	
	public LinkedList<Roditelj> getRoditelji() {
		return roditelji;
	}
	
	public LinkedList<Profesor> getProfesori() {
		return profesori;
	}
	
	public void dodajProfesora(Profesor prof) {
		SODodajProfesora.izvrsi(prof,profesori);
	}
	
	public void dodajRoditelja(Roditelj rod) {
		SODodajRoditelje.izvrsi(rod, roditelji);
	}

	@Override
	public void serijalizujRod(Roditelj r) {
		SOSerijalizujRoditelja.izvrsi(r);
	}

	@Override
	public void serijalizujProf(Profesor p) {
		SOSerijalizujProfesora.izvrsi(p);
	}

	@Override
	public void deserijalizujRod(LinkedList<Roditelj> roditelji) {
		SODeserijalizujRoditelje.izvrsi(roditelji);
	}

	@Override
	public void deserijalizujProf(LinkedList<Profesor> profesori) {
		SODeserijalizujProfesore.izvrsi(profesori);
	}

	@Override
	public boolean uporediRoditelja(String korisnickoIme,String sifra) {
		return SOUporediRoditelja.izvrsi(korisnickoIme, sifra, roditelji);
	}

	@Override
	public boolean uporediProfesora(String korisnickoIme, String sifra) {
		return SOPorediProfesora.izvrsi(korisnickoIme, sifra, profesori);
	}
	
	
}
