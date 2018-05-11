package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Profesor;

public class SOPrikaziSveProfesore {
	public static String izvrsi(LinkedList<Profesor> profesori) {
		String s = "";
		if(profesori==null)
			throw new RuntimeException();
		for(int i=0;i<profesori.size();i++) {
			s+=profesori.get(i).toString()+"\n";
		}
		return s;
	}
}
