import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int l=scanner.nextInt();
		int r=scanner.nextInt();
		int diff=100000;
		int num = 0;
		
		for(int i=l;i<=r;i++) 
			if(Math.abs(x-i)<diff) {
				diff=Math.abs(x-i);
				num=i;
			}
		
		System.out.println(num);
	}
}