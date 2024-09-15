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

		// 표의 크기 N, 합을 구하는 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 범위의 누적합 계산
		int[][] sum = new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				sum[i][j] = Integer.valueOf(st.nextToken())
						+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
			}
		}
		
		// (x1, y1)~(x2, y2)의 합 계산
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			
			int result = sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1];
			
			bw.write(Integer.toString(result));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class