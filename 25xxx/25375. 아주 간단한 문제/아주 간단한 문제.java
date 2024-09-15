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
		
		int Q = Integer.valueOf(br.readLine());
		
		// gcd(x,y)=a, x+y=b를 만족하는 x,y가 있는지 확인
		while(Q-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.valueOf(st.nextToken());
			long b = Long.valueOf(st.nextToken());
			
			if(b%a==0&&b>a) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class