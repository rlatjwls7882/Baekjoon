import java.math.BigInteger;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();
		
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		
		System.out.println(a.multiply(b));
	}
}