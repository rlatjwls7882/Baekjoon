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
		int M = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] A = new int[M+1];
		int maxB=0;
		while(N-->0) {
			int tmp = Integer.valueOf(st.nextToken());
			A[tmp]++;
			maxB = Math.max(maxB, A[tmp]);
		}
		bw.write(Integer.toString(maxB));
		
		bw.close();
	} // end of main()
} // end of Main class