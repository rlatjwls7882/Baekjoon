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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] w = new int[N];
		for(int i=0;i<N;i++) {
			w[i] = Integer.valueOf(st.nextToken());
		}
		
		int max=0;
		for(int i=0;i<N;i++) {
			int cost=0, cnt=0;
			for(int j=i;j<N;j++) {
				if(cost+w[j]<=C) {
					cost+=w[j];
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}
		bw.write(max+"");
		
		bw.close();
	} // end of main()
} // end of Main class