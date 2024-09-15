import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		boolean[] chk = new boolean[N+1];
		int cnt=0;
		for(int i=0;i<N;i++) {
			int tmp = Integer.valueOf(br.readLine());
			if(tmp<=N&&!chk[tmp]) {
				cnt++;
				chk[tmp]=true;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class