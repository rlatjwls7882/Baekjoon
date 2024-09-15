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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기카드
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(br.readLine());
		}
		
		// 카드 바꾸기
		for(int i=1;i<=M;i++) {
			for(int j=0;j<N-1;j++) {
				if(A[j]%i>A[j+1]%i) {
					int tmp=A[j];
					A[j]=A[j+1];
					A[j+1]=tmp;
				}
			}
		}
		
		for(int j=0;j<N;j++) {
			bw.write(A[j]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class