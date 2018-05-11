package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DirektorTest {
	
	Direktor d;

	@Before
	public void setUp() throws Exception {
		d = new Direktor();
	}

	@After
	public void tearDown() throws Exception {
		d = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrezimeNull() {
		d.setImePrezime(null);		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrezimePrazan() {
		d.setImePrezime("");		
	}
	
	@Test
	public void testSetImePrezime() {
		d.setImePrezime("Milos");
		
		assertEquals(d.getImePrezime(), "Milos");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSifraNull() {
		d.setSifra(null);	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSifraPrazan() {
		d.setSifra("");		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSifraKraciOd8() {
		d.setSifra("123");		
	}
	
	@Test
	public void testSifra() {
		d.setSifra("123456789");
		
		assertEquals(d.getSifra(), "123456789");
	}
}
