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
		
		// 삼각형의 크기 N
		int N = Integer.valueOf(br.readLine());
		
		// 수의 합이 최대가 되는 경로 계산
		int[][] triangle = new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=1;j<=i;j++) {
				triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
				triangle[i][j] += Integer.valueOf(st.nextToken());
			}
		}
		
		int max=0;
		for(int val:triangle[N]) {
			if(max<val) {
				max=val;
			}
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class