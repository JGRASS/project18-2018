package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoditeljTest {

	Roditelj p ;

	@Before
	public void setUp() throws Exception {
		p = new Roditelj();
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
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgNull() {
		p.setJmbg(null);	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgPrazan() {
		p.setJmbg("");	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgRazlicitoOd13Brojeva() {
		p.setJmbg("132");	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgRazlicitoOd13Brojeva2() {
		p.setJmbg("12345678910111213");	
	}
	
	@Test
	public void testSetJmbg() {
		p.setJmbg("1234567891234");
		
		assertEquals(p.getJmbg(), "1234567891234");
	}
	
	@Test
	public void testEqualsObjectTrue() {
		p.setJmbg("1234567891234");
		p.setImePrezime("Milos");
		p.setKorisnickoIme("mm");
		p.setSifra("123456789");
		
		Roditelj r = new Roditelj();
		r.setJmbg("1234567891234");
		r.setImePrezime("Milos");
		r.setKorisnickoIme("mm");
		r.setSifra("123456789");
		
		assertTrue(p.equals(r));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		p.setJmbg("1234567891234");
		p.setImePrezime("Mladen");
		p.setKorisnickoIme("mm");
		p.setSifra("123456789");
		
		Roditelj r = new Roditelj();
		r.setJmbg("1234567891234");
		r.setImePrezime("Milos");
		r.setKorisnickoIme("mm");
		r.setSifra("123456789");
		
		assertFalse(p.equals(r));
	}
}
