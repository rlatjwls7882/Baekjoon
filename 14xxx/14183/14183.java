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
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			if(m==0) {
				break;
			}
			
			st = new StringTokenizer(br.readLine());
			int[] want = new int[m];
			for(int i=0;i<m;i++) {
				want[i] = Integer.valueOf(st.nextToken());
			}
			
			int cnt=0;
			while(n-->0) {
				st = new StringTokenizer(br.readLine());
				
				boolean chk=true;
				for(int i=0;i<m;i++) {
					if(want[i]<Integer.valueOf(st.nextToken())) {
						chk=false;
						break;
					}
				}
				if(chk) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class