import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		long n = Long.valueOf(br.readLine());
		long a = Long.valueOf(br.readLine());
		long b = Long.valueOf(br.readLine());
		long c = Long.valueOf(br.readLine());
		long d = Long.valueOf(br.readLine());
		
		// n을 만드는 경우의 수 계산
		long minN = n-b;
		long maxN = n-a;
		
		minN = Math.max(minN, c);
		maxN = Math.min(maxN, d);
		
		bw.write(Long.toString(Math.max(0, maxN-minN+1)));
		
		bw.close();
	} // end of main()
} // end of Main class