import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		int[] arr = new int[10];
		char[] pos = {'N', 'E', 'S', 'W', 'N', 'E', 'S', 'W', 'N', 'E', 'S', 'W', 'N', 'E', 'S', 'W'};
		int t1=0,t2=0,t3=0;
 
		Scanner scanner = new Scanner(System.in);
		
		for(int i:arr) {
			arr[i]=scanner.nextInt();
			
			if(arr[i]==1) t1++;
			else if(arr[i]==2) t2++;
			else t3++;
		}
		t1%=4; t2%=2; t3%=4;
		
		System.out.println(pos[4+t1+t2*2-t3]);
	}
}