import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스의 수 T
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// A, B 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			// A와 B의 최대공약수 계산
			int gcd=1;
			
			for(int i=2;i<=A&&i<=B;i++)
				if(A%i==0&&B%i==0)
					gcd=i;
			
			// A와 B의 최소공배수 출력
			bw.write(A*B/gcd+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class