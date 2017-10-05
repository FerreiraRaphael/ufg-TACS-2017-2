package bissexto;

import static org.junit.Assert.*;

import org.junit.Test;

public class BissextoTest {

	@Test
	public void testAno1200() {
		assert(Bissexto.verificar(1200));
	}
	
	@Test
	public void testAno380() {
		assert(Bissexto.verificar(380));
	}
	
	@Test
	public void testAno2015() {
		assertFalse(Bissexto.verificar(2015));
	}
}