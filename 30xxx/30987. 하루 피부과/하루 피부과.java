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
		long x1 = Long.valueOf(st.nextToken());
		long x2 = Long.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		long c = Long.valueOf(st.nextToken());
		long d = Long.valueOf(st.nextToken());
		long e = Long.valueOf(st.nextToken());
		
		// 레이저의 세기 계산
		// ∫ ax^2 + (b-d)x + c-e
		// = [a/3 x^3 + (b-d)/2 x^2+ (c-e)x] (x2 x1)
		long ans=0;
		ans += a/3 * (Math.pow(x2, 3)-Math.pow(x1, 3));
		ans += (b-d)/2 * (Math.pow(x2, 2)-Math.pow(x1, 2));
		ans += (c-e) * (x2-x1);
		
		bw.write(Long.toString(ans));
		
		bw.close();
	} // end of main()
} // end of Main class