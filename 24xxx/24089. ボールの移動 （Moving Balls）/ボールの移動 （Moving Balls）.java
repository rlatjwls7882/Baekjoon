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
		
		int[] ball = new int[N+1];
		for(int i=1;i<=N;i++) {
			ball[i]=i;
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.valueOf(st.nextToken());
			int Y = Integer.valueOf(st.nextToken());
			ball[X]=Y;
		}
		
		for(int i=1;i<=N;i++) {
			bw.write(ball[i]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class