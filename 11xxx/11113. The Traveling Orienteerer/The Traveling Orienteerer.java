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
		
		double[][] track = new double[n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			track[i][0] = Double.valueOf(st.nextToken());
			track[i][1] = Double.valueOf(st.nextToken());
		}
		
		int m = Integer.valueOf(br.readLine());
		
		while(m-->0) {
			int p = Integer.valueOf(br.readLine());
			
			double dist=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int last = Integer.valueOf(st.nextToken());
			
			while(p-->1) {
				int cur = Integer.valueOf(st.nextToken());
				dist += Math.sqrt(Math.pow(track[cur][0]-track[last][0], 2)+Math.pow(track[cur][1]-track[last][1], 2));
				last=cur;
			}
			
			bw.write((int)Math.round(dist)+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class