package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Profesor;

public class SOPorediProfesora {
	public static boolean izvrsi(String korisnickoIme, String sifra, LinkedList<Profesor> profesori) {
		if(korisnickoIme==null || sifra==null)
			throw new RuntimeException();
		for(int i=0;i<profesori.size();i++)
			if(profesori.get(i).getKorisnicnoIme().equals(korisnickoIme) && profesori.get(i).getSifra().equals(sifra))
				return true;
		return false;
	}
}
