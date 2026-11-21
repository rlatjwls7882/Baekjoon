import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		int[] nums = new int[1001];
		int max=0;
		while(N-->0) {
			max = Math.max(max, ++nums[Integer.valueOf(br.readLine())]);
		}
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class