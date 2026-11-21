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
		
		int N = Integer.valueOf(br.readLine());
		
		// 각 시간마다 사용하는 양동이의 수 계산
		int[] use = new int[1000];
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.valueOf(st.nextToken())-1;
			int t = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken());
			
			while(s<t) {
				use[s++] += b;
			}
		}
		
		// 최대로 필요로 하는 양동이의 수 계산
		int max=0;
		for(int i=0;i<1000;i++) {
			max = Math.max(max, use[i]);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class