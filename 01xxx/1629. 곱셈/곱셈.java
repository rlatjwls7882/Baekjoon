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
		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		long c = Long.valueOf(st.nextToken());
		
		bw.write(Long.toString(pow(a, b, c)));
		
        bw.close();
    } // end of main
	
	static long pow(long a, long b, long c) {
		if(b==0) return 1;
		if(b==1) return a%c;
		
		long tmp = pow(a, b/2, c);
		if(b%2==1) return tmp*tmp%c*a%c;
		return tmp*tmp%c;
	} // end of pow
} // end of Main