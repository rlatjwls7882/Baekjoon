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
		
		for(int i=1;i<=T;i++) {
			if(i!=1) {
				br.readLine();
			}
			int N = Integer.valueOf(br.readLine());
			
			int[] cnt = new int[5001];
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(N-->0) {
				int A = Integer.valueOf(st.nextToken());
				int B = Integer.valueOf(st.nextToken());
				while(A<=B) {
					cnt[A++]++;
				}
			}
			
			int P = Integer.valueOf(br.readLine());
			bw.write("Case #"+i+": ");
			
			while(P-->0) {
				bw.write(cnt[Integer.valueOf(br.readLine())]+" ");
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class