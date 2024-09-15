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
		
		int max=0;
		int[] nums = new int[10001];
		while(N-->0) {
			max = Math.max(max, ++nums[Integer.valueOf(br.readLine())]);
		}
		
		for(int i=1;i<=10000;i++) {
			if(nums[i]==max) {
				bw.write(Integer.toString(i));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class