import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int P = Integer.valueOf(st.nextToken());
			int Q = Integer.valueOf(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int[] eggs = new int[n];
			for(int j=0;j<n;j++) {
				eggs[j] = Integer.valueOf(st.nextToken());
			}
			Arrays.sort(eggs);
			
			int cnt=0, sum=0;
			for(int j=0;j<n;j++) {
				sum += eggs[j];
				if(sum<=Q) {
					cnt++;
				} else {
					break;
				}
			}
			
			bw.write(String.format("Case %d: %d\n", i, Math.min(cnt, P)));
		}
		
		bw.close();
	} // end of main()
} // end of Main class