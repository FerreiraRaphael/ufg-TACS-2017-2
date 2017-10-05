package bissexto;

public class Bissexto {
	public static boolean verificar(int ano) {
		return ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));
	}
}
