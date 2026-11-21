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
		
		int N = Integer.valueOf(br.readLine());
		
		boolean[] chk = new boolean[1001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt=0;
		while(N-->0) {
			int tmp = Integer.valueOf(st.nextToken());
			
			if(tmp>0) {
				chk[tmp]=true;
			} else if(!chk[-tmp]) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class