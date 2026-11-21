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

		// 단의 수 N, 항의 수 K 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 가장큰 거꾸로 구구단의 값 계산
		int max=0;
		
		for(int i=1;i<=K;i++) {
			int val = i*N;
			StringBuilder reverse = new StringBuilder();
			
			while(val!=0) {
				reverse.append(val%10);
				val/=10;
			}
			
			int reversedVal = Integer.valueOf(reverse.toString());
			if(reversedVal>max) max=reversedVal;
		}
		
		bw.write(max+"");

		bw.close();
	} // end of main
} // end of Main class