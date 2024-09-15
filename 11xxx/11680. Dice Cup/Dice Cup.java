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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		int[] nums = new int[N+M+1];
		int max=0;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				max = Math.max(max, ++nums[i+j]);
			}
		}
		
		for(int i=1;i<=N+M;i++) {
			if(max==nums[i]) {
				bw.write(i+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class