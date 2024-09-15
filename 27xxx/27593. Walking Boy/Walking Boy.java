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
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			int n = Integer.valueOf(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			int lastTime = Integer.valueOf(st.nextToken());
			int cnt = lastTime/120;
			while(n-->1) {
				int curTime = Integer.valueOf(st.nextToken());
				cnt += (curTime-lastTime)/120;
				lastTime=curTime;
			}
			cnt += (1440-lastTime)/120;
			
			if(cnt>=2) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}

		bw.close();
	} // end of main()
} // end of Main class