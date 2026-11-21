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
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		bw.write(gcd(A, B)+"");
		
		bw.close();
	} // end of main()
	
	static int gcd(int a, int b) {
		while(b!=0) {
			int tmp = a%b;
			a=b;
			b=tmp;
		}
		return a;
	} // end of gcd()
} // end of Main class