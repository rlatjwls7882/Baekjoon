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
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String[] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i] = st.nextToken();
		}
		
		st = new StringTokenizer(br.readLine());
		String[] t = new String[m];
		for(int i=0;i<m;i++) {
			t[i] = st.nextToken();
		}
		
		int q = Integer.valueOf(br.readLine());
		while(q-->0) {
			int y = Integer.valueOf(br.readLine())-1;
			bw.write(s[y%n]+t[y%m]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class