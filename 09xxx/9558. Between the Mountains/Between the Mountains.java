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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int[] mountain1 = new int[N];
			for(int i=0;i<N;i++) {
				mountain1[i] = Integer.valueOf(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			int M = Integer.valueOf(st.nextToken());
			int[] mountain2 = new int[M];
			for(int i=0;i<M;i++) {
				mountain2[i] = Integer.valueOf(st.nextToken());
			}
			
			int min=Integer.MAX_VALUE;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					min = Math.min(min, Math.abs(mountain1[i]-mountain2[j]));
				}
			}
			bw.write(min+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class