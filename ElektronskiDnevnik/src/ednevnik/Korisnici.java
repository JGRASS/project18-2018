package ednevnik;

import java.util.LinkedList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import ednevnik.interfejs.KorisniciInterfejs;
import ednevnik.sistemskeoperacije.SODeserijalizujProfesore;
import ednevnik.sistemskeoperacije.SODeserijalizujRoditelje;
import ednevnik.sistemskeoperacije.SODodajProfesora;
import ednevnik.sistemskeoperacije.SODodajRoditelje;
import ednevnik.sistemskeoperacije.SOObrisiProfesora;
import ednevnik.sistemskeoperacije.SOPorediProfesora;
import ednevnik.sistemskeoperacije.SOPrikaziSveProfesore;
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
	
	public void dodajProfesora(LinkedList<Profesor> profesori, Profesor prof) {
		
		profesori = SODeserijalizujProfesore.izvrsi();
		
		SODodajProfesora.izvrsi(prof,profesori);
		
		SOSerijalizujProfesora.izvrsi(profesori);
	}
	
	public void dodajRoditelja(Roditelj rod) {
		SODodajRoditelje.izvrsi(rod, roditelji);
	}

	@Override
	public void serijalizujRod(LinkedList<Roditelj> roditelji) {
		SOSerijalizujRoditelja.izvrsi(roditelji);
	}

	@Override
	public void serijalizujProf(LinkedList<Profesor> profesori) {
		SOSerijalizujProfesora.izvrsi(profesori);
	}

	@Override
	public void deserijalizujRod(LinkedList<Roditelj> roditelji) {
		roditelji = SODeserijalizujRoditelje.izvrsi();
	}

	@Override
	public void deserijalizujProf(LinkedList<Profesor> profesori) {
		profesori = SODeserijalizujProfesore.izvrsi();
	}

	@Override
	public boolean uporediRoditelja(String korisnickoIme,String sifra) {
		return SOUporediRoditelja.izvrsi(korisnickoIme, sifra, roditelji);
	}

	@Override
	public boolean uporediProfesora(String korisnickoIme, String sifra) {
		return SOPorediProfesora.izvrsi(korisnickoIme, sifra, profesori);
	}

	@Override
	public void obrisiProfesora(LinkedList<Profesor> profesori, String imePrezime) {
		
		profesori = SODeserijalizujProfesore.izvrsi();
		
		SOObrisiProfesora.izvrsi(profesori, imePrezime);
		
		SOSerijalizujProfesora.izvrsi(profesori);
	}

	@Override
	public String prikaziSveProfesore() {
		return SOPrikaziSveProfesore.izvrsi(profesori);
		
	}
	
	
}
