import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		
		HashSet<String> hate = new HashSet<String>();
		while(n-->0) {
			hate.add(st.nextToken());
		}
		
		int m = Integer.valueOf(br.readLine());
		int cnt=0;
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.valueOf(st.nextToken());
			
			boolean chk=true;
			while(k-->0) {
				if(hate.contains(st.nextToken())) {
					chk=false;
					break;
				}
			}
			if(chk) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class