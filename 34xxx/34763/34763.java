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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			
			boolean chk=false;
			for(long i=0;i<=n;i++) {
				if((i+1)*(n-i)>=k) {
					if((i+1)*(n-i)==k) chk=true;
					break;
				}
			}
			bw.write(chk?"YES\n":"NO\n");
		}
		
        bw.close();
    } // end of main
} // end of Main