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
		
		for(int i=1;i<=T;i++) {
			int N = Integer.valueOf(br.readLine());
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(s1.charAt(j)!=s2.charAt(j)) {
					cnt++;
				}
			}
			bw.write(String.format("Case %d: %d\n", i, cnt));
		}

		bw.close();
	} // end of main()
} // end of Main class