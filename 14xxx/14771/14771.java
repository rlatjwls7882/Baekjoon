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
		
		int t = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int v = Integer.valueOf(st.nextToken());
			
			int[][] ad = new int[n+1][2];
			for(int j=1;j<=n;j++) {
				st = new StringTokenizer(br.readLine());
				ad[j][0] = Integer.valueOf(st.nextToken());
				ad[j][1] = Integer.valueOf(st.nextToken());
			}
			
			int cost=0;
			while(v-->0) {
				st = new StringTokenizer(br.readLine());
				int aj1 = Integer.valueOf(st.nextToken());
				int aj2 = Integer.valueOf(st.nextToken());
				int cj = Integer.valueOf(st.nextToken());
				
				if(ad[aj1][0]==1) {
					cost += ad[aj1][1];
				}
				if(ad[aj2][0]==1) {
					cost += ad[aj2][1];
				}
				if(cj==1&&ad[aj1][0]==0) {
					cost += ad[aj1][1];
				}
				if(cj==2&&ad[aj2][0]==0) {
					cost += ad[aj2][1];
				}
			}
			bw.write("Data Set "+i+":\n"+cost+"\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class