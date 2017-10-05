package bizzbuzz;

public class BizzBuzz {
	static public String jogar(int numero) {
		if (numero % 15 == 0) {
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		} else if (numero % 3 == 0) {
			System.out.println("Fizz");
			return "Fizz";
		} else if (numero % 5 == 0) {
			System.out.println("Buzz");
			return "Buzz";
		} else {
			System.out.println("Continua");
			return "Continua";
		}
	}
}
