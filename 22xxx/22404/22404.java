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
		int T = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		boolean[] move = new boolean[T+1];
		while(N-->0) {
			int ai = Integer.valueOf(st.nextToken());
			for(int i=ai-M;i<Math.min(T, ai+M);i++) {
				move[i]=true;
			}
		}
		
		int cnt=0;
		for(int i=1;i<=T;i++) {
			if(!move[i]) {
				cnt++;
			}
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class