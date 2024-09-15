import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 수열의 원소의 수 N, 만들 합 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 수열 입력
		st = new StringTokenizer(br.readLine());
		int[] array = new int[N+1];
		for(int i=0;i<N;i++)
			array[i] = Integer.valueOf(st.nextToken());
		
		// 합이 M이 되는 경우의 수 계산
		int left=0, right=0, cnt=0, sum=0;
		while(right<=N) {
			if(sum<=M) {
				if(sum==M) {
					cnt++;
				}
				sum+=array[right++];
			} else {
				sum-=array[left++];
			}
		}
		
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class