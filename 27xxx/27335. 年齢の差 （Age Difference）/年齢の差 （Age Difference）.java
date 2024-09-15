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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int max=0, min=Integer.MAX_VALUE;
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
			max = Math.max(max, A[i]);
			min = Math.min(min, A[i]);
		}
		
		for(int i=0;i<N;i++) {
			int diff = Math.max(max-A[i], A[i]-min);
			bw.write(diff+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class