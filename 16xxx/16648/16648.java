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
		double t = Double.valueOf(st.nextToken());
		double p = Double.valueOf(st.nextToken());
		
		double time = t/(Math.min(80, 100-p)+Math.max(0, 20-p)*2);
		bw.write(Double.toString(time*(Math.min(20, p)*2+Math.max(p-20, 0))));

		bw.close();
	} // end of main()
} // end of Main class