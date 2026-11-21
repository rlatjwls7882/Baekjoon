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
		
		int K = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			int[] gram = new int[m];
			for(int j=0;j<m;j++) {
				gram[j] = Integer.valueOf(br.readLine());
			}
			
			int sum=0;
			while(n-->0) {
				st = new StringTokenizer(br.readLine());
				int h = Integer.valueOf(st.nextToken());
				int w = Integer.valueOf(st.nextToken());
				int d = Integer.valueOf(st.nextToken());
				int idx = Integer.valueOf(st.nextToken());
				sum += h*w*d*gram[idx-1];
			}
			bw.write("Data Set "+i+":\n"+sum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class