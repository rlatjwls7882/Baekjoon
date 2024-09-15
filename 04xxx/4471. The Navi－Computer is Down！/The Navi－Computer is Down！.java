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
		
		while(T-->0) {
			String name1 = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			double[] pos1 = new double[3];
			for(int i=0;i<3;i++) {
				pos1[i] = Double.valueOf(st.nextToken());
			}
			
			String name2 = br.readLine();
			st = new StringTokenizer(br.readLine());
			double[] pos2 = new double[3];
			for(int i=0;i<3;i++) {
				pos2[i] = Double.valueOf(st.nextToken());
			}
			
			bw.write(String.format("%s to %s: %.02f\n", name1, name2, Math.sqrt(Math.pow(pos1[0]-pos2[0], 2)+Math.pow(pos1[1]-pos2[1], 2)+Math.pow(pos1[2]-pos2[2], 2))));
		}
		
		bw.close();
	} // end of main()
} // end of Main class