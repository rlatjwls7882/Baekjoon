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
		
		String A = "";
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A += st.nextToken();
		}
		
		String B = "";
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B += st.nextToken();
		}
		
		bw.write(Long.toString(Math.min(Long.valueOf(A), Long.valueOf(B))));

		bw.close();
	} // end of main
} // end of Main class