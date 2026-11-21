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
		int max=0;
		int[] a = new int[100001];
		for(int i=0;i<N;i++) {
			int idx = Integer.valueOf(st.nextToken());
			max = Math.max(max, ++a[idx]);
		}
		
		if(N>=max*2-1) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class