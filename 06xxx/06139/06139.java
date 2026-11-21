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
		int K = Integer.valueOf(st.nextToken());
		
		while(K-->0) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			int T = Integer.valueOf(st.nextToken());
			int R = Integer.valueOf(st.nextToken());
			
			int read=0, time=0;
			while(true) {
				for(int i=0;i<T&&read<N;i++) {
					read+=S;
					time++;
				}
				if(read>=N) {
					break;
				}
				time+=R;
			}
			bw.write(time+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class