package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Profesor;

public class SODodajProfesora {

	public static LinkedList<Profesor> izvrsi(String imePrezime,String korisnickoIme, String sifra,LinkedList<Profesor> profesori) {
		Profesor p = new Profesor();
		
		p.setImePrezime(imePrezime);
		p.setKorisnicnoIme(korisnickoIme);
		p.setSifra(sifra);
		
		profesori.add(p);
		
		return profesori;
	}
}
