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
		
		double[][] pos = new double[t][2];
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Double.valueOf(st.nextToken());
			pos[i][1] = Double.valueOf(st.nextToken());
		}
		
		double min = Double.MAX_VALUE;
		for(int i=0;i<t;i++) {
			double sum=0;
			for(int j=0;j<t;j++) {
				sum += Math.sqrt(Math.pow(pos[i][0]-pos[j][0], 2)+Math.pow(pos[i][1]-pos[j][1], 2));
			}
			min = Math.min(min, sum/(t-1));
		}
		bw.write(min+"");
		
		bw.close();
	} // end of main()
} // end of Main class