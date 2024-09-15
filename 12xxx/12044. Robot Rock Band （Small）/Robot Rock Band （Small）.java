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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			
			int[][] robots = new int[4][N];
			for(int j=0;j<4;j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=0;k<N;k++) {
					robots[j][k] = Integer.valueOf(st.nextToken());
				}
			}
			
			int cnt=0;
			for(int a=0;a<N;a++) {
				for(int b=0;b<N;b++) {
					for(int c=0;c<N;c++) {
						for(int d=0;d<N;d++) {
							if((robots[0][a]^robots[1][b]^robots[2][c]^robots[3][d])==K) {
								cnt++;
							}
						}
					}
				}
			}
			bw.write("Case #"+i+": "+cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class