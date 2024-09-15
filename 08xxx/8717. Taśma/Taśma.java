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

		int n = Integer.valueOf(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[n];
		
		int sum=0;
		for(int i=0;i<n;i++) {
			nums[i] = Integer.valueOf(st.nextToken());
			sum += nums[i];
		}
		
		int left=0, min=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			left += nums[i];
			sum -= nums[i];
			min = Math.min(Math.abs(sum-left), min);
		}
		bw.write(Integer.toString(min));

		bw.close();
	} // end of main()
} // end of Main class