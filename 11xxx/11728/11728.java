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

		// 배열 A의 크기 N, 배열 B의 크기 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 배열 A와 B 입력
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] B = new int[M];
		for(int i=0;i<M;i++) {
			B[i] = Integer.valueOf(st.nextToken());
		}
		
		// 두 배열의 값을 각각 비교하여 작은값 출력
		int Apointer=0, Bpointer=0;
		while(Apointer!=N&&Bpointer!=M) {
			if(A[Apointer]<B[Bpointer]) {
				bw.write(Integer.toString(A[Apointer]));
				Apointer++;
			} else {
				bw.write(Integer.toString(B[Bpointer]));
				Bpointer++;
			}
			bw.write(' ');
		}
		
		// 배열에 남아있는 값 출력
		while(Apointer!=N) {
			bw.write(Integer.toString(A[Apointer]));
			Apointer++;
			bw.write(' ');
		}
		while(Bpointer!=M) {
			bw.write(Integer.toString(B[Bpointer]));
			Bpointer++;
			bw.write(' ');
		}

		bw.close();
	} // end of main()
} // end of Main class