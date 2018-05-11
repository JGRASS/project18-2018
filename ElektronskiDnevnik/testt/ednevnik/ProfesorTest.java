package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProfesorTest {

	Profesor p;
	
	@Before
	public void setUp() throws Exception {
		 p = new Profesor();
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrezimeNull() {
		p.setImePrezime(null);		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrezimePrazan() {
		p.setImePrezime("");		
	}
	
	@Test
	public void testSetImePrezime() {
		p.setImePrezime("Milos");
		
		assertEquals(p.getImePrezime(), "Milos");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnickoImeNull() {
		p.setImePrezime(null);		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnickoImePrazan() {
		p.setImePrezime("");		
	}
	
	@Test
	public void testSetKorisnickoIme() {
		p.setImePrezime("Milos");
		
		assertEquals(p.getImePrezime(), "Milos");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSifraNull() {
		p.setSifra(null);	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSifraPrazan() {
		p.setSifra("");		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSifraKraciOd8() {
		p.setSifra("123");		
	}
	
	@Test
	public void testSifra() {
		p.setSifra("123456789");
		
		assertEquals(p.getSifra(), "123456789");
	}
	
	@Test
	public void testEqualsObjectTrue() {
		p.setSifra("123456789");
		p.setImePrezime("Milos");
		p.setKorisnicnoIme("mm");
		
		Profesor a = new Profesor();
		
		a.setSifra("123456789");
		a.setKorisnicnoIme("mm");
		a.setImePrezime("Milos");
		
		assertTrue(p.equals(a));
	}
}
