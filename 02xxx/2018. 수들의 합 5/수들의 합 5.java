import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 정수 N 입력
		int N = Integer.valueOf(br.readLine());
		
		// N을 연속된 자연수의 합으로 나타내는 가지수 계산
		int left=0, right=0, cnt=0, sum=0;
		while(right<=N) {
			if(sum<=N) {
				if(sum==N) {
					cnt++;
				}
				right++;
				sum+=right;
			} else {
				left++;
				sum-=left;
			}
		}
		
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class