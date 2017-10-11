package url;

import org.junit.Test;

import static org.junit.Assert.*;

public class UrlTest {
  @Test
  public void deveSerUmaUrlValida() throws Exception{
    assert(Url.validar("https://www.globoesporte.globo.com/"));
  }

  @Test
  public void deveSerUmaUrlInvalida() throws Exception{
    assertFalse(Url.validar("htp://globoesporte.globo.com/go/futebol/times/goias"));
  }
}
