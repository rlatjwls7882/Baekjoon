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
		
		int N = Integer.valueOf(br.readLine());
		
		// 꽃 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 쿼리 수행
		int Q = Integer.valueOf(br.readLine());
		
		while(Q-->0) {
			st = new StringTokenizer(br.readLine());
			
			// 1번
			if(st.nextToken().equals("1")) {
				int l = Integer.valueOf(st.nextToken())-1;
				int r = Integer.valueOf(st.nextToken())-1;
				int k = Integer.valueOf(st.nextToken());
				
				// k 꽃의 개수 확인
				int cnt=0;
				while(l<=r) {
					if(A[l]==k) {
						cnt++;
					}
					l++;
				}
				
				bw.write(Integer.toString(cnt));
				bw.newLine();
			}
			
			// 2번
			else {
				int l = Integer.valueOf(st.nextToken())-1;
				int r = Integer.valueOf(st.nextToken())-1;
				
				// 꽃 밟아 죽이기
				while(l<=r) {
					A[l]=0;
					l++;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class