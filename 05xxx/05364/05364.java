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
		
		double minDist = Double.MAX_VALUE;
		int idx=0;
		for(int i=1;i<n;i++) {
			double dist = Math.sqrt(Math.pow(pos[0][0]-pos[i][0], 2)+Math.pow(pos[0][1]-pos[i][1], 2));
			if(minDist>dist) {
				minDist=dist;
				idx=i;
			}
		}
		
		bw.write(pos[0][0]+" "+pos[0][1]+"\n");
		bw.write(pos[idx][0]+" "+pos[idx][1]+"\n");
		bw.write(String.format("%.02f", minDist));
		
		bw.close();
	} // end of main()
} // end of Main class