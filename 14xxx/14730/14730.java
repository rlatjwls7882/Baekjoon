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

		// 항의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// f'(1) 계산
		int sum=0;
		
		while(N-->0) {
			
			// 항의 계수 C, 항의 차수 K
			StringTokenizer st = new StringTokenizer(br.readLine());
			int C = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			
			// (Cx^K)' == CKx^(K-1)
			sum += C*K;
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class