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
		
		int K = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			double M = Double.valueOf(st.nextToken());
			
			double[][] mtF = new double[n][3];
			for(int j=0;j<n;j++) {
				st = new StringTokenizer(br.readLine());
				mtF[j][0] = Double.valueOf(st.nextToken());
				mtF[j][1] = Double.valueOf(st.nextToken());
				mtF[j][2] = Double.valueOf(st.nextToken());
				M += mtF[j][0];
			}
			
			double v=0, h=0;
			for(int j=0;j<n;j++) {
				double a = mtF[j][2]/M-9.81;
				h += v*mtF[j][1] + a/2*mtF[j][1]*mtF[j][1];
				v += a*mtF[j][1];
				M -= mtF[j][0];
			}
			bw.write(String.format("Data Set %d:\n%.2f\n\n", i, h));
		}
		
		bw.close();
	} // end of main()
} // end of Main class