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
		
		int n = Integer.valueOf(br.readLine());
		
		int[][] pos = new int[n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.valueOf(st.nextToken());
			pos[i][1] = Integer.valueOf(st.nextToken());
		}
		
		int t = Integer.valueOf(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken())-1;
			int d = Integer.valueOf(st.nextToken());
			
			int cnt=0;
			for(int j=0;j<n;j++) {
				if(i!=j&&Math.pow(pos[i][0]-pos[j][0], 2)+Math.pow(pos[i][1]-pos[j][1], 2)<=d*d) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class