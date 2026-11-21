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
		int[] T = new int[M];
		for(int i=0;i<M;i++) {
			T[i] = Integer.valueOf(st.nextToken());
		}
		
		int idx=1, correct=0;
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			
			int cnt=0;
			for(int j=0;j<M;j++) {
				if(T[j]==Integer.valueOf(st.nextToken())) {
					cnt++;
				}
			}
			if(cnt>correct) {
				correct=cnt;
				idx=i;
			}
		}
		bw.write(Integer.toString(idx));

		bw.close();
	} // end of main()
} // end of Main class