import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 파도반 수열 계산
		long[] P = new long[101];
		P[1]=P[2]=P[3]=1;
		
		for(int i=4;i<=100;i++) {
			P[i]=P[i-2]+P[i-3];
		}
		
		// 각각의 케이스마다 P(N) 출력
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			bw.write(Long.toString(P[N]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class