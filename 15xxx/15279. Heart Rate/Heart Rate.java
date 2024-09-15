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
		
		int N = Integer.valueOf(br.readLine());
		
		// 심박수 계산
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double b = Double.valueOf(st.nextToken());
			double p = Double.valueOf(st.nextToken());
			
			double BPM = 60*b/p;
			double diff = BPM/b;
			bw.write(String.format("%f %f %f\n", BPM-diff, BPM, BPM+diff));
		}
		
		bw.close();
	} // end of main()
} // end of Main class