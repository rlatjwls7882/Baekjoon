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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.valueOf(st.nextToken());
			if(k==0) {
				break;
			}
			
			int cnt=0;
			for(int i=1;i<=k;i++) {
				int n = Integer.valueOf(st.nextToken());
				
				for(int j=cnt;j<n;j++) {
					bw.write(i+" ");
				}
				cnt=n;
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class