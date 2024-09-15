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
			int N = Integer.valueOf(br.readLine());
			
			int[][] wire = new int[N][2];
			for(int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				wire[j][0] = Integer.valueOf(st.nextToken());
				wire[j][1] = Integer.valueOf(st.nextToken());
			}
			
			int cnt=0;
			for(int j=0;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					if(wire[j][0]<wire[k][0]&&wire[j][1]>wire[k][1]||wire[j][0]>wire[k][0]&&wire[j][1]<wire[k][1]) {
						cnt++;
					}
				}
			}
			bw.write(String.format("Case #%d: %d\n", i, cnt));
		}
		
		bw.close();
	} // end of main()
} // end of Main class