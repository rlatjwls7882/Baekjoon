import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long k = Long.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		long c = Long.valueOf(st.nextToken());
		long d = Long.valueOf(st.nextToken());
		
		// f(x) = { ax+b(x<=k), cx+d(x>k) }가 x=k에서 연속하는지 확인
		long first = a*k+b;
		long second = c*k+d;
		
		if(first==second) {
			bw.write("Yes "+first);
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
} // end of Main class