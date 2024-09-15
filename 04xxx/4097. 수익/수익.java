import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			// 가장 많은 수익을 올린 구간의 수익 계산
			int[] income = new int[N+1];
			int max=-10000;
			
			for(int i=1;i<=N;i++) {
				int P = Integer.valueOf(br.readLine());
				income[i] = Math.max(income[i-1]+P, P);
				max = Math.max(max, income[i]);
			}
			
			bw.write(Integer.toString(max));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class