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
		int K = Integer.valueOf(st.nextToken());
		
		int cnt=0;
		while(N-->0) {
			int x = Integer.valueOf(br.readLine());
			while(x%2==0) {
				cnt++;
				x/=2;
			}
		}
		
		if(cnt>=K) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class