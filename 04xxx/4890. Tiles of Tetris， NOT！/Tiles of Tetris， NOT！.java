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
			long W = Integer.valueOf(st.nextToken());
			long H = Integer.valueOf(st.nextToken());
			if(W==0) {
				break;
			}
			
			if(H%W==0) {
				bw.write(H/W+"\n");
			} else if(W%H==0) {
				bw.write(W/H+"\n");
			} else {
				bw.write(W*H/gcd(W, H)+"\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static long gcd(long a, long b) {
		while(b!=0) {
			long tmp = a%b;
			a = b;
			b = tmp;
		}
		return a;
	}
} // end of Main class