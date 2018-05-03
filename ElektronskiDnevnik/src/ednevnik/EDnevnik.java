package ednevnik;

import java.util.LinkedList;

public class EDnevnik {
	private LinkedList<Razred> razredi;
	private String skolskaGodina;
	public LinkedList<Razred> getRazredi() {
		return razredi;
	}
	
	public String getSkolskaGodina() {
		return skolskaGodina;
	}
	public void setSkolskaGodina(String skolskaGodina) {
		if(skolskaGodina==null || skolskaGodina.equals(""))
			throw new RuntimeException("Morate uneti skolsku godinu.");
		
		this.skolskaGodina = skolskaGodina;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EDnevnik))
			throw new RuntimeException("Uneti objekat nije dnevnik.");
		EDnevnik ed = (EDnevnik)obj;
		if(ed.skolskaGodina.equals(skolskaGodina))
			return true;
		return false;
	}
	
	
	
	
}
