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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int next = Integer.valueOf(st.nextToken());
			if(next==1) {
				bw.write(N+" ");
			} else if(next==N) {
				bw.write("1 ");
			} else {
				bw.write(next+" ");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class