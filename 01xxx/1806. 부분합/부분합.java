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
		int S = Integer.valueOf(st.nextToken());
		
		// 길이가 N인 수열의 누적합 계산
		st = new StringTokenizer(br.readLine());
		int[] preSum = new int[N+1];
		for(int i=1;i<=N;i++) {
			preSum[i] = preSum[i-1]+Integer.valueOf(st.nextToken());
		}
		
		// 합이 S 이상인 연속된 수의 최소 개수 계산
		int left=0, right=1, length=Integer.MAX_VALUE;
		while(right<=N) {
			if(preSum[right]-preSum[left]>=S) {
				if(length>right-left) {
					length=right-left;
				}
				left++;
			} else {
				right++;
			}
		}
		
		if(length==Integer.MAX_VALUE) {
			bw.write("0");
		} else {
			bw.write(Integer.toString(length));
		}
		
		bw.close();
	} // end of main()
} // end of Main class