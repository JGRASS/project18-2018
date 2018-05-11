package ednevnik.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import ednevnik.Profesor;

public class SOSerijalizujProfesora {
	public static void izvrsi(Profesor p) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Profesori.out")))){
			out.writeObject(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
