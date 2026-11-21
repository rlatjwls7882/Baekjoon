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
		for(int i=1;i<=N;i++) {
			int C = Integer.valueOf(br.readLine());
			int I = Integer.valueOf(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] cost = new int[I];
			for(int j=0;j<I;j++) {
				cost[j] = Integer.valueOf(st.nextToken());
			}
			
			for(int j=0;j<I;j++) {
				for(int k=j+1;k<I;k++) {
					if(cost[j]+cost[k]==C) {
						bw.write(String.format("Case #%d: %d %d\n", i, j+1, k+1));
						j=k=I;
					}
				}
			}
		}

		bw.close();
	} // end of main()
} // end of Main class