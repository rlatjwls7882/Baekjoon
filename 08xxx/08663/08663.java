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
		int x = Integer.valueOf(st.nextToken());
		int s = Integer.valueOf(st.nextToken());
		
		int cnt=0;
		while(x>0) {
			if(s<=1) {
				cnt += x;
				break;
			}
			
			cnt++;
			x -= s;
			s/=2;
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class