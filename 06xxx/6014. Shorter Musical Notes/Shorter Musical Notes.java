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
		int Q = Integer.valueOf(st.nextToken());
		
		int[] bit = new int[1_200_001];
		int B0=0;
		for(int i=1;i<=N;i++) {
			int B1 = Integer.valueOf(br.readLine());
			for(int j=0;j<B1;j++) {
				bit[B0+j]=i;
			}
			B0+=B1;
		}
		
		while(Q-->0) {
			bw.write(bit[Integer.valueOf(br.readLine())]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class