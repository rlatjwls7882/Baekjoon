import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean end = false;
	static int[] A;
	static int N, K;
	
	public static void main(String[] args) throws IOException {
		
		// 배열 A의 크기 N, 저장 횟수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// K번째 저장되는 수 계산
		for(int i=1;i<N;i++) {
			int insert = A[i];
			int j=i-1;
			
			while(j>=0&&A[j]>insert) {
				A[j+1]=A[j];
				if(count()) {
					break;
				}
				j--;
			}
			
			if(end) {
				break;
			}
			
			if(j+1!=i) {
				A[j+1]=insert;
				if(count()) {
					break;
				}
			}
			
			if(end) {
				break;
			}
		}
		
		if(!end) {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
	
	static boolean count() throws IOException {
		K--;
		if(K==0) {
			for(int i=0;i<N;i++) {
				bw.write(Integer.toString(A[i]));
				bw.write(' ');
			}
			end = true;
			return true;
		}
		return false;
	} // end of count()
} // end of Main class