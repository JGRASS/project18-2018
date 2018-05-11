package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OdeljenjeTest {

	Odeljenje o;

	@Before
	public void setUp() throws Exception {
		o = new Odeljenje();
	}

	@After
	public void tearDown() throws Exception {
		o = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetRedniBrojManjiOd1() {
		o.setRedniBroj(0);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetRedniBrojVeciOd15() {
		o.setRedniBroj(17);
	}
	
	@Test
	public void testSetRedniBroj() {
		o.setRedniBroj(10);
		
		assertEquals(o.getRedniBroj(), 10);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeRazrednogNull() {
		o.setImeRazrednog(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeRazrednogPrazan() {
		o.setImeRazrednog("");
	}
	
	@Test
	public void testSetImeRazrednog() {
		o.setImeRazrednog("Vanja Petrovic");
		
		assertEquals(o.getImeRazrednog(), "Vanja Petrovic");
	}
	
	@Test
	public void testEqualsObjectTrue() {
		o.setImeRazrednog("Vanja");
		o.setRedniBroj(3);
		
		Odeljenje a = new Odeljenje();
		
		a.setImeRazrednog("Vanja");
		a.setRedniBroj(3);
		
		assertTrue(o.equals(a));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		o.setImeRazrednog("Milos");
		o.setRedniBroj(3);
		
		Odeljenje a = new Odeljenje();
		
		a.setImeRazrednog("Vanja");
		a.setRedniBroj(3);
		
		assertFalse(o.equals(a));
	}
}
