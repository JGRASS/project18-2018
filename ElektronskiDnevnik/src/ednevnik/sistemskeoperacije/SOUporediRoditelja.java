package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Roditelj;

public class SOUporediRoditelja {
	public static boolean izvrsi(String korisnickoIme, String sifra, LinkedList<Roditelj> roditelji) {
		if(korisnickoIme==null || sifra==null)
			throw new RuntimeException();
		for(int i=0;i<roditelji.size();i++)
			if(roditelji.get(i).getKorisnickoIme().equals(korisnickoIme) && roditelji.get(i).getSifra().equals(sifra))
				return true;
		return false;
	}
}
