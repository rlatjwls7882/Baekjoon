import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());

			int cnt=0;
			for(int i=2;i<=N;i++) {
				for(int tmp=N;tmp%i==0;tmp/=i) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class