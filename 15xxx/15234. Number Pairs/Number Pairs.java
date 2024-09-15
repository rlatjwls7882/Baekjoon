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
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] nums = new int[N];
		for(int i=0;i<N;i++) {
			nums[i] = Integer.valueOf(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(nums[i]+nums[j]==K) {
					cnt++;
				}
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class