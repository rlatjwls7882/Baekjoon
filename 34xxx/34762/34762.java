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
		int k = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(br.readLine());
		
		st = new StringTokenizer(br.readLine());

		int lastS = Integer.valueOf(st.nextToken());
		while(m-->1) {
			int s = Integer.valueOf(st.nextToken());
			if(s>lastS+1 && s-lastS<=k+1) {
				bw.write("NO");
				bw.close();
				return;
			}
			lastS = s;
		}
		
		if(n!=lastS && n-lastS<k+1) bw.write("NO");
		else bw.write("YES");
        bw.close();
    } // end of main
} // end of Main