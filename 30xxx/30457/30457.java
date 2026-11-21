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

		// 학생의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 학생들의 키 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[1001];
		
		for(int i=1;i<=N;i++) {
			A[Integer.valueOf(st.nextToken())]++;
		}
		
		// 최대 참가 가능한 학생의 수 계산 (2팀으로 나누니 같은키가 최대 2명까지)
		int max=0;
		for(int i=1;i<=1000;i++) {
			max += Math.min(2, A[i]);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class