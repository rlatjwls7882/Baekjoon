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
		
		boolean[] A = new boolean[101];
		st = new StringTokenizer(br.readLine());
		while(N-->0) {
			A[Integer.valueOf(st.nextToken())]=true;
		}
		
		boolean[] B = new boolean[101];
		st = new StringTokenizer(br.readLine());
		while(M-->0) {
			B[Integer.valueOf(st.nextToken())]=true;
		}
		
		for(int i=1;i<=100;i++) {
			if(A[i]&&B[i]) {
				bw.write(i+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class