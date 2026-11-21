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
		
		// 현재 피로도 P, 장신구의 개수 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		// 장신구
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(A);
		
		// 제작할 수 있는 장신구의 수 계산
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(P>=200) {
				break;
			}
			cnt++;
			P += A[i];
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class