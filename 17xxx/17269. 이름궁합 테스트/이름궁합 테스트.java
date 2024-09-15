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
		int[] num = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 이름 입력
		st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		// 초기 상태 생성
		int[] percent = new int[N+M];
		int idx=0, left=0, right=0;
		
		while(left<N&&right<M) {
			percent[idx++] = num[A.charAt(left++)-'A'];
			percent[idx++] = num[B.charAt(right++)-'A'];
		}
		
		while(left<N) {
			percent[idx++] = num[A.charAt(left++)-'A'];
		}
		
		while(right<M) {
			percent[idx++] = num[B.charAt(right++)-'A'];
		}
		
		// 이름 궁합이 좋을 확률 계산
		for(int i=N+M-1;i>1;i--) {
			for(int j=0;j<i;j++) {
				percent[j] = (percent[j]+percent[j+1])%10;
			}
		}
		
		bw.write(String.format("%d%%", percent[0]*10+percent[1]));
		
		bw.close();
	} // end of main()
} // end of Main class