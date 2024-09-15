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
		
		int P = Integer.valueOf(br.readLine());
		while(P-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			int sum=0;
			while(n!=0) {
				sum += Math.pow(n%b, 2);
				n/=b;
			}
			bw.write(K+" "+sum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class