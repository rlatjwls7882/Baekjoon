import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		// N이하의 3 또는 7의 배수의 합 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(T-->0) {
			int N = Integer.valueOf(st.nextToken());
			int sum=0;
			
			// 3의 배수 더하기
			int n = N/3;
			sum += n*(n+1)/2*3;
			
			// 7의 배수 더하기
			n = N/7;
			sum += n*(n+1)/2*7;
			
			// 21의 배수 빼기
			n = N/21;
			sum -= n*(n+1)/2*21;
			
			// 출력
			bw.write(Integer.toString(sum));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class