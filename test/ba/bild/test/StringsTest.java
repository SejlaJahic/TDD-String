package ba.bild.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ba.bild.code.Strings;

public class StringsTest {

	Strings string;
	
	@Before
	public void setUp() {
		string = new Strings();
	}
	
	@Test
	public void shouldReturnDuzinaStringaWhenPassString() {
		int rezultat = string.duzinaStringa("cevap");
		assertEquals(5,rezultat);
	}
	
	@Test
	public void shouldReturnKaraktereNaParnimPozicijamaWhenPassString() {
		String rezultat = string.karakteriNaParnimPozicijama("abc");
		assertEquals("c", rezultat);
	}
	
	@Test
	public void shouldReturnKaraktereNaNEparnimPozicijamaWhenPassString() {
		String rezultat = string.karakteriNaNEparnimPozicijama("abc");
		assertEquals("ab", rezultat);
	}
	
	@Test
	public void shouldReturnBrojUppercaseKarakteraWhenPassString() {
		int rezultat = string.brojUppercaseKaraktera("abc");
		assertEquals(0, rezultat);
	}
	
	@Test
	public void shouldReturnBrojLowercaseKarakteraWhenPassString() {
		int rezultat = string.brojLowercaseKaraktera("abc");
		assertEquals(3,rezultat);
	}
	
	@Test
	public void shouldReturnStringKarakteraKojiNisuSlovaWhenPassString() {
		String rezultat = string.karakteriKojiNisuSlova("1a2");
		assertEquals("12",rezultat);
	}
}
