package url;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {
  public static boolean validar(String url) {
    String urlRegex = "^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$";
    boolean valida = IsMatch(url, urlRegex);
    return valida;
  }

  private static boolean IsMatch(String text, String regex) {
    try {
      Pattern patt = Pattern.compile(regex);
      Matcher matcher = patt.matcher(text);
      return matcher.matches();
    } catch (RuntimeException e) {
      return false;
    }
  }
}
