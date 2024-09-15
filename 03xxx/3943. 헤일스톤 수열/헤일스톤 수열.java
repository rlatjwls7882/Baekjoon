import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스의 개수 T
		int T = Integer.valueOf(br.readLine());
		
		// 헤일스톤 수열의 가장 큰 값 계산
		while(T-->0) {
			int n = Integer.valueOf(br.readLine());
			
			int max=n;
			while(n!=1) {
				if(n%2==0) n/=2;
				else {
					n = n*3+1;
					if(max<n) max=n;
				}
			}
			bw.write(max+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class