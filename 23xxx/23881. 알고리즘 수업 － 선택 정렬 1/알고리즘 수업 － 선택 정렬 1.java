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
		
		// 배열의 크기 N, 교환 횟수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 배열 A 입력
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 선택 정렬 시작
		int change=0;
		for(int i=N-1;i>=1;i--) {
			
			// 최댓값 탐색
			int maxIdx=i;
			for(int j=0;j<i;j++) {
				if(A[maxIdx]<A[j]) {
					maxIdx=j;
				}
			}
			
			// 교환
			if(i!=maxIdx) {
				int tmp = A[i];
				A[i] = A[maxIdx];
				A[maxIdx] = tmp;
				change++;
			}
			
			// 교환 횟수가 K번째인 경우
			if(change==K) {
				bw.write(Integer.toString(A[maxIdx]));
				bw.write(' ');
				bw.write(Integer.toString(A[i]));
				break;
			}
		}
		
		// 교환 횟수가 K보다 작은 경우
		if(change!=K) {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class