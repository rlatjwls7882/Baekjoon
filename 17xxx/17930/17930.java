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
		int L = Integer.valueOf(st.nextToken());
		int x = Integer.valueOf(st.nextToken());
		
		int cur=0, cnt=0;
		while(x-->0) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("enter")) {
				int next = Integer.valueOf(st.nextToken())+cur;
				if(next>L) {
					cnt++;
				} else {
					cur=next;
				}
			} else {
				cur -= Integer.valueOf(st.nextToken());
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class