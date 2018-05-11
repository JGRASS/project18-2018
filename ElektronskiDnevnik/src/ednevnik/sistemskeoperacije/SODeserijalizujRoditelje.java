package ednevnik.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import ednevnik.Roditelj;



public class SODeserijalizujRoditelje {
	public static void izvrsi(LinkedList<Roditelj> roditelji) {
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Roditelji.out")))){
			roditelji.clear();
			try {
				while(true) {
					Roditelj r = (Roditelj)(in.readObject());
					roditelji.add(r);
				}
			} catch (EOFException e) {}
			in.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
