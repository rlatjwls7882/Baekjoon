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
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		int curStart=A[0], curMax=0;
		for(int i=1;i<N;i++) {
			if(A[i]>A[i-1]) {
				curMax=Math.max(A[i]-curStart, curMax);
			} else {
				curStart=A[i];
			}
		}
		bw.write(curMax+"");
		
		bw.close();
	} // end of main()
} // end of Main class