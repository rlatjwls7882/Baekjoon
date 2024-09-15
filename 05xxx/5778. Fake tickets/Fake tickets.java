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

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			if(N==0&&M==0) {
				break;
			}
			
			st = new StringTokenizer(br.readLine());
			int[] ticket = new int[N];
			while(M-->0) {
				ticket[Integer.valueOf(st.nextToken())-1]++;
			}
			
			int cnt=0;
			for(int i=0;i<N;i++) {
				if(ticket[i]>1) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class