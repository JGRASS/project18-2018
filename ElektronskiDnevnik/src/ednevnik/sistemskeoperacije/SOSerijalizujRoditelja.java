package ednevnik.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import ednevnik.Roditelj;

public class SOSerijalizujRoditelja {
	public static void izvrsi(LinkedList<Roditelj> roditelji) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Roditelji.out")))){
			out.writeObject(roditelji);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
