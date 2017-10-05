package palindromo;

public class Palindromo {
  public static boolean ehPalindromo(String frase) {
    String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
    return new StringBuffer(fraseFiltrada).reverse().toString().equals(fraseFiltrada);
  }
}
