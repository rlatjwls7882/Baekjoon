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
		
		// 존재하는 버스의 개수 N, 이용하는 버스의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 창영이가 이용하는 버스
		st = new StringTokenizer(br.readLine());
		int before = Integer.valueOf(st.nextToken())-1;
		
		// 환승요금
		int[][] A = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer bus = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				A[i][j] = Integer.valueOf(bus.nextToken());
			}
		}
		
		// 환승 요금의 총합 계산
		int fee=0;
		while(M-->1) {
			int cur = Integer.valueOf(st.nextToken())-1;
			fee += A[before][cur];
			before = cur;
		}
		
		bw.write(Integer.toString(fee));
		
		bw.close();
	} // end of main()
} // end of Main class