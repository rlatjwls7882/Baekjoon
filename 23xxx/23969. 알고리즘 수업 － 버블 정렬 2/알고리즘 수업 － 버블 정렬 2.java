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
		
		// 버블 정렬 수행
		int change=0;
		
		for(int i=N-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(A[j]>A[j+1]) {
					int tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
					change++;
					
					// 교환횟수가 K번인 경우
					if(change==K) {
						for(int k=0;k<N;k++) {
							bw.write(Integer.toString(A[k]));
							bw.write(' ');
						}
						i=0;
						break;
					}
				}
			}
		}
		
		// 교환횟수가 K번이 안되는 경우
		if(change<K) {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class