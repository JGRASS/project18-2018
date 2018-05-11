package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Roditelj;

public class SODodajRoditelje {
	public static void izvrsi (Roditelj rod,LinkedList<Roditelj> roditelji) {
		if(rod==null || roditelji.contains(rod))
			throw new RuntimeException();
		
		roditelji.add(rod);
	}
}
