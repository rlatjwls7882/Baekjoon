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
		
		int cur=0, cnt=0;
		st = new StringTokenizer(br.readLine());
		while(N-->0) {
			int A = Integer.valueOf(st.nextToken());
			cur = Math.max(0, cur+A);
			if(cur>=M) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main
} // end of Main class