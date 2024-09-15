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
		
		for(int i=1;;i++) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			int sum=0;
			for(int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0;k<=j;k++) {
					if(k==0||k==j||j==N-1) {
						sum += Integer.valueOf(st.nextToken());
					} else {
						st.nextToken();
					}
				}
			}
			bw.write(String.format("Case #%d:%d\n", i, sum));
		}
		
		bw.close();
	} // end of main()
} // end of Main class