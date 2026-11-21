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
		
		int N = Integer.valueOf(br.readLine());
		
		double[][] pos = new double[N][3];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Double.valueOf(st.nextToken());
			pos[i][1] = Double.valueOf(st.nextToken());
			pos[i][2] = Double.valueOf(st.nextToken());
		}
		
		int[] cnt = new int[N];
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(Math.sqrt(Math.pow(pos[i][0]-pos[j][0], 2)+Math.pow(pos[i][1]-pos[j][1], 2))<=pos[i][2]+pos[j][2]) {
					cnt[i]++;
					cnt[j]++;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(cnt[i]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class