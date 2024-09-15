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
		int sum=0, min=Integer.MAX_VALUE;
		for(int i=0;i<4;i++) {
			int tmp = Integer.valueOf(st.nextToken());
			min = Math.min(min, tmp);
			sum += tmp;
		}
		bw.write(Integer.toString(sum-min+1));
		
		bw.close();
	} // end of main()
} // end of Main class