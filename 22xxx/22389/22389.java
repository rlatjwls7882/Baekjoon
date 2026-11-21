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
			int n = Integer.valueOf(st.nextToken());
			int l = Integer.valueOf(st.nextToken());
			int r = Integer.valueOf(st.nextToken());
			if(n==0) {
				break;
			}
			
			int[] A = new int[n+1];
			for(int i=1;i<=n;i++) {
				A[i] = Integer.valueOf(br.readLine());
			}
			
			int cnt=0;
			while(l<=r) {
				for(int i=1;i<=n;i++) {
					if(l%A[i]==0) {
						if(i%2==1) {
							cnt++;
						}
						break;
					} else if(i==n&&n%2==0) {
						cnt++;
					}
				}
				l++;
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class