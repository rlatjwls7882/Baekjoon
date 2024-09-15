import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
	//	     2
	//	    2 2
	//	   2 4 2
	//	  2 6 6 2
	//  2 8 12 8 2
		
		int[] arr = {0, 0, 0, 2, 0, 0, 0, 0, 0}; //1층의 경우의 수
		int[] tmp = {0, 0, 0, 0, 0, 0, 0, 0, 0}; //복사할 배열
		
		while(N--!=1) { //1층은 이미 있으니 N-1번 반복
			for(int i=1;i<arr.length-1;i++) 
				tmp[i]=arr[i]+arr[i-1]; //arr의 인접한 값의 합을 tmp에 저장
			
			for(int i=0;i<arr.length;i++)
				arr[i]=tmp[i]; //arr에 tmp 값 복사
		}
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		
		System.out.println(sum);	
	}
}