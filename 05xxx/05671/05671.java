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

		while(true) {
			try {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int N = Integer.valueOf(st.nextToken());
				int M = Integer.valueOf(st.nextToken());

				// [N,M] 구간의 반복되는 숫자가 없는 수의 개수 계산
				int cnt=0;
				for(;N<=M;N++) {
					if(notRepeat(N)) {
						cnt++;
					}
				}

				bw.write(Integer.toString(cnt));
				bw.newLine();
			} catch (Exception e) {
				break;
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean notRepeat(int N) {
		
		int[] nums = new int[10];
		while(N!=0) {
			if(nums[N%10]==1) {
				return false;
			}
			nums[N%10]++;
			N/=10;
		}
		
		return true;
	} // end of notRepeat()
} // end of Main class