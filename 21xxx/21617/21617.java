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
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		double sum=0, last = Double.valueOf(st1.nextToken());
		while(N-->0) {
			double cur = Double.valueOf(st1.nextToken());
			double h = Double.valueOf(st2.nextToken());
			
			sum += (cur+last)*h/2;
			last = cur;
		}
		bw.write(Double.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class