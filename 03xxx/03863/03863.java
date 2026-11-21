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
			if(N==0) {
				break;
			}
			
			int[][] calls = new int[N][2];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				st.nextToken();
				calls[i][0] = Integer.valueOf(st.nextToken());
				calls[i][1] = calls[i][0]+Integer.valueOf(st.nextToken());
			}
			
			while(M-->0) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.valueOf(st.nextToken());
				int end = start+Integer.valueOf(st.nextToken());
				
				int cnt=0;
				for(int i=0;i<N;i++) {
					if(start<=calls[i][0]&&calls[i][0]<end||start<calls[i][1]&&calls[i][1]<=end||calls[i][0]<=start&&end<=calls[i][1]) {
						cnt++;
					}
				}
				bw.write(cnt+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class