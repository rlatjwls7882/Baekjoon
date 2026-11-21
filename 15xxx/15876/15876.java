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
		int k = Integer.valueOf(st.nextToken())-1;
		
		int t=0, cnt=0;
		for(int i=0;cnt!=5;i++) {
			String bin = Integer.toString(i, 2);
			for(int j=0;j<bin.length();j++) {
				if(t==k) {
					bw.write(bin.charAt(j)+" ");
					if(++cnt==5) {
						break;
					}
				}
				t = (t+1)%n;
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class