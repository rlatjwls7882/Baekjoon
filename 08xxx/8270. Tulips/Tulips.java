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
		
		boolean[] tulip = new boolean[15001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-->0) {
			tulip[Integer.valueOf(st.nextToken())]=true;
		}
		
		int cnt=0;
		for(int i=1;i<=15000;i++) {
			if(!tulip[i]) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class