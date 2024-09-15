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
		int X = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] H = new int[N];
		for(int i=0;i<N;i++) {
			H[i] = Integer.valueOf(st.nextToken());
		}
		
		int max=1;
		int[] cnt = new int[N];
		Arrays.fill(cnt, 1);
		
		for(int i=1;i<N;i++) {
			if(H[i]<=H[i-1]+X) {
				cnt[i] = cnt[i-1]+1;
				max = Math.max(max, cnt[i]);
			}
		}
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class