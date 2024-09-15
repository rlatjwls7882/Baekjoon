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
		
		// 수도꼭지의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 수도꼭지에서 나오는 물의 양
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] A = new long[N];
		long sum=0;
		
		for(int i=0;i<N;i++) {
			A[i] = Long.valueOf(st.nextToken());
			sum += A[i];
		}
		
		// 아무 조작도 하지 않을때의 1분동안 담기는 물의 양 출력
		bw.write(Long.toString(sum));
		bw.newLine();
		
		//조작의 수 Q
		int Q = Integer.valueOf(br.readLine());
		
		while(Q-->0) {
			st = new StringTokenizer(br.readLine());
			
			// 수도꼭지에서 나오는 물의 양 조절
			if(st.nextToken().equals("1")) {
				int i = Integer.valueOf(st.nextToken())-1;
				long x = Long.valueOf(st.nextToken());
				
				if(A[i]>0) {
					sum -= A[i];
					A[i] = x;
					sum += A[i];
				} else {
					A[i] = -x;
				}
			}
			
			// 수도꼭지를 열거나 잠그기
			else {
				int i = Integer.valueOf(st.nextToken())-1;
				A[i] *= -1;
				sum += A[i];
			}

			// 조작 후에 1분동안 담기는 물의 양 출력
			bw.write(Long.toString(sum));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class