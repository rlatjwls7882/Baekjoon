import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		int[][] vote = new int[M][2];
		for(int i=0;i<M;i++) {
			vote[i][0] = i+1;
		}
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++) {
				vote[i][1] += Integer.valueOf(st.nextToken());
			}
		}
		Arrays.sort(vote, (o1, o2) -> o2[1]-o1[1]);
		
		for(int i=0;i<M;i++) {
			bw.write(vote[i][0]+" ");
		}
		
		bw.close();
	} // end of main()
} // end of Main class