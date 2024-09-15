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
		int M = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		for(int i=0;i<N;i++) {
			bw.write((M/N+M%N)+" ");
			M-=M/N+M%N;
		}
		bw.write("\n"+M);
		
		bw.close();
	} // end of main()
} // end of Main class