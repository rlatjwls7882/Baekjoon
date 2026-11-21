import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 이미 심어져 있는 가로수의 수 N 입력
		int N = Integer.valueOf(br.readLine());
		
		// 첫번째 가로수와 마지막 가로수, 이전 가로수의 위치, 가로수의 간격 확인
		int first=0, last=0, pre=0, distance=0;
		
		for(int i=0;i<N;i++) {
			
			// 현재 가로수의 위치
			int cur = Integer.valueOf(br.readLine());
			
			// 첫번째 가로수
			if(i==0)
				first=cur;
			
			// 마지막 가로수
			else if(i==N-1)
				last=cur;
			
			// 최대 간격 계산
			if(i==1)
				distance = cur-pre;
			else if(i>1)
				distance = gcd(cur-pre, distance);
			
			pre = cur;
		}
		
		// 새로 심어야 하는 가로수의 최소수 출력
		bw.write((last-first)/distance+1-N+"");

		bw.close();
	} // end of main()
	
    // 최대 공약수 계산
	public static int gcd(int A, int B) {
        
		while(B!=0) {
			int tmp = A%B;
			A = B;
			B = tmp;
		}
        
		return A;
	} // end of gcd()
} // end of Main class