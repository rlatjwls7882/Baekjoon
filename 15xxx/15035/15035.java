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
		int T = Integer.valueOf(br.readLine());
		
		int minSetting=0, loss=Integer.MAX_VALUE;
		while(N-->0) {
			int setting = Integer.valueOf(st.nextToken());
			
			if(T%setting<loss) {
				loss=T%setting;
				minSetting=setting;
			}
		}
		bw.write(minSetting+"");
		
		bw.close();
	} // end of main()
} // end of Main class