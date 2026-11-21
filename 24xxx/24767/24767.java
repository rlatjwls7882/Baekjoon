import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, fight;

	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double d = Double.valueOf(st.nextToken());
			int N = Integer.valueOf(st.nextToken());
			if(d==0&&N==0) {
				break;
			}
			
			double[][] pos = new double[N][2];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				pos[i][0] = Double.valueOf(st.nextToken());
				pos[i][1] = Double.valueOf(st.nextToken());
			}
			
			boolean[] chk = new boolean[N];
			for(int i=0;i<N;i++) {
				for(int j=i+1;j<N;j++) {
					if(Math.sqrt(Math.pow(pos[i][0]-pos[j][0], 2)+Math.pow(pos[i][1]-pos[j][1], 2))<=d) {
						chk[i]=chk[j]=true;
					}
				}
			}
			
			int cnt=0;
			for(int i=0;i<N;i++) {
				if(chk[i]) {
					cnt++;
				}
			}
			bw.write(cnt+" sour, "+(N-cnt)+" sweet\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class