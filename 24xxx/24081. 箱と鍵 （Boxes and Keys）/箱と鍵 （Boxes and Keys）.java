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
		StringTokenizer key = new StringTokenizer(br.readLine());
		boolean[] B = new boolean[2001];
		while(M-->0) {
			B[Integer.valueOf(key.nextToken())]=true;
		}
		
		int cnt=0;
		while(N-->0) {
			if(B[Integer.valueOf(st.nextToken())]) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class