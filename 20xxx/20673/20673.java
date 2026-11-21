import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p=scanner.nextInt();
		int q=scanner.nextInt();
		
		if(p<=50&&q<=10) System.out.println("White");
		else if(q>30) System.out.println("Red");
		else System.out.println("Yellow");
	}
}