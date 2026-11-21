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
		int M = Integer.valueOf(st.nextToken())-1;
		int N = Integer.valueOf(st.nextToken());

		int cnt=0;
		for(int i=0;M!=0&&N!=0;i++) {
			if(i%2==0) {
				N--;
			} else {
				M--;
			}
			cnt++;
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class