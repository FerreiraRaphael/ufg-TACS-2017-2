package palindromo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromoTest {
  @Test
  public void deveSerPalindromo() throws Exception {
    assert (Palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
  }

  @Test
  public void naoEhPalindromo() throws Exception {
    assertFalse (Palindromo.ehPalindromo("Não"));
  }
}
