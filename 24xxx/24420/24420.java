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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		while(N-->0) {
			int tmp = Integer.valueOf(st.nextToken());
			sum += tmp;
			min = Math.min(min, tmp);
			max = Math.max(max, tmp);
		}
		bw.write(Integer.toString(sum-min-max));
		
		bw.close();
	} // end of main()
} // end of Main class