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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			if(N==0&&M==0&&K==0) {
				break;
			}
			
			st = new StringTokenizer(br.readLine());
			int[] repeat = new int[K];
			for(int i=0;i<K;i++) {
				repeat[i] = Integer.valueOf(st.nextToken());
			}
			
			int sum=0;
			for(int i=-1;i<M-1;i++) {
				if(i!=-1) {
					N += repeat[i%K];
				}
				sum += N;
			}
			bw.write(sum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class