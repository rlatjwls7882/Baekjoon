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
		
		int idx = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		
		if(idx==1) {
			bw.write(Integer.toString(Math.max(a+b+c-2*n, 0)));
		} else {
			bw.write(Integer.toString(Math.min(Math.min(a, b), c)));
		}
		
		bw.close();
	} // end of main()
} // end of Main class