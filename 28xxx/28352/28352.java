import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long N = scanner.nextLong();
		long fac=1;
		
		while(N>=1)
			fac*=N--;
		fac/=60*60*24*7;
		
		System.out.println(fac);
	}
}