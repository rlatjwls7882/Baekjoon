import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		int D=0,P=0;
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		while(N--!=0) {
			char A = scanner.next().charAt(0);
			
			if(A=='D') D++;
			else P++;
			
			if(Math.abs(D-P)==2) break;
		}
		System.out.println(D+":"+P);
	}
}