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
		
		double a = Double.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double m = Double.valueOf(st.nextToken());
		double n = Double.valueOf(st.nextToken());
		
		double minTime = Math.max(m/a, n);
		minTime = Math.min(Math.max(m, n/a), minTime);
		minTime = Math.min(m/a*2, minTime);
		minTime = Math.min(n/a*2, minTime);
		
		bw.write(minTime+"");
		
		bw.close();
	} // end of main()
} // end of Main class