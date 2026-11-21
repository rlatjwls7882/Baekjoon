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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int e = Integer.valueOf(st.nextToken());
			
			int[] line = new int[n+1];
			for(int i=1;i<=n;i++) {
				line[i]=i;
			}
			
			while(e-->0) {
				int val = Integer.valueOf(br.readLine());
				int idx=1;
				for(int i=1;i<=n;i++) {
					if(line[i]==val) {
						idx=i;
					}
				}
				
				for(int i=idx-1;i>=1;i--) {
					line[i+1]=line[i];
				}
				line[1]=val;
			}
			bw.write(line[n]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class