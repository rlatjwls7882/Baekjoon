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

		// 온도를 측정한 날의 수 N, 더할 연속된 온도의 개수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 온도 수열 입력
		st = new StringTokenizer(br.readLine());
		int[] temp = new int[N];
		for(int i=0;i<N;i++) {
			temp[i] = Integer.valueOf(st.nextToken());
		}
		
		// 초기값 세팅
		int sum=0;
		for(int i=0;i<K;i++) {
			sum += temp[i];
		}
		
		int max=sum;
		
		// 연속된 K일의 온도의 합의 최댓값 계산
		for(int i=K;i<N;i++) {
			sum += temp[i]-temp[i-K];
			if(max<sum) {
				max=sum;
			}
		}
		
		bw.write(Integer.toString(max));

		bw.close();
	} // end of main()
} // end of Main class