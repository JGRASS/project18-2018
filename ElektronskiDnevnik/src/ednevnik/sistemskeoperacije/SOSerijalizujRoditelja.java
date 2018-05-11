package ednevnik.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import ednevnik.Roditelj;

public class SOSerijalizujRoditelja {
	public static void izvrsi(Roditelj d) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Roditelji.out")))){
			out.writeObject(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
