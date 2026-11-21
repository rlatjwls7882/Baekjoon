import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 배열 A 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 배열 B 입력
		st = new StringTokenizer(br.readLine());
		int[] B = new int[N];
		for(int i=0;i<N;i++) {
			B[i] = Integer.valueOf(st.nextToken());
		}
		
		// 배열 A를 정렬하는 중 배열 B와 같은 경우가 발생하는지 확인
		boolean equal=false;
		
		if(Arrays.equals(A, B)) {
			equal=true;
		} else {
			for(int i=N-1;i>=0;i--) {
				
				// 가장 큰 수 찾기
				int max=A[i], idx=i;
				for(int j=i-1;j>=0;j--) {
					if(max<A[j]) {
						max=A[j];
						idx=j;
					}
				}
				
				// 교환
				if(idx!=i) {
					int tmp = A[i];
					A[i]=A[idx];
					A[idx]=tmp;
					
					if(Arrays.equals(A, B)) {
						equal=true;
						break;
					}
				}
			}
		}
		
		// 출력
		if(equal) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class