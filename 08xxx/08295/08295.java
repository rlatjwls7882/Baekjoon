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
		int p = Integer.valueOf(st.nextToken());
		
		int cnt=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if((i+j)*2>=p) {
					cnt+=(n-i+1)*(m-j+1);
				}
			}
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class