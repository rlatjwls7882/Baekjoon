import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		HashSet<Double> giers = new HashSet<>();
		for(double i=M;i<=N;i++) {
			for(double j=M;j<=N;j++) {
				giers.add(i/j);
			}
		}
		bw.write(giers.size()+"");
		
		bw.close();
	} // end of main()
} // end of Main class